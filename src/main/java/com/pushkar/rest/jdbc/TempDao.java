package com.pushkar.rest.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.pushkar.rest.model.RecordItem;

import jakarta.annotation.PostConstruct;



@Repository
public class TempDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	class RecordItemRowMapper implements RowMapper<RecordItem>{

		@Override
		public RecordItem mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			RecordItem item = new RecordItem();
			item.setTemprature(rs.getInt("Temperature"));
			item.setPh(rs.getInt("PH"));
			item.setTurbidity(rs.getInt("Turbidity"));
		
			return item;
		}

		
	}

	@PostConstruct
	public void init() {
		start();
	}
	public void start() {
		
		jdbcTemplate.execute("use sql12600207");
	}
	public int getRecordCount() {
		
		int res = jdbcTemplate.queryForObject("select count(*) from WaterMonitoring", Integer.class);
		return res;
	}
	
	public List<Integer>getAllTemprature(){
		
		return jdbcTemplate.queryForList("select Temperature from WaterMonitoring", Integer.class);
	}

	public List<Integer> getAllPh() {
		
		return jdbcTemplate.queryForList("select PH from WaterMonitoring", Integer.class);
	}

	public List<Integer> getAllTurbidity() {
		
		return jdbcTemplate.queryForList("select Turbidity from WaterMonitoring", Integer.class);
	}
	
	public List<RecordItem> getAllRecords(){
		
		return jdbcTemplate.query("select * from WaterMonitoring",new RecordItemRowMapper());
	}
}
