package com.toolsync.demo.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class PedidoEntity {
    // Atributos da tabela 'pedido'
    @Id 
    private int                   idPedido;
    private LocalDateTime         dataPedido;
    private String                status;
    private double                valorTotal;
    private ClienteEntity          cliente;
    private VendedorEntity         vendedor;
    private List<ItemPedidoEntity> itens;
    private PagamentoEntity        pagamento;

}
