package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("===Test 1: Find seller by id: ");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===Test 2: Find seller by departent: ");
		Department d2 = new Department(2,null);
		List<Seller> seller2 = sellerDao.findByDepartment(d2);
		for (Seller obj : seller2) {
			System.out.println(obj);
			
		}
		System.out.println("\n===Test 3: Find seller by departent: ");
		seller2 = sellerDao.findAll();
		for (Seller obj : seller2) {
			System.out.println(obj);
			
		}
	}

}
