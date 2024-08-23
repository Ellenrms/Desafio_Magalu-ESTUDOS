package com.ellenmateus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ellenmateus.entity.Notification;

public interface NotificationRepository extends JpaRepository <Notification , Long>{

}
