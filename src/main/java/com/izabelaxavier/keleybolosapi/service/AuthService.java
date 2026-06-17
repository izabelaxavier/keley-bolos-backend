package com.izabelaxavier.keleybolosapi.service;

import com.izabelaxavier.keleybolosapi.dto.LoginDTO;
import com.izabelaxavier.keleybolosapi.dto.LoginResponseDTO;
import com.izabelaxavier.keleybolosapi.entity.User;
import com.izabelaxavier.keleybolosapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.izabelaxavier.keleybolosapi.exception.UsuarioNaoEncontradoException;
import com.izabelaxavier.keleybolosapi.exception.SenhaInvalidaException;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public LoginResponseDTO login(LoginDTO dto) {

        User usuario = userRepository
                .findByEmail(dto.getEmail())
                .orElseThrow(() ->
                        new UsuarioNaoEncontradoException(
                                "Usuário não encontrado"
                        ));

        if (!usuario.getSenha().equals(dto.getSenha())) {
            throw new SenhaInvalidaException(
                    "Senha inválida"
            );
        }

        return new LoginResponseDTO(
                "Login realizado com sucesso"
        );
    }
}