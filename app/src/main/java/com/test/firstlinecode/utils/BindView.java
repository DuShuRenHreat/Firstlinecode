package com.test.firstlinecode.utils;

import android.app.Activity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by asdf on 2017/4/18.
 */

public class BindView {
    public static void load(Activity activity){
        Class<?> tClass = activity.getClass();
        Field[] fields = tClass.getDeclaredFields();
        for(Field f : fields){
            InitID init = f.getAnnotation(InitID.class);
            if(init != null){
                int id = init.value();
                if(id != -1){
                    try {
                        Method method = tClass.getMethod("findViewById",int.class);
                        Object obj = method.invoke(activity,id);
                        f.setAccessible(true);
                        f.set(activity,obj);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (NoSuchMethodException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
