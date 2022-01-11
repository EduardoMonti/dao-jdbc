	package model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() throws FileNotFoundException, IOException {	
		return new SellerDaoJDBC(DB.getConnection());
	}

}
