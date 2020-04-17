package com.mysqlConnectorDemo.mysqlConnectorDemo;

import java.sql.*;

public class MysqlConnectorDemoApplication {

	public static void main(String[] args) throws Exception {

		String url="jdbc:mysql://localhost:3306/Student";
		String userName="root";
		String password="root";
		int id1=7;//put id
		String studentName1="Leela";//put name
		int id2=8;//put id
		String studentName2="Harish";//put name
		String query1= "SELECT * FROM student_records";
		String query2="insert into student_records values("+id1+",'"+studentName1+"')";
		String query3 = "insert into student_records values(?,?)";
		String name="name";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,userName,password);
		Statement statement= connection.createStatement();
		ResultSet resultSet= statement.executeQuery(query1);//dql
		while (resultSet.next()){
			System.out.println("values: "+resultSet.getString(name));
		}
		int numberOfRows = statement.executeUpdate(query2);//for dml
		System.out.println("number of rows affected: "+numberOfRows);

		PreparedStatement preparedStatement= connection.prepareStatement(query3);//when data is dynamic
		preparedStatement.setInt(1,id2);
		preparedStatement.setString(2,studentName2);
		numberOfRows = preparedStatement.executeUpdate();
		System.out.println("number of rows affected: "+numberOfRows);
		statement.close();
		connection.close();
	}

}
