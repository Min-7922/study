package hr_test;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper <T> {
	
	T mapper(ResultSet rs) throws SQLException;
}
