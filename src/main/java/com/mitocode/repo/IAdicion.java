package com.mitocode.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.mitocode.model.Adicion;




public interface IAdicion extends JpaRepository<Adicion, Integer> {
		

}

