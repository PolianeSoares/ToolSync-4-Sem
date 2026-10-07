package com.toolsync.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class ItemPedidoEntity {
    // Atributos da tabela 'item_pedido'
    @Id 
    private int            idItemPedido;
    private int            quantidade;
    private double         precoUnitario;
    private double         subtotal;
    private ProdutoEntity  produto;

}
