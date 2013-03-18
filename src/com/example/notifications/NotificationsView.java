package com.example.notifications;

import android.app.Activity;
import android.app.NotificationManager;
import android.os.Bundle;

public class NotificationsView extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        
        NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        
        nm.cancel(getIntent().getExtras().getInt("notificationID"));
    }
}
