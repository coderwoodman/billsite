package com.coderwood.bill.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.coderwood.bill.dao.BillItemDao;
import com.coderwood.bill.entity.BillItem;

@Repository
@Service
public class BillItemService {
	@Autowired
	BillItemDao billItemDao;
	
	public List<BillItem> getBillItems(String userName) {
		 billItemDao=new BillItemDao();
		return	billItemDao.getBillItems(userName);
	}
	
	 public BillItem getBillItemByItemID(int itemID) {
		 billItemDao=new BillItemDao();
		 return billItemDao.getBillItemByItemID(itemID);
	 }
}
