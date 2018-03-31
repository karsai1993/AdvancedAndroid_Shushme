package com.example.android.shushme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Laci on 31/03/2018.
 */

public class GeofenceRequestBroadcastReceiver extends BroadcastReceiver {

    private static final String LOG_TAG = GeofenceRequestBroadcastReceiver.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(LOG_TAG, "received");
    }
}
