package DietaBox2;
import java.sql.*;
public class BDConnection {
			final static String connectionURL = "jdbc:mysql://localhost:3306/skoczkowie";
			
			final static String name = "root2";
			final static String pass = "MySQL13";
			
			public static void main(String[] arg) throws SQLException, ClassNotFoundException{
				//rejestracja klasy sterownika
			Class.forName("com.mysql.jdbc.Driver");
				//utworzenie po³¹czenia
			Connection con = DriverManager.getConnection(connectionURL,name,pass);
				//utworzenie wyra¿enie SQL
			Statement stmt=con.createStatement();
				//wykonanie zapytania		na podstawie obiektu stmt
			
			
			//wymusza komitowanie przy insercie przy menu domyœlnie jest true i wtedy nie trzeba comitowaæ
					con.setAutoCommit(false);   
					
			//ResultSet rs=stms.executeUpdate("delete from zawodnicy where imie='Georg'");
			//do update delete insert
			
					
					//do zapytañ executeQuery
			ResultSet rs=stmt.executeQuery("select*from zawodnicy");
			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));//to co chcemy zobaczyæ nie musimy wszystkiego co w tabeli
					
				} 
			con.close();
			}
		}
