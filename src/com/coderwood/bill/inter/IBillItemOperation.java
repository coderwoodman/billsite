package com.coderwood.bill.inter;
import java.util.List;

import com.coderwood.bill.entity.BillItem;

public interface IBillItemOperation {
	public BillItem selectBillItemByID(int itemID);
	public List<BillItem> getBillItems(String userName);
	public void addBillItem(BillItem billItem);
	public void deleteBillItem(int itemID);
	public void updateBillItem(BillItem billItem);
	
}