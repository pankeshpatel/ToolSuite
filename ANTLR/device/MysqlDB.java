package fr.inria.arles.pankesh.database.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import framework.IProfileDB;
import framework.TempStruct;

public class MysqlDB implements IProfileDB {

	private static Connection connect = null;
	private static Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private static ResultSet resultSet = null;
	private static TempStruct tempStruct = null;

	private static void writeResultSet(ResultSet resultSet) throws SQLException {

		while (resultSet.next()) {

			int id = resultSet.getInt(1);
			int pref = resultSet.getInt(2);
			String uom = resultSet.getString(3);
			tempStruct = new TempStruct(pref, uom);
		}
	}

	// You need to close the resultSet
	private static void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				statement.close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}

	@Override
	public void setprofile(String newIndex, TempStruct newprofileValue) {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");

			// Set up the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://localhost/profile?" + "user=sqluser&password=sqluserpw");

			// preparedstatement can use variables and are more efficeint
			preparedStatement = connect.prepareStatement("insert into profile.FIRSTTABLE values (?,?,? )");

			preparedStatement.setString(1, newIndex);
			preparedStatement.setDouble(2, newprofileValue.gettempValue());
			preparedStatement.setString(3, newprofileValue.getunitOfMeasurement());
			preparedStatement.executeUpdate();

		} catch (Exception e) {
			// throw e;
		} finally {
			// close();
		}

	}

	@Override
	public TempStruct getprofile(String index) {
		try {

			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");

			// Set up the connection with the DB
			connect = DriverManager.getConnection("jdbc:mysql://localhost/profile?" + "user=sqluser&password=sqluserpw");

			// Statements allow to issus SQL queries to the database
			statement = connect.createStatement();

			resultSet = statement.executeQuery("SELECT * FROM profile.FIRSTTABLE WHERE id= " + index);

			writeResultSet(resultSet);

		} catch (Exception e) {
			// throw e;
		} finally {
			// close();
		}

		return tempStruct;
	}
}
