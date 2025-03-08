package com.cadastro.usuario.repositories.userRepository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cadastro.usuario.model.user.Usuario;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
    // BUSCA POR CPF
    Optional <Usuario> findByCpf(String cpf);

    // BUSCA POR EMAIL
    Optional <Usuario> findByEmail(String email);
}
