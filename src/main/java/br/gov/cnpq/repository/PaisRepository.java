package br.gov.cnpq.repository;

import br.gov.cnpq.entity.Pais;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

//@Repository
public interface PaisRepository extends SolrCrudRepository<Pais,String> {

    List<Pais> findByName(String name);
    List<Pais> findByCodigoContaining(String codigo);

    @Query("name:*?0* OR codigo:*?0*")
    List<Pais> search(String search);

    @Query("name:*?0* OR codigo:*?0*")
    Page<Pais> search(String search, Pageable pageable);

    @Query("name:*?0*^2 OR codigo:*?0*")
    Page<Pais> searchWhithBoots(String search, Pageable pageable);


}
