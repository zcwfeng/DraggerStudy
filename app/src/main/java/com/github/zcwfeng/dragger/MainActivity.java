package com.github.zcwfeng.dragger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.github.zcwfeng.dragger.component.ActivityComponent;
import com.github.zcwfeng.dragger.component.DaggerActivityComponent;
import com.github.zcwfeng.dragger.model.ActivityModule;
import com.github.zcwfeng.dragger.model.ApplicationModule;

public class MainActivity extends AppCompatActivity {

    private ActivityComponent component;

    //    @Inject
//    ToastHelper toastHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.component = DaggerActivityComponent.builder().applicationComponent(((DraggerApplication) getApplication()).getComponent())
                .activityModule(new ActivityModule(this)).build();
        this.component.injectActivity(this);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            helloDagger2(view);
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        });


    }

    public void helloDagger2(View v) {
//        toastHelper.showToast(this, "Dagger 2");
//        toastHelper.show(this);
        this.component.getToastHelper().showToast(this, "Dagger 2 Demo");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
