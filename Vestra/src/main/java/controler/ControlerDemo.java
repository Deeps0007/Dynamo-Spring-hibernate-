package controler;

import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.User;
import model.Vendor;
import model.VendorDao;

@Controller
public class ControlerDemo {
	
	ApplicationContext app=new ClassPathXmlApplicationContext("appcon.xml");
	@RequestMapping("/home")
	public String view()
	{
		return "home";
	}
	

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String view1(@RequestParam("usertype")String utype,Model m)
	{
		
     if(utype.equals("User"))
     {
    	 m.addAttribute("bean",new User()); 
    		return "c_login";
     }else
     {
	 m.addAttribute("bean",new Vendor());
	return "v_login";
     }
	
	}
	

	@RequestMapping("/goregis")
	public String saveDetails(Model m, Vendor v)
	{
    Vendor obj=app.getBean("ven",Vendor.class);
	m.addAttribute("bean",obj);
	return "v_reg";
	}
	

	@RequestMapping(value="/save_vendor",method=RequestMethod.POST)
	public String view4(@ModelAttribute("bean")Vendor v,Model m)
	{
		VendorDao obj=app.getBean("vendao",VendorDao.class);
		
		String msg="Your registration is succesful !!Please login";
	    m.addAttribute("msg",msg);
	    obj.saveDetails(v);
		 return "v_login";
	}

	
	@RequestMapping(value="/vendor_login",method=RequestMethod.POST)
	public String check(@ModelAttribute("bean") Vendor v,Model m )
	{
		
		VendorDao obj=app.getBean("vendao",VendorDao.class);
		String str="Incorrect username and password !";
		List listvendor=obj.checkLogin(v);
		if(listvendor.isEmpty())
		{
			
			m.addAttribute("error",str);
			return "v_login";
		}
		else
		{
			Iterator it=listvendor.iterator();
			while(it.hasNext())
			{
				Vendor vn=(Vendor)it.next();
				m.addAttribute("name",vn.getVname());
				
			}
			
			
			return "ven_dash";
			
		}
		
		
		
	}

}
