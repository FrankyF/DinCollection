package com.din.dincollection.utils;

public class HotfixHelper {
    private static volatile HotfixHelper mInstance;
    private HotfixHelper() {
    }

    public static HotfixHelper getInstance() {
        if (mInstance == null) {
            synchronized (HotfixHelper.class) {
                if (mInstance == null) {
                    mInstance = new HotfixHelper();
                }
            }

        }
        return mInstance;
    }
    public void installHotFixPatch(){

    }

}
