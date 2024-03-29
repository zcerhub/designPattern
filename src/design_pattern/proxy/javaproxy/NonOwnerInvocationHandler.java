package design_pattern.proxy.javaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler{

	PersonBean person;
	
	public NonOwnerInvocationHandler(PersonBean person) {
		// TODO Auto-generated constructor stub
		this.person=person;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
	try {
		if(method.getName().startsWith("get")) {
			return method.invoke(person, args);
		}else if(method.getName().equals("setHotOrNotRating")) {
			return method.invoke(person, args);
		}else if(method.getName().startsWith("set")) {
			throw new IllegalAccessException();
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		return person;
	}

}
