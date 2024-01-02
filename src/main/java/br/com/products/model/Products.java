package br.com.products.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
public class Products {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;

    private String descricao;

    private int sku;

    private LocalDateTime data_criacao;

    private  LocalDateTime data_modificacao;

    private float valor_unitario;

    private int estoque;

    private boolean ativo;


}
