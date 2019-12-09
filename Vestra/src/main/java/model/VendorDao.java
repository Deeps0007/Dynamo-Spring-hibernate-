package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class VendorDao {
	
	

	public void saveDetails(Vendor v)
	{
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(v);
		t.commit();
		session.close();
		
		
	}
	
	public List checkLogin(Vendor v )
	{
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		
		List list=session.createQuery("from Vendor").list();
		Iterator it=list.iterator();
		List<Vendor> info=new ArrayList<Vendor>();
		while(it.hasNext())
		{
			Vendor vn=(Vendor)it.next();
			if(vn.getVemail().equals(v.getVemail())&& vn.getPass().equals(v.getPass()))
			{
				info.add(vn);
			
				
			}
			
			
		}
		return info;
		
	}
	
	
	
	

}
