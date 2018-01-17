package com.hjy.dagger2demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.hjy.dagger2demo.bean.Car;
import com.hjy.dagger2demo.constant.Config;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createCar();
    }

    private void createCar() {
        // 构造方法式注入，还有setXxx方法注入、接口注入
        Car car = new Car();
        Log.d(Config.TAG, "new Car()");
    }
}
