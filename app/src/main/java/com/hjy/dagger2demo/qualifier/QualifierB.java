package com.hjy.dagger2demo.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * <pre>
 *     author : HJY
 *     time   : 2018/01/17/11:40
 *     desc   : 文件描述
 *     version: 当前版本号
 * </pre>
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface QualifierB {
}
