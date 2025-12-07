package com.raystudio.ios17launcher.service

import android.service.notification.NotificationListenerService
import android.service.notification.StatusBarNotification

/**
 * Service to listen for notifications for the Notification Center
 */
class NotificationListenerService : NotificationListenerService() {

    override fun onNotificationPosted(sbn: StatusBarNotification?) {
        super.onNotificationPosted(sbn)
        // Handle new notification
    }

    override fun onNotificationRemoved(sbn: StatusBarNotification?) {
        super.onNotificationRemoved(sbn)
        // Handle notification removal
    }
}
