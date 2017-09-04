package singleton;

public class StaticInner {
	/**
     * �ⲿ��û��static����, ��˼��ر���ʱ����������ʼ������
     */
    private static class InnerClassInstance {
        private static final StaticInner instance = new StaticInner(); // final?
    }

    private StaticInner() { }

    /**
     * ֻ����������getInstance����ʱ, �Ż���ؾ�̬�ڲ���(�ӳټ���), ���Ҽ���������Ȼ���̰߳�ȫ��(�̰߳�ȫ), û��synchronized(����Ч�ʸ�)
     *
     * @return
     */
    public static StaticInner getInstance() { // final?
        return InnerClassInstance.instance;
    }
}
