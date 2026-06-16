package com.izabelaxavier.keleybolosapi.controller;

import com.izabelaxavier.keleybolosapi.dto.LoginDTO;
import com.izabelaxavier.keleybolosapi.dto.LoginResponseDTO;
import com.izabelaxavier.keleybolosapi.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(
            @RequestBody LoginDTO dto) {

        return ResponseEntity.ok(
                authService.login(dto)
        );
    }
}