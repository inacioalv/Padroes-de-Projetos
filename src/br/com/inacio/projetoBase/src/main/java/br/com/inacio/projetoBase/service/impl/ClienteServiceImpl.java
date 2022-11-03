package br.com.inacio.projetoBase.service.impl;

import br.com.inacio.projetoBase.model.Cliente;
import br.com.inacio.projetoBase.model.Endereco;
import br.com.inacio.projetoBase.repository.ClienteReposioty;
import br.com.inacio.projetoBase.repository.EnderecoRepository;
import br.com.inacio.projetoBase.service.ClienteService;
import br.com.inacio.projetoBase.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

	// Singleton: Injetar os componentes do Spring com @Autowired
	@Autowired
	private ClienteReposioty clienteReposioty;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;

	// Strategy: Implementar os métodos definidos na intefarce.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteReposioty.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteReposioty.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarCliente(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> findById = clienteReposioty.findById(id);
		if (!findById.isPresent()) {
			new RuntimeException();
		}
		salvarCliente(cliente);
	}

	@Override
	public void deletar(Long id) {
		clienteReposioty.deleteById(id);
	}

	private void salvarCliente(Cliente cliente) {
		// Verificar se o Endereço do cliente já existe (pelo CEP)
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com ViaCEP e persistir o retorno.
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		// Inserir Cliente, vinculado o Endereço (novo ou existente).
		clienteReposioty.save(cliente);
	}
}
