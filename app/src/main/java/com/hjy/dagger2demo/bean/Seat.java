package com.hjy.dagger2demo.bean;

import android.util.Log;

import com.hjy.dagger2demo.constant.Config;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/16/16:51
 *     desc   : 依赖提供方：造车所需要的部件。 车座
 *     version: 当前版本号
 * </pre>
 */
public class Seat {
    public Seat() {
        Log.d(Config.TAG, "new Seat()");
    }

    /**
     * 有车座装饰的车座
     */
    public Seat(String decoration) {
        Log.d(Config.TAG, "new Seat(" + decoration + ")");
    }

    /**
     * 皮革做的车座
     */
    public Seat(Leather leather) {
        Log.d(Config.TAG, "new Seat(Leather)");
    }
}