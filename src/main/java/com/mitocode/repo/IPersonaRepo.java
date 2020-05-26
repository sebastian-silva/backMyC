package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mitocode.model.Persona;



public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
		
	@Query(value = "call verPersonas(:identificador)", nativeQuery = true)
	List<String> findAllActiveUsersNative(@Param("identificador") int identificador);

}
