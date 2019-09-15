package com.space.repository;

import com.space.model.Ship;
import org.springframework.data.jpa.repository.JpaRepository;

// хранилище Ship JPA (видит сущность Ship (model))
public interface ShipRepository extends JpaRepository<Ship, Long> {
}
