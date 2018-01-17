package com.hjy.dagger2demo.module;

import com.hjy.dagger2demo.bean.Engine;
import com.hjy.dagger2demo.bean.Leather;
import com.hjy.dagger2demo.bean.Seat;
import com.hjy.dagger2demo.bean.Wheel;
import com.hjy.dagger2demo.qualifier.QualifierA;
import com.hjy.dagger2demo.qualifier.QualifierB;
import com.hjy.dagger2demo.scope.CarScope;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/16/17:31
 *     desc   : 管理并提供依赖; 用来管理 Car 所需要的 Module（基础组件、依赖），注意命名规范
 *     version: 当前版本号
 * </pre>
 */
@Module
public class CarModule {
    /**
     * 该方法提供依赖，Engine；
     * 注意命名规范，一般根据返回值类型来确定 @Inject 注解的依赖匹配，如果有多个相同的返回值类型就需要使用 @Qualifier 注解来指定
     */
    @CarScope
    @Provides
    public Engine provideEngine(){
        return new Engine();
    }
/*
    */
/**
     * 提供依赖的对象有多个构造器时，就单独调用其构造方法
     * @return
     *//*

    @Provides
    public Seat provideSeat(){
//        return new Seat();
        return new Seat("来个车套");
    }
*/

    @QualifierA
    @Provides
    public Seat provideSeatA(){
        return  new Seat("QualifierA");
    }
    @QualifierB
    @Provides
    public Seat provideSeatB(){
        return  new Seat("QualifierB");
    }
    /**
     * 如果存在依赖链的话，就需要如下的创建方式，Seat 依赖 Leather
     */
    @Provides
    public Seat provideSeat(Leather leather){
        return new Seat(leather);
    }
    @Provides
    public Wheel provideWheel(){
        return new Wheel();
    }

    @Provides
    public Leather provideLeather(){
        return new Leather();
    }
}
