
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ConnexionDB {
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException{
		
		System.out.print("Ent");
				try {
					//Chargement de la classe du driver par la JVM
					Class.forName("oracle.jdbc.driver.OracleDriver");
				}
				catch(ClassNotFoundException ex){
					JOptionPane.showMessageDialog(null, "Classe de driver introuvable" + ex.getMessage());
					System.exit(0);
				}
				
				Connection connec = null;
				Statement stmt = null;
				ResultSet res = null;
				
				try {
					String url = "jdbc:oracle:thin:@char-oracle11.condorcet.be:1521:xe";
					connec = DriverManager.getConnection(url,"ora34","oracle3");
					String requete = "SELECT * From UTILISATEUR";
					stmt = connec.createStatement();
					res = stmt.executeQuery(requete);
					
					
					while(res.next())
					{
						System.out.print(res.getInt(1));
					}
				}
				catch(SQLException ex){
					JOptionPane.showMessageDialog(null, "Erreur JDBC : " + ex.getMessage());
				}
				
				finally {
					try {
						if(res != null)
							res.close();
						if(stmt != null)
							stmt.close();
						if(connec != null)
							connec.close();
					}
					catch(SQLException ex){
						System.out.println("1234");
						ex.printStackTrace();
					}
				}
		}
}
