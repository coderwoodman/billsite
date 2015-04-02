package com.coderwood.bill.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coderwood.bill.entity.BillItem;
import com.coderwood.bill.inter.IBillItemOperation;

@Repository
public class BillItemDao {
	@Autowired
	IBillItemOperation mapper;
	
	public List<BillItem> getBillItems(String userName) {
		return	mapper.getBillItems(userName);
	}
}
