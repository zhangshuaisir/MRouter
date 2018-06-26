package core.zs.router;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import core.zs.routeannotation.Route;
import core.zs.routeapi.MRouter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.startRouteBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MRouter.startActivity(MainActivity.this, "/core/zs/route/RouteActivity", null);
            }
        });
    }
}
