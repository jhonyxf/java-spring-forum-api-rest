package br.com.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	//Buscando o atributo nome dentro da classe curso
	List<Topico> findByCursoNome(String nomeCurso);
	
	/*Caso queira fazer a consulta sem ser o do Spring
	 * @Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
	 List<Topico> retornarNomeDoCurso(@param("nomeCurso") String nomeCurso);
	 * */
	
	

}
