package br.com.gtasistemas.ordem.model;


import java.io.*;
import java.util.*;
import javax.persistence.*;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode

@Entity
@ApiModel(value = "Usuario", description = "Modelo para mostrar detalhes do Usuário ")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 2471765773806278661L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	private String email;
	@org.hibernate.annotations.NaturalId
	private String login;
	private String senha;
        @Temporal(javax.persistence.TemporalType.DATE)
	private Date nascimento;
	private String celular;
        private boolean ativo;
	private String permissao;

}
