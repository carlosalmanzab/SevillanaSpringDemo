
package com.sevillana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sevillana.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByUserName(String userName);
}
