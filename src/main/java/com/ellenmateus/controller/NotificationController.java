package com.ellenmateus.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ellenmateus.dto.ScheduleNotificationDto;
import com.ellenmateus.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
	
	private NotificationService notificationService;
	
	
	
	
	public NotificationController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}




	@PostMapping
	public ResponseEntity<Void> scheduleNotification(@RequestBody ScheduleNotificationDto dto){
		notificationService.scheduleNotification(dto);
		
		return ResponseEntity.accepted().build();
	}

	
}
