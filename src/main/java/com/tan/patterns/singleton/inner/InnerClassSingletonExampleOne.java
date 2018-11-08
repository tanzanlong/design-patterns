package com.tan.patterns.singleton.inner;

/**静态内部类可确保线程安全
 * @author Administrator
 *
 */
public class InnerClassSingletonExampleOne {
    
    private InnerClassSingletonExampleOne() {}

    public static InnerClassSingletonExampleOne getInstance() {
      return HelperHolder.INSTANCE;
    }

    /**
     * 提供懒加载的单例
     */
    private static class HelperHolder {
      private static final InnerClassSingletonExampleOne INSTANCE =
          new InnerClassSingletonExampleOne();
    }
}
