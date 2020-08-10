package com.example.toy1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent= new Intent(SplashActivity.this,MainActivity.class);
            startActivity(intent);
            finish(); // 현재 액티비티 파괴
        }
    }, 3000); //3초정도 딜레이를 준후 시작

}
}
