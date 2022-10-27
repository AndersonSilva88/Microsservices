package com.anderson.ClienteServer.domain;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Document(collation = "cliente")
@Getter
@Setter
@AllArgsConstructor
@Builder
@Schema(name = "Cliente", description = "Cliente")
public class Cliente {

    @Id
    @Schema(description = "Identificador único")
    private String id;

    @NotNull
    @Size(min = 1, max = 50)
    @Schema(description = "Nome", minLength = 1, maxLength = 50, nullable = false)
    private String nome;

    @NotNull
    @Indexed(unique = true, background = true)
    @Schema(description = "CPF", nullable = false)
    private Long cpf;

    @NotNull
    @Schema(description = "Telefone", nullable = false)
    private Long telefone;

    @NotNull
    @Size(min = 1, max = 50)
    @Indexed(unique = true, background = true)
    @Schema(description = "Email", minLength = 1, maxLength = 50, nullable = false)
    @Pattern(regexp = ".+@.+\\..+", message = "Email inválido")
    private String email;

    @NotNull
    @Size(min = 1, max = 50)
    @Schema(description = "Endereco", minLength = 1, maxLength = 50, nullable = false)
    private String endereco;

    @NotNull
    @Schema(description = "Numero redidencial", nullable = false)
    private Integer numero;

    @NotNull
    @Size(min = 1, max = 50)
    @Schema(description = "Cidade", minLength = 1, maxLength = 50, nullable = false)
    private String cidade;

    @NotNull
    @Size(min = 1, max = 50)
    @Schema(description = "Estado", minLength = 1, maxLength = 50, nullable = false)
    private String estado;
}
