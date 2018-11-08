package com.tan.patterns.singleton.lazily;

/**
 * 懒汉模式 该单例模式在低并发的情况下尚不会出现问题， 若系统压力增大， 并发量增加时则可能 在内存中出现多个实例， 破坏了最初的预期。 为什么会出现这种情况呢？ 如一个线程A执行
 * 到singleton = new Singleton()， 但还没有获得对象（ 对象初始化是需要时间的） ， 第二个线程 B也在执行， 执行到（ singleton == null） 判断，
 * 那么线程B获得判断条件也是为真， 于是继续 运行下去， 线程A获得了一个对象， 线程B也获得了一个对象， 在内存中就出现两个对象！
 * 
 * @author Administrator
 *
 */
public class LazilySingletonExampleOne {
    private static LazilySingletonExampleOne instance;

    private LazilySingletonExampleOne() {
      //防止通过反射实例化对象
      if (instance == null) {
        instance = this;
      } else {
        throw new IllegalStateException("Already initialized.");
      }
    }

    /**
     * 只在第一次调用的时候创建对象
     */
    public static synchronized LazilySingletonExampleOne getInstance() {
      if (instance == null) {
        instance = new LazilySingletonExampleOne();
      }

      return instance;
    }
}
