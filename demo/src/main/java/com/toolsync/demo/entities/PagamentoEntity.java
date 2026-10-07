package com.toolsync.demo.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class PagamentoEntity {
    // Atributos da tabela 'pagamento'
    @Id 
    private int           idPagamento;
    private String        formaPagamento;
    private double        valor;
    private LocalDateTime dataPagamento;
    private String        status;
    private PedidoEntity  pedido;

    
}
