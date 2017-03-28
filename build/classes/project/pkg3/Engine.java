/*
*Name: Sean Pratt
*Course: CNT 4714 Spring 2017
*Assignment title: Project 3
*Date: March 5, 2017
*/
package project.pkg3;

import com.mysql.jdbc.MySQLConnection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class Engine {
    
    private String mURL;
	private String mUser;
	private String mPassword;
	private MySQLConnection mConnection;
	
	public Engine(String URL, String Username, String Password){
		this.mURL = URL;
		this.mUser = Username;
		this.mPassword = Password;
	}
	
	public void EstablishConnection() throws SQLException{
		mConnection = (MySQLConnection) DriverManager.getConnection(this.mURL, this.mUser, this.mPassword);
	}
	
	public void CloseConnection() throws SQLException{
		mConnection.close();
	}
	

	public MySQLConnection getConnection(){
		return this.mConnection;
	}
}
