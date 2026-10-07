package com.toolsync.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class ProdutoEntity {
    // Atributos da tabela 'produto'
    @Id 
    private int             idProduto;
    private String          nome;
    private String          descricao;
    private double          preco;
    private int             estoqueAtual;
    private String          unidadeMedida;
    private CategoriaEntity categoria;

}
