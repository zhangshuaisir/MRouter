package core.zs.router;

import android.app.Application;

import core.zs.routeapi.MRouter;

/**
 * Created by ZhangShuai on 2018/6/26.
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MRouter.init(this);
    }
}
