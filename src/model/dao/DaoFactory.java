package model.dao;

import db.DB;

public class DaoFactory {

	public static SellerDao createSellerDao () {
		return new SellerDoaJDBC(DB.getConnection());
	}
}
