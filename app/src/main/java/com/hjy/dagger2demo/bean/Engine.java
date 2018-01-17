package com.hjy.dagger2demo.bean;

import android.util.Log;

import com.hjy.dagger2demo.constant.Config;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/16/16:51
 *     desc   : 依赖提供方：造车所需要的部件。 发动机
 *     version: 当前版本号
 * </pre>
 */
public class Engine {

    public Engine() {
        Log.d(Config.TAG,"new Engine()");
    }
}
