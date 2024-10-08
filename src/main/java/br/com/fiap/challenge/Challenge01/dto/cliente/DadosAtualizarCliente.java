package br.com.fiap.challenge.Challenge01.dto.cliente;

import br.com.fiap.challenge.Challenge01.dto.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record DadosAtualizarCliente(
        String nome,
        @NotBlank
        @Pattern(regexp = "\\d{11}", message = "CPF inválido, deve conter 11 dígitos")
        String cpf,
        String telefone,
        LocalDate dataNascimento,
        String nmrCarteiraOdonto,
        String fotoCliente,
        DadosEndereco endereco
) {
}
