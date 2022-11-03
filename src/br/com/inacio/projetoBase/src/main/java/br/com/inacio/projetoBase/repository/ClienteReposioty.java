package br.com.inacio.projetoBase.repository;

import br.com.inacio.projetoBase.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteReposioty extends CrudRepository<Cliente,Long> {
}
