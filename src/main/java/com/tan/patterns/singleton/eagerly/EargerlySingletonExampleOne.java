package com.tan.patterns.singleton.eagerly;

/**静态实例可确保线程安全
 * @author Administrator
 *
 */
public class EargerlySingletonExampleOne {
    /**
     * 构造器私有，没有程序可以初始实例
     */
    private EargerlySingletonExampleOne() {}

    /**
     * 静态初始类实例.
     */
    private static final EargerlySingletonExampleOne INSTANCE = new EargerlySingletonExampleOne();

    /**
     * 获取实例
     *
     * @return 单例.
     */
    public static EargerlySingletonExampleOne getInstance() {
      return INSTANCE;
    }
}
