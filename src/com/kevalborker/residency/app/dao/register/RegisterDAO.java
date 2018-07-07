package com.kevalborker.residency.app.dao.register;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kevalborker.residency.app.dto.register.RegisterDTO;

@Repository
public class RegisterDAO {
	
	public RegisterDAO() {
		System.out.println(this.getClass().getSimpleName()+" Object Created !!");
	}
	
	@Autowired
	SessionFactory factory ;
	
	public void saveUser(RegisterDTO dtofromservice) {
		
		System.out.println("saveUser in registerDAO started");
		
		Session session =  factory.openSession();
		
		Transaction tx =null;
		try {
			
			tx = session.beginTransaction();
			session.save(dtofromservice);
			tx.commit();
			
		} catch (HibernateException e) {
			tx.rollback();
		}finally {
			session.close();
		}
		
		System.out.println("saveUser in registerDAO ended");
	}

}
