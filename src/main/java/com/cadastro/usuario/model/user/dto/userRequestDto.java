package com.cadastro.usuario.model.user.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class userRequestDto {
    private String name;
    private String cpf;
    private String email;
    private String password;
}
