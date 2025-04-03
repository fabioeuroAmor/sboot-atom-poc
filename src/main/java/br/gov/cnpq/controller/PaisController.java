package br.gov.cnpq.controller;


import br.gov.cnpq.entity.Pais;
import br.gov.cnpq.service.PaisService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/pais")
public class PaisController {

    @Autowired
    private PaisService paisService;

    @GetMapping("/pais/seach")
    public List<Pais> seachPaises(@RequestParam(value = "pagina", required = true) Integer pagina, @RequestParam(value = "tamanho", required = true) Integer tamanho){
       paisService.encontrarTodos(pagina.intValue(),tamanho.intValue());
        return null;
    }

}
