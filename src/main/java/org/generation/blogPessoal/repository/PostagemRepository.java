package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	/**
	 * Metod Query
	 */
	public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);	

	// Estamos sobreescrevendo o metodo findAll para que possamos procurar por descricao -> coluna de tema
}
