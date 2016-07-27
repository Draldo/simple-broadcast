package com.example.draldo.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BatteryCharging extends BroadcastReceiver {
    public BatteryCharging() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Toast.makeText(context,"Power connection changed " + action,Toast.LENGTH_SHORT).show();
    }
}
