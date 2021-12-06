package com.example.mealsplan;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 2000); //시간 설정 3초 뒤에 자동으로 넘어가는


    }

    private class splashhandler implements Runnable {
        @Override
        public void run() {
            startActivity(new Intent(getApplication(), InputDataActivity.class));
            //Intent 화면 전환을 해서 MainActivity
            SplashActivity.this.finish(); //로딩페이지 메모리 값에서 알아서 제거
        }
    }

    @Override //진입 때 뒤로 가기 버튼 누르면 안 됨 //// 선언만
    public void onBackPressed() {

    }




}//end class
