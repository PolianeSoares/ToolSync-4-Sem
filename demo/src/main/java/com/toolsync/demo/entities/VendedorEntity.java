package com.toolsync.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;

@Entity 
public class VendedorEntity extends PessoaEntity {
    private String cargo;
    private List<PedidoEntity> pedidosRealizados;
   
}
