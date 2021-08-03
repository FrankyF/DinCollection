package com.din.dincollection.utils;

public class DbUtil {

    private static volatile DbUtil mInstance;
    private DbUtil() {
    }

    public static DbUtil getInstance() {
        if(mInstance==null){
            synchronized (DbUtil.class){
                if(mInstance==null){
                    mInstance =new DbUtil();
                }
            }
        }

        return mInstance;
    }


}
