package spring_anno.cn.myd;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("service1")
public class Service1 {
	
	@Resource(name="User")
	private Userdao userdao;
	
	public Service1() {
		
		System.out.println("has been anncation....");
	}
	
	
	
	public void setUserdao(Userdao userdao) {
		System.out.println("yong  le  setter...");
		this.userdao = userdao;
	}



	public void pp() {
		
		userdao.gg();
	}

}
