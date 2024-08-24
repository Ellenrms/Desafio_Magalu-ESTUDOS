package com.ellenmateus.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ellenmateus.entity.Notification;
import com.ellenmateus.entity.Status;

public interface NotificationRepository extends JpaRepository <Notification , Long>{
	List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
	
		
	}

