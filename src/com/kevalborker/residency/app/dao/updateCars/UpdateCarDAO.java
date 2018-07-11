package com.kevalborker.residency.app.dao.updateCars;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kevalborker.residency.app.dto.updateCars.UpdateCarDTO;

@Repository
public class UpdateCarDAO {

	public UpdateCarDAO() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}
	
	@Autowired
	SessionFactory factory;
	
	
	public int updateDetailsDAO(UpdateCarDTO dtofromserv) {
		System.out.println("updateDetails() in UpdateCarDAO started");
			
		Session session = factory.openSession();
		
		String hql = "Update RegisterDTO R set numOfCars=:newCar where R.contactNo=:cNo";
		Query q = null;
		Transaction tx = null;
		int rowaffected = 0;
		
		try {
			
			q = session.createQuery(hql);
			
			q.setParameter("cNo", dtofromserv.getContactNo());
			q.setParameter("newCar", dtofromserv.getNewCarNum());
			
			tx = session.beginTransaction();
			rowaffected = q.executeUpdate();
			tx.commit();
			
		} catch (HibernateException e) {
			tx.rollback();
		}finally {
			session.close();
		}
		
		System.out.println("updateDetails() in UpdateCarDAO ended");
		
		return rowaffected;
	}

}
