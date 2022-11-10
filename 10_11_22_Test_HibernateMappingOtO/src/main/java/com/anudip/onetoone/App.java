package com.anudip.onetoone;

import com.anudip.onetoone.daoimpl.EmployeeDaoEmple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	EmployeeDaoEmple em=new EmployeeDaoEmple();
    	//em.add();
    	em.fetchEmployee(23);
    }
}
