package com.hjy.dagger2demo.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/17/11:39
 *     desc   : @Qualifier: 用于自定义注解，如同 Java 提供的几种基本元注解一样用来标记注解类。
 * 我们在使用 @Module 来标记 依赖提供方的类时，具体提供依赖的方法名可能是随便定义的（命名规范，provideXxx）。Dagger2 是根据返回值类型来确定方法具体为那个属性提供依赖。但是如果有多个相同返回值的 依赖提供方法时，Dagger2 就会报错。此时，就需要 @Qualifier 注解，它就是为了解决这个问题，我们使用 @Qualifier 来定义自己的注解，然后通过自定义的注解去标注提供依赖的方法和依赖需求方（也就是被 @Inject 标记的属性变量），这样 Dagger2 就知道为谁提供依赖了。
 * 一个精简的定义：但类型不足以鉴别一个依赖时，我们就可以使用这个注解标示。
 *     version: 当前版本号
 * </pre>
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface QualifierA {
}
