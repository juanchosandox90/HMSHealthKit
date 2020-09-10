package com.hms.healthkit.example

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.huawei.hms.hihealth.data.ActivityRecord

class ActivityRecordsMonitorReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // an Intent broadcast.
        var msg = ""
        val activityRecord = ActivityRecord.extract(intent)
        msg += "receiver monitor ActivityRecord happen " + intent.action
        if (activityRecord != null) {
            msg += "\tActivityRecord info is：  $activityRecord"
        }
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}