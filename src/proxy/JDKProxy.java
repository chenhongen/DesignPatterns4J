package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 * 不需要实现接口,但是需要指定接口类型
 * @author che
 *
 */
public class JDKProxy {
	private Target t; // 静态体现在这里
	
	public JDKProxy(Target t) {
		super();
		this.t = t;
	}
	
	public void beforePuchase() {
		System.out.println("登陆");
	}
	
	// 给目标对象生成代理对象
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    	beforePuchase();
                        //执行目标对象方法
                        Object returnValue = method.invoke(t, args);
                        afterPuchase();
                        return returnValue;
                    }
                }
        );
    }
    
	public void afterPuchase() {
		System.out.println("付款");
	}
	
	//http://blog.csdn.net/rock_ray/article/details/22491763
}
