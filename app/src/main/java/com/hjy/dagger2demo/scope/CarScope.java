package com.hjy.dagger2demo.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/17/13:53
 *     desc   : 同样用于自定义注解，通过自定义来限定注解的作用域，实现局部单例
 *     version: 当前版本号
 * </pre>
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CarScope {
}
