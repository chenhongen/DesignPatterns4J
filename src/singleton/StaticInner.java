package singleton;

public class StaticInner {
	/**
     * 外部类没有static属性, 因此加载本类时不会立即初始化对象
     */
    private static class InnerClassInstance {
        private static final StaticInner instance = new StaticInner(); // final?
    }

    private StaticInner() { }

    /**
     * 只有真正调用getInstance方法时, 才会加载静态内部类(延迟加载), 而且加载类是天然的线程安全的(线程安全), 没有synchronized(调用效率高)
     *
     * @return
     */
    public static StaticInner getInstance() { // final?
        return InnerClassInstance.instance;
    }
}
