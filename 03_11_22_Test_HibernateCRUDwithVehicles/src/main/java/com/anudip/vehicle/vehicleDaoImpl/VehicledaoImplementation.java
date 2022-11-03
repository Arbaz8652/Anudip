package com.anudip.vehicle.vehicleDaoImpl;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.anudip.vehicle.config.HbUtil;
import com.anudip.vehicle.entity.Vehicle;
import com.anudip.vehicle.vehicleDao.IVehicleDao;

public class VehicledaoImplementation implements IVehicleDao {

	Scanner sc=new Scanner(System.in);
	
	public void getVehicelInfo() {
		try {
			Session session=HbUtil.getSessionFactory().openSession();
			
			System.out.println("Enter id");
			int id=sc.nextInt();
			Vehicle cd=session.get(Vehicle.class, id);
			
			System.out.println("========CUstomer Deatails are============");
			System.out.println(cd.getId()+" : "+cd.getBrandName()+" : "+cd.getModelName()+" : "+cd.getType()+" : "+cd.getPrice());
			
		}catch (HibernateException e) {
			e.printStackTrace();
		}


	}

	public void addVehicleInfo() {
		try {

			Session session=HbUtil.getSessionFactory().openSession();
			//System.out.println("hello");
			Transaction t= session.beginTransaction();
			
			String bname,mname,type, rNum;
			long price;
			System.out.print("Enter Brand Name : ");
			bname=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter Model Name : ");
			mname=sc.next();
			sc.nextLine();
			System.out.print("Enter Vehicle Type (public , personel, private..) : ");
			type=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter Vehicle Registration Number : ");
			rNum=sc.nextLine();
			sc.nextLine();
			System.out.print("Enter Vehicle price : ");
			price=sc.nextLong();
			sc.nextLine();
			Vehicle v=new Vehicle();
			v.setBrandName(bname);
			v.setModelName(mname);
			v.setType(type);
			v.setPrice(price);
			v.setVehicleNumber(rNum);
			session.save(v);
			t.commit();
			System.out.println("Vehicle Added Successfully");
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateVehicleInfo() {
		try {
			Session session=HbUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			System.out.println("Enter id");
			int id=sc.nextInt();
			Vehicle v=session.get(Vehicle.class, id);
			System.out.println("Enter update price");
			long p=sc.nextLong();
			v.setPrice(p);
			session.update(v);
			t.commit();
			System.out.println("Updated successfully");
		}catch(HibernateException e) {
			e.printStackTrace();
		}

	}

	public void deletVehicleInfo() {
		try {
			Session session=HbUtil.getSessionFactory().openSession();
			Transaction t=session.beginTransaction();
			System.out.println("Enter id");
			int id=sc.nextInt();
			Vehicle v=session.get(Vehicle.class,id);
			session.delete(v);
			t.commit();
			System.out.println("deleted successfully");
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}

	}

}
