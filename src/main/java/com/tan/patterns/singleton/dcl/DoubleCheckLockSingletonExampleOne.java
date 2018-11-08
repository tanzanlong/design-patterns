package com.tan.patterns.singleton.dcl;

public class DoubleCheckLockSingletonExampleOne {
    private static volatile DoubleCheckLockSingletonExampleOne instance;

    /**
     * 构造器私有 防止客户端创建对象 .
     */
    private DoubleCheckLockSingletonExampleOne() {
      // 防止反射调用创建对象 
      if (instance != null) {
        throw new IllegalStateException("Already initialized.");
      }
    }

    /**
     * Public accessor.
     *
     * @return an instance of the class.
     */
    public static DoubleCheckLockSingletonExampleOne getInstance() {
        //本地变量的性能能提升25%，所以这里把它赋值给一个本地变量
        DoubleCheckLockSingletonExampleOne result = instance;
      // 判断单例是否已初始化完成，完成则直接返回实例  
      if (result == null) {
          //如果没有初始化，我们不确定在同一时刻是否已有其他线程已完成了它的初始化，所以我们通过锁定对象来获得排他锁。
        synchronized (DoubleCheckLockSingletonExampleOne.class) {
          //再次将实例赋给本地变量，在这个时间段内是否已经线程已完成实例化。如果已有实例，直接返回已创建的实例。
          result = instance;
          if (result == null) {
            // 如果没有创建实例我们可以线程安全的排他的 创建实例
            instance = result = new DoubleCheckLockSingletonExampleOne();
          }
        }
      }
      return result;
    }
}
