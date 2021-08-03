package com.din.dincollection.utils;

public class CommonIntentShareUtil {
    private volatile  static  CommonIntentShareUtil mInstance;
    private CommonIntentShareUtil() {
    }
    public static CommonIntentShareUtil getInstance(){
        if(mInstance==null){
            synchronized (CommonIntentShareUtil.class){
                if(mInstance==null){
                    mInstance = new CommonIntentShareUtil();
                }
            }
        }
        return mInstance;
    }
}
