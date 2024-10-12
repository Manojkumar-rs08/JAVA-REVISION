package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBrespone {

	
		
		
		public List<PrimaryData> getPrimaryDb() {
			
			List<PrimaryData> primaryList = new ArrayList<PrimaryData>();
			
			try {
				//Class.forName("com.mysql.jdbc.Driver");

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","Manoj123");

				Statement st = con.createStatement();

				ResultSet res = st.executeQuery("select * from primary1");

				while (res.next()) {
					PrimaryData primaryData = new PrimaryData();

					String mobNumber = res.getString("mobnum");
					String name = res.getString("name");

					primaryData.setMobilenumber(mobNumber);
					primaryData.setName(name);

					primaryList.add(primaryData);
				}
			} catch (Exception e) {
				System.out.println(e);
			}

			return primaryList;
		}

		public List<SecondaryData> getSecondaryDb() {

			List<SecondaryData> secondaryList = new ArrayList<SecondaryData>();

			try {
				

				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","Manoj123");

				Statement st = con.createStatement();

				ResultSet res = st.executeQuery("select * from secondary2");

				while (res.next()) {

					SecondaryData secondaryData = new SecondaryData();

					String mobNumber = res.getString("mobnum1");
					String address = res.getString("address");

					secondaryData.setMobilenumber(mobNumber);

					secondaryData.setAddress(address);
					secondaryList.add(secondaryData);

				}
			} catch (Exception e) {
				System.out.println(e);
			}
			return secondaryList;

		}
	
		
		
		

	

}
