package com.dms.sergeymikhailov.dms_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dms.sergeymikhailov.dms_android.manager.VISLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAuth(View view)
    {
        VISLoader visLoader = new VISLoader();
        visLoader.authNSS("1","2");
//        Realm.init(this);
    }
}
