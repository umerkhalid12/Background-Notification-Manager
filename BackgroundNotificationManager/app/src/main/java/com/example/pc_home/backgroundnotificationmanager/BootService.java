package com.example.pc_home.backgroundnotificationmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootService extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(Intent.ACTION_BOOT_COMPLETED)){
            Toast.makeText(context, "Boot Completed!",Toast.LENGTH_SHORT).show();
            context.startService(new Intent(context,MyService.class));
        }
    }
}
