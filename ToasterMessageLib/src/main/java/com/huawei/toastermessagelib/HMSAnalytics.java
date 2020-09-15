package com.huawei.toastermessagelib;

import android.content.Context;
import android.os.Bundle;

import com.huawei.hms.analytics.HiAnalytics;
import com.huawei.hms.analytics.HiAnalyticsInstance;
import com.huawei.hms.analytics.HiAnalyticsTools;

public class HMSAnalytics {

    public void HMSAnalytics(Context context){

        //Enable SDK log recording.
        HiAnalyticsTools.enableLog();
        HiAnalyticsInstance instance = HiAnalytics.getInstance(context);
        // Or use the context for initialization.
        // Context context = this.getApplicationContext();
        // HiAnalyticsInstance instance = HiAnalytics.getInstance(context);
        // instance.setUserProfile("userKey","value");
    }

    public static void HMSCustomEvent(HiAnalyticsInstance instance , Bundle mBundle){

        //Add triggers of the custom event in proper positions of the code.
        Bundle bundle = mBundle;
        bundle.putString("FromToasterLevel","high");
        bundle.putString("ToastLevel","1-1");
        bundle.putString("ToastTime","20190520-08");
        instance.onEvent("ToasterMessage", bundle);
/*//Add triggers of predefined events in proper positions of the code.
        Bundle bundle_pre = new Bundle();
        bundle_pre.putString(PRODUCTID, "item_ID");
        bundle_pre.putString(PRODUCTNAME, "name");
        bundle_pre.putString(CATEGORY, "category");
        bundle_pre.putLong(QUANTITY, 100L);
        bundle_pre.putDouble(PRICE, 10.01);
        bundle_pre.putDouble(REVENUE, 10);
        bundle_pre.putString(CURRNAME, "currency");
        bundle_pre.putString(PLACEID, "location_ID");
        instance.onEvent(ADDPRODUCT2WISHLIST, bundle_pre);*/
    }


}
