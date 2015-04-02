package com.codewood.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderwood.bill.dao.BillItemDao;
import com.coderwood.bill.entity.BillItem;

@Service
public class BillItemService {
	@Autowired
	BillItemDao billItemDao;
	
	public List<BillItem> getBillItems(String userName) {
		return	billItemDao.getBillItems(userName);
	}
}
