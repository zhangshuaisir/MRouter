package core.zs.routeapi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by ZhangShuai on 2018/6/26.
 */

public class MRouter {

    public static HashMap<String, Class<?>> activityMap = new HashMap<>();

    public static void init(Context context) {
        try {
            Class clz = Class.forName("core.zs.route.RouteMap");
            if (clz != null) {
                Method initMapMethod = clz.getMethod("initActivityMap", HashMap.class);
                initMapMethod.invoke(null, activityMap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void startActivity(Context context, String url, Bundle bundle) {
        if (context == null || url == null) {
            return;
        }
        Class atClazz = activityMap.get(url);
        if (atClazz != null) {
            System.out.println(atClazz.getCanonicalName());
            Intent intent = new Intent(context, atClazz);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            context.startActivity(intent);
        }else{
            System.out.println("=====Activity is null.");
        }


    }
}
