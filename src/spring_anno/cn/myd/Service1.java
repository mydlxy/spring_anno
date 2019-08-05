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
		
		System.out.println("has been anncation...111.");
	}
	
	
	
	public void setUserdao(Userdao userdao) {
		System.out.println("yong  le  setter...");
		this.userdao = userdao;
		System.out.println("test git upload file again");
		System.out.println("test git edit...file s ..");
	}



	public void pp() {
		
		userdao.gg();
	}

}
