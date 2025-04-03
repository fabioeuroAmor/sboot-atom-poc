package br.gov.cnpq.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SolrDocument(collection = "pais")
//@Document(indexName = "institutions", writeTypeHint = WriteTypeHint.TRUE)
//@Setting(shards = 1, replicas = 0)
public class Pais {

    @Id
    @Indexed(name = "idPais", type = "string")
    private String idPais;

    @Indexed(name = "nome", type = "string")
    private String nome;

    @Indexed(name = "codigo", type = "string")
    private String codigo;
}
