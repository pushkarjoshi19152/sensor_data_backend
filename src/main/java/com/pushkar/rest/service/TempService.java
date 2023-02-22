package com.pushkar.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pushkar.rest.jdbc.TempDao;
import com.pushkar.rest.model.RecordItem;

@Service
public class TempService {

	@Autowired
	private TempDao tempDao;
	
	public int getRecordsCount() {
		return tempDao.getRecordCount();
	}
	
	public List<Integer>getAllTemprature(){
		return tempDao.getAllTemprature();
	}

	public List<Integer> getAllPh() {
		// TODO Auto-generated method stub
		return tempDao.getAllPh();
	}

	public List<Integer> getAllTurbidity() {
		// TODO Auto-generated method stub
		return tempDao.getAllTurbidity();
	}
	
	public List<RecordItem> getAllRecords(){
		return tempDao.getAllRecords();
	}
}
