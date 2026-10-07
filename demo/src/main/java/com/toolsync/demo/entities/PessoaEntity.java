package com.toolsync.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class PessoaEntity {
    // Atributos baseados na tabela 'pessoa'
    @Id  
    private int    idPessoa;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;


}
