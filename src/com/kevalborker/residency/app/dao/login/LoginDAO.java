package com.kevalborker.residency.app.dao.login;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kevalborker.residency.app.dto.login.LoginDTO;
import com.kevalborker.residency.app.dto.register.RegisterDTO;

@Repository
public class LoginDAO {
	
	@Autowired
	SessionFactory factory;
	
	public LoginDAO() {

		System.out.println(this.getClass().getSimpleName()+" Object created");	
	}

	public RegisterDTO checkUserInDb(LoginDTO dtofromLSer) {
		
		System.out.println("loginUser in LoginDAO Started");	
		
		Session session = factory.openSession();
		Query q = null;
		RegisterDTO dtofromdb = null;
		try {
			
			String hql ="From RegisterDTO R where R.uniqueId=:uID and R.contactNo=:cNo ";
			
			q =session.createQuery(hql);
			q.setParameter("uID", dtofromLSer.getuniqueId());
			q.setParameter("cNo", (dtofromLSer.getcontactNo()));
			
			dtofromdb = (RegisterDTO)q.uniqueResult();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("loginUser in LoginDAO Ended");
		
		return dtofromdb;
	}
}
