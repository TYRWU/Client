package com.hechuangwu.client;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


    }

    public void aidl(View view) {
        startActivity( new Intent( this, AIDLActivity.class ) );
    }

    public void messenger(View view) {
        startActivity( new Intent( this, MessengerActivity.class ) );
    }

    public void socket(View view) {
        startActivity( new Intent( this, SocketActivity.class ) );
    }

    public void binderPoll(View view) {
        startActivity( new Intent( this, BinderPoolActivity.class ) );
    }
}
