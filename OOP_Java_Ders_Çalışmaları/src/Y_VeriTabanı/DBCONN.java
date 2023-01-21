package Y_VeriTabanı;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBCONN {
	
	//Bu Ders için mysql kullanılacaktı.Ama mysql de hatalı yaptığım  için  mariaDB bagladım veritabanı olarak . 
	

	public static void main(String[] args) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mariadb://localhost:3325/cars/car","root","1234");
		Statement st=c.createStatement();
		
		String query ="INSERT INTO cars( cars_name,cars_speed) VALUES('Mercedes',100)";
		int sonuc=st.executeUpdate(query);
		System.out.println(sonuc);
		st.close();
		

	
}

}
