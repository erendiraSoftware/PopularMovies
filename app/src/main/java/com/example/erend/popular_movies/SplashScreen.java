package com.example.erend.popular_movies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        final Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    sleep(2500);
                }catch (InterruptedException e){

                }finally {
                    Intent intent = new Intent(SplashScreen.this,Main.class);
                    startActivity(intent);
                    finish();
                }
                super.run();
            }
        };
        thread.start();

    }
}
