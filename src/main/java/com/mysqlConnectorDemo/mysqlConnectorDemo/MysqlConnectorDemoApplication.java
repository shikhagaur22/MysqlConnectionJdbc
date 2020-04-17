package com.mysqlConnectorDemo.mysqlConnectorDemo;

import java.sql.*;

public class MysqlConnectorDemoApplication {

	public static void main(String[] args) throws Exception {

		String url="jdbc:mysql://localhost:3306/Student";
		String userName="root";
		String password="root";
		String query= "SELECT * FROM student_records";
		String name="name";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,userName,password);
		Statement statement= connection.createStatement();
		ResultSet resultSet= statement.executeQuery(query);
		while (resultSet.next()){
			System.out.println("values: "+resultSet.getString(name));
		}
		statement.close();
		connection.close();
	}

}
