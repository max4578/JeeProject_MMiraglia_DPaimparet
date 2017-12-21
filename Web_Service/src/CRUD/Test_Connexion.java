package CRUD;

import java.sql.Connection;
import java.sql.SQLException;

import Singleton.Connexion;

public class Test_Connexion {

	public static void main(String[] args) {
		Connection con= Connexion.getInstance();
		try {
			System.out.println(con.isClosed());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
