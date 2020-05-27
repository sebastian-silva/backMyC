package com.mitocode.repo;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mitocode.model.ModeloImagen;



public interface ICargaImagen extends JpaRepository<ModeloImagen, Long> {
	Optional<ModeloImagen> findByName(String name);
}

