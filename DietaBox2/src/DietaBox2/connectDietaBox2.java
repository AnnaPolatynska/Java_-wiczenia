package DietaBox2;
import java.io.FilterInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class connectDietaBox2 {

				Connection con;
				Statement stmt;
				
				public void polaczenie() throws ClassNotFoundException, SQLException{
					Class.forName("com.mysql.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dietaBOX2","root2","MySQL13");
					System.out.println("Po³¹czenie ustanowione!");
				}
				
				public void wypisz() throws SQLException{
					stmt = con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from klient");
					while(rs.next()){
					System.out.println(rs.getInt(1)+ " " + rs.getString(2)+ " " + rs.getString(3)+ " " + rs.getString(4));
					}
				}
				public void wpisz(String columns, String values) throws SQLException{
					con.setAutoCommit(true);
					stmt.executeUpdate("insert into klient ( " + columns + " )" + " values ( " + values + " )");
				}
				public void zamknij() throws SQLException{
					con.close();
				}
				public static void main(String[] args) throws ClassNotFoundException, SQLException{
					connection bo = new connection();
					bo.polaczenie();
					bo.wypisz();
					bo.wpisz("id_klienta, nazwisko, imiê, telefon, miasto, id_o","10,'Miko³ajewski','Andrzej','609-280-280','Warszawa'");
					bo.wypisz();
					bo.zamknij();
					
			}
}
