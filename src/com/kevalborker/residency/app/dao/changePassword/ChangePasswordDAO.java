package com.kevalborker.residency.app.dao.changePassword;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kevalborker.residency.app.dto.changePassword.ChangePasswordDTO;
import com.kevalborker.residency.app.dto.register.RegisterDTO;

@Repository
public class ChangePasswordDAO {

	public ChangePasswordDAO() {
		System.out.println(this.getClass().getSimpleName()+" Object created");
	}
		
	@Autowired
	SessionFactory factory;
	
	public int changePassword(ChangePasswordDTO dtofromCPserv) {
		System.out.println("changePassword in ChangePasswordDAO started");
		
		Session session = factory.openSession();
		
		String hql="Update RegisterDTO R set uniqueID=:newuId where R.contactNo=:cNo ";
		Transaction tx = null;
		Query q = null;
		int result = 0;
		try {
			
			q =session.createQuery(hql);
			
			q.setParameter("newuId", dtofromCPserv.getNewuniqueId());
			q.setParameter("cNo", dtofromCPserv.getContactNo());
			
			tx = session.beginTransaction();
			result = q.executeUpdate();
			tx.commit();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			tx.rollback();
		}finally {
			session.close();
		}
		
		System.out.println("changePassword in ChangePasswordDAO ended");
		return result;
	}
}
