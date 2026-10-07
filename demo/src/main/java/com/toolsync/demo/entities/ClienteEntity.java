package com.toolsync.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity 
public class ClienteEntity extends PessoaEntity {
    private List<PedidoEntity> historicoPedidos;

   
}
