package br.gov.cnpq.service;

import br.gov.cnpq.entity.Pais;
import br.gov.cnpq.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


@Component
public class PaisService {

    @Autowired
    private PaisRepository paisRepository;


    public Page<Pais> encontrarTodos(int pagina, int tamanho) {
        Pageable pageable = PageRequest.of(pagina, tamanho);
        return paisRepository.findAll(pageable);
    }



}
