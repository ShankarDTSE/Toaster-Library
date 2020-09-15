package com.huawei.toastermessagelib;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.huawei.agconnect.crash.AGConnectCrash;

public class HMSCrash {

    public static void crashTest(Context context, String message) {

        AGConnectCrash.getInstance().testIt(context);

    }

    public static void crashEnable() {

        AGConnectCrash.getInstance().enableCrashCollection(true);

    }


    public static void crashSetUserId(String userId) {

        AGConnectCrash.getInstance().setUserId(userId);


    }

    public static void crashLog(int WARN, String message) {
        AGConnectCrash.getInstance().log(WARN, message);
    }

    public static void crashSetCustomKey(String customMessage, String message) {
        // Add a key-value pair of the string type.
        AGConnectCrash.getInstance().setCustomKey(customMessage, message);
    }


}
