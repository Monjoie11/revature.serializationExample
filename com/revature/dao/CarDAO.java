package com.revature.dao;

import com.revature.pojo.*;

public interface CarDAO {
	
	public void createCar(Car c);
	
	public Car readCar(String vin);

}
