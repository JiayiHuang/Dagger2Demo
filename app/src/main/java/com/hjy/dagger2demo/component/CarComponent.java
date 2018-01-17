package com.hjy.dagger2demo.component;

import com.hjy.dagger2demo.bean.Car;
import com.hjy.dagger2demo.module.CarModule;
import com.hjy.dagger2demo.scope.CarScope;

import dagger.Component;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/16/17:36
 *     desc   : 用来连接 Module 和 Car 的中介
 *     version: 当前版本号
 * </pre>
 */
@Component(modules = CarModule.class)// 指定依赖管理提供者
/*
 Component 这个注解只能用于接口或者抽象类。将代码改成下面，输出也是一样的。
 @Component(modules = CarModule.class)
 public abstract class CarComponent {
    public abstract void inject(Car car);
 }
*/
@CarScope
public interface CarComponent {
    void inject(Car car);
}
/**
 * 关于注解：
 * 1. 不是所有注解都用到了反射，只有@Retention(RUNTIME)才可能会用到反射。
 * 2. 自定义注解都需要注解处理器来处理的，不然你随便定义一个注解，谁能明白？就像dagger.internal.codegen.ComponentProcessor的ComponentProcessor类一样，处理@Component注解。
 */