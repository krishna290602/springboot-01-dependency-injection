package com.springboot.sb_01_dependency_injection.Implementations;

import com.springboot.sb_01_dependency_injection.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SmsNotif")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("SMS Notification with Message: " + message);
    }
}
