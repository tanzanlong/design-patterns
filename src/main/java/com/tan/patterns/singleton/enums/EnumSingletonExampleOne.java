package com.tan.patterns.singleton.enums;

/**基于枚举的单例实现。此实现是线程安全的
 * @author Administrator
 *
 */
public enum EnumSingletonExampleOne {
    INSTANCE;

    @Override
    public String toString() {
        return getDeclaringClass().getCanonicalName() + "@" + hashCode();
    }
}
