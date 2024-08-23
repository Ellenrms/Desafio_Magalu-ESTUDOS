package com.ellenmateus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ellenmateus.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {

}
