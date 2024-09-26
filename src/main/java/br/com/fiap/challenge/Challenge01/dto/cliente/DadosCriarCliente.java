package br.com.fiap.challenge.Challenge01.dto.cliente;

import br.com.fiap.challenge.Challenge01.dto.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record DadosCriarCliente(
        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @NotBlank
        @Pattern(regexp = "\\d{11}", message = "CPF inválido, deve conter 11 dígitos")
        String cpf,

        @NotBlank(message = "Telefone é obrigatório")
        String telefone,

        @NotBlank(message = "Data de nascimento é obrigatória")
        String dataNascimento,

        @NotBlank(message = "Número da Carteirinha Odonto é obrigatória")
        String nmrCarteiraOdonto,

        @NotNull(message = "Foto do Paciente é obrigatória")
        String fotoCliente,

        @NotNull(message = "Endereço é obrigatório")
        @Valid
        DadosEndereco endereco
) {
}
