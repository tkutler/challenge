package com.toby.DojoNinja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.toby.DojoNinja.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja>findAll();
	
}
