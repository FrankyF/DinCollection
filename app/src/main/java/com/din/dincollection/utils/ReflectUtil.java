package com.din.dincollection.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class ReflectUtil {
    public static volatile ReflectUtil mInstance;

    private ReflectUtil() {
    }

    public static ReflectUtil getInstance() {
        if (mInstance == null) {
            synchronized (ReflectUtil.class) {
                if (mInstance == null) {
                    mInstance = new ReflectUtil();

                }
            }
        }
        return mInstance;
    }

    public Field findField(Object instance, String fieldName) {
        Class<?> clz = instance.getClass();
        while (clz != Object.class) {
            try {
                Field field = clz.getField(fieldName);
                if (field != null)return field;
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            clz = clz.getSuperclass();
        }
        throw new RuntimeException(fieldName + " fieldName not found");
    }


    public Method findMethod(Object instance, String methodName) {
        Class<?> clz = instance.getClass();
        while (clz != Object.class) {
            try {
                Method method = clz.getMethod(methodName);
                if (method != null) return method;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
            clz = clz.getSuperclass();
        }
        throw new RuntimeException(methodName + " methodName not found");
    }


}
