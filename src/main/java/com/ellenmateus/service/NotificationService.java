package com.ellenmateus.service;

import org.springframework.stereotype.Service;

import com.ellenmateus.dto.ScheduleNotificationDto;
import com.ellenmateus.repository.NotificationRepository;

@Service
public class NotificationService {

	private final NotificationRepository notificationRepository;

	public NotificationService(NotificationRepository notificationRepository) {
		this.notificationRepository = notificationRepository;
	}

	public void scheduleNotification(ScheduleNotificationDto dto) {
		notificationRepository.save(dto.toNotification());
	}
}
