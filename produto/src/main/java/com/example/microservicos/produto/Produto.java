package com.example.microservicos.produto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Produto {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer idProduto;

  private String nomeProduto;
  private Integer pesoProduto;

}
