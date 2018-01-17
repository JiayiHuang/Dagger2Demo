package com.hjy.dagger2demo.bean;

import com.hjy.dagger2demo.component.DaggerCarComponent;
import com.hjy.dagger2demo.qualifier.QualifierA;
import com.hjy.dagger2demo.qualifier.QualifierB;

import javax.inject.Inject;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/16/16:54
 *     desc   : 依赖需求方：Car 高层对象，依赖基层组件 Engine 、Seat、 Wheel
 *     version: 当前版本号
 * </pre>
 */
public class Car {
    /*
        private Engine engine;
        private Seat seat;
        private Wheel wheel;
        public Car() {
            engine = new Engine();
            seat = new Seat();
            wheel = new Wheel();
            Log.d(Config.TAG, "new Car()");
        }
    */
    // Inject 标识的属性，不需要主动初始化，它会自动需要依赖。
    @Inject
    Engine engine;
    // 因为 Module#provideEngine() CarComponent 被 自定义的CarScope标注，所以是单例。虽然声明了两个相同类型的属性，但其构造方法只会被调用一次
    @Inject
    Engine engine2;
    @Inject
    Seat seat;
    @Inject
    Wheel wheel;

    @QualifierA
    @Inject
    Seat seatA;
    @QualifierB
    @Inject
    Seat seatB;

    public Car() {
        DaggerCarComponent
                .builder()
                .build()
                .inject(this);
    }
    /*

    注入方式有三种：构造方法注入、setXxx方法注入、接口注入、注解注入
    接口注入：实现接口方法，同样以传参的方式实现注入。
        public interface Injection<T>{
            void inject(T t);
        }
        public class Car implements Injection<Engine>{
            private Engine engine;
            public Car(){}
            public void inject(Engine engine){
                this.engine = engine;
            }
        }
    注解注入: 使用Java注解在编译阶段生成代码实现注入或者是在运行阶段通过反射实现注入。
     如 Dagger2


     */

}
