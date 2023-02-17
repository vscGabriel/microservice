package br.com.gvsc.cadastro.model;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@Data
@Entity
public class VendaProduto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dataVenda;
    private BigDecimal valorTotal;

    @ManyToMany
    List<Produtos> produtosList;
}
