package com.example.draldo.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Connectivity extends BroadcastReceiver {
    public Connectivity() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Wifi change",Toast.LENGTH_SHORT).show();
    }
}
