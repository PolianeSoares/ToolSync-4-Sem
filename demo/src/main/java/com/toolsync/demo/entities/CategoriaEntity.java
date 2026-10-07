package com.toolsync.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class CategoriaEntity {
    // Atributos da tabela 'categoria'
    @Id 
    private int    idCategoria;
    private String nome;
    private String descricao;

   
}
