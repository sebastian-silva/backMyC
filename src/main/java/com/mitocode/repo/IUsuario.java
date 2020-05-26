package com.mitocode.repo;

import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer> {
		
	@Query(value = "call registroUsuario(:correo)", nativeQuery = true)
	int isRegistrado( @Param("correo") String correo );
	
	@Query(value = "call comprobarCorreo(:correo,:clave,@f);", nativeQuery = true)
	int comprobarCorreo( @Param("correo") String correo,@Param("clave") String clave );
}
