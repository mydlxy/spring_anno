package spring_anno.cn.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import spring_anno.cn.myd.Service;
import spring_anno.cn.myd.Service1;

public class SpringTest {
	
	
	@Test
	public void test1() {
		
//		String f="";
		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Service1 s = (Service1) ac.getBean("service1");
		s.pp();
	}

}
