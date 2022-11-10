package com.anudip.onetoone.daoimpl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.anudip.onetoone.congig.HbUtil;
import com.anudip.onetoone.dao.EmploteeDao;
import com.anudip.onetoone.entity.AddressProof;
import com.anudip.onetoone.entity.Employee;

public class EmployeeDaoEmple implements EmploteeDao {
	@Override
	public void add() {
		try {
			Session session=HbUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			AddressProof ad=new AddressProof();
			ad.setAddress("chembur mumbai");
			ad.setType("Adhar");
			ad.setState("Maharashtra");
			ad.setCity("mumbai");
			
			Employee emp=new Employee();
			emp.setName("Arbaz");
			emp.setPhone("9877656765");
			emp.setEmail("arbaz@gmail.com");
			emp.setAp(ad);
			
//			AddressProof ad1=new AddressProof();
//			ad.setAddress("Beed maharashtra");
//			ad.setType("PanCard");
//			ad.setState("Maharashtra");
//			ad.setCity("Beed");
//			
//			Employee emp1=new Employee();
//			emp.setName("Akram");
//			emp.setPhone("9986656765");
//			emp.setEmail("akram@gmail.com");
//			emp.setAp(ad1);
			
			session.save(emp);
			//EmployeeDaoEmple.save(emp1);
			t.commit();
			System.out.println("Added Successfully");
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		

	}

	@Override
	public void fetchEmployee(int id) {
		try {
			
			Session session=HbUtil.getSessionFactory().openSession();
			Employee em=session.get(Employee.class, id);
			System.out.println("========Customer Deatails are============");
			System.out.println(em.toString());
			
		}catch (HibernateException e) {
			e.printStackTrace();
		}


	}

}
