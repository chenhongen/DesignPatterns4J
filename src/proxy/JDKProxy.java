package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬����
 * ����Ҫʵ�ֽӿ�,������Ҫָ���ӿ�����
 * @author che
 *
 */
public class JDKProxy {
	private Target t; // ��̬����������
	
	public JDKProxy(Target t) {
		super();
		this.t = t;
	}
	
	public void beforePuchase() {
		System.out.println("��½");
	}
	
	// ��Ŀ��������ɴ������
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    	beforePuchase();
                        //ִ��Ŀ����󷽷�
                        Object returnValue = method.invoke(t, args);
                        afterPuchase();
                        return returnValue;
                    }
                }
        );
    }
    
	public void afterPuchase() {
		System.out.println("����");
	}
	
	//http://blog.csdn.net/rock_ray/article/details/22491763
}
