package com.huawei.toastermessagelib;

import android.content.Context;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class HMSAdsKit {

    public void HMSAdsKit(Context context){
        HwAds.init(context);

    }

    public static void HMSBannerAds(BannerView bannerView, String slotId,BannerAdSize bannerSize){
        bannerView.setAdId(slotId);
        bannerView.setBannerAdSize(bannerSize);
        // Create an ad request to load an ad.
        AdParam adParam = new AdParam.Builder().build();
        bannerView.loadAd(adParam);
    }
}
