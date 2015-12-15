package com.lukas.webapp.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lukas.webapp.rest")
public class Application {	
	public static void main(String[] args) {
		
		String url = "jdbc:postgresql://localhost:5432/witamdb";
		Properties props = new Properties();
		props.setProperty("user","apptester");
		props.setProperty("password","witam123");
		props.setProperty("ssl","true");
		try {
			Connection conn = DriverManager.getConnection(url, props);
			Statement st = conn.createStatement();
			st.executeUpdate("INSERT INTO human VALUES ('Lukas', 22);");

			st.close();
			conn.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Kurwa");
			e.printStackTrace();
		}
		
		SpringApplication.run(Application.class, args);
	}

	

}
