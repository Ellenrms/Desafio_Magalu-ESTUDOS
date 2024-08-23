package com.ellenmateus.dto;

import java.time.LocalDateTime;

import com.ellenmateus.entity.Channel;
import com.ellenmateus.entity.Notification;
import com.ellenmateus.entity.Status;

public record ScheduleNotificationDto(LocalDateTime datetime,
									  String destination,
									  String message,
									  Channel.Values channel) {
	
	public Notification toNotification() {
		return new Notification(
				datetime,
				destination,
				message,
				channel.toChannel(),
				Status.Values.PENDING.toStatus());
	}
}
