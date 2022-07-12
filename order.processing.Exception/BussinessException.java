package com.zensar.order.processing.exception;

import java.sql.SQLException;

public class BussinessException  extends Exception{

	public BussinessException(SQLException e) {
		// TODO Auto-generated constructor stub
		super(e);
	}

}
