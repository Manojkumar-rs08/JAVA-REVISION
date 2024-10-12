package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;

class Primary1 {

	private  int mobnum1;
	private String name;
	public int getMobnum1() {
		return mobnum1;
	}
	public void setMobnum1(int mobnum1) {
		this.mobnum1 = mobnum1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}


class Secondary {

	private int mobnum2;
	private String Address;

	public int getMobnum2() {
		return mobnum2;
	}
	public void setMobnum2(int mobnum2) {
		this.mobnum2 = mobnum2;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}



}

class Common{

	private int  cmobnum;
	private String cname;
	private String caddress;
	public int getCmobnum() {
		return cmobnum;
	}
	public void setCmobnum(int cmobnum) {
		this.cmobnum = cmobnum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

}



public class Mobilenum2sql {

	public static  void main(String[] args) throws SQLException {

		HashMap<Integer,String>pri= new HashMap<>();


		Primary1 pr= new Primary1();



		Connection con1  =DriverManager.getConnection("jdbc:mysql://localhost:3306/sql1","root","Manoj123");
		Statement stt = con1.createStatement();
		ResultSet rss= stt.executeQuery("select * from primary1");

		while(rss.next()) {
			pr.setMobnum1(rss.getInt(1));
			pr.setName(rss.getString(2));

			pri.put(pr.getMobnum1(),pr.getName());

		}

		System.out.println(pri);


		HashMap<Integer,String>sec= new HashMap<>();
		Secondary sc = new Secondary();
		ResultSet rs2= stt.executeQuery("select * from secondary2");



		while(rs2.next()) {

			sc.setMobnum2(rs2.getInt(1));
			sc.setAddress(rs2.getString(2));


			sec.put(sc.getMobnum2(), sc.getAddress());	

		}

		System.out.println(sec);





		Common cc = new Common();


		for(Entry<Integer, String> pm:pri.entrySet()) {

			for(Entry<Integer,String>sm:sec.entrySet()) {

				if(pm.getKey().equals(sm.getKey())) {

					ResultSet rs3= stt.executeQuery("select *from  common");
					PreparedStatement ps5= con1.prepareStatement("insert into common values(?,?,?)");

					cc.setCmobnum(pm.getKey());
					cc.setCname(pm.getValue());
					cc.setCaddress(sm.getValue());



					System.out.println(cc.getCmobnum()+"  "+cc.getCname()+" "+cc.getCaddress());

					ps5.setInt(1, cc.getCmobnum());
					ps5.setString(2,cc.getCname() );
					ps5.setString(3,cc.getCaddress());

					int a = ps5.executeUpdate();

				}

			}


		}

	}

}
