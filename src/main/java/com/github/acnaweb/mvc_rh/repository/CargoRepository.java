package com.github.acnaweb.mvc_rh.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.acnaweb.mvc_rh.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
