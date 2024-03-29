package br.com.gvsc.cadastro.model;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @Column(unique = true)
    @NotBlank
    private String email;
    @CPF
    @Column(unique = true)
    private String cpf;
    @NotBlank
    private String senha;

    @OneToMany
    List<Produtos> listaProdutos = new ArrayList<>();
}
