package com.coderwood.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coderwood.bill.entity.BillItem;
import com.coderwood.bill.inter.IBillItemOperation;
import com.codewood.bill.service.BillItemService;

@Controller
@RequestMapping("/billitem")
public class BillItemController {
	@Autowired
	private BillItemService biItemService;

	@RequestMapping("/list")
	public ModelAndView listAll() {
		List<BillItem> billItems = biItemService.getBillItems("×Ê");
		// new ArrayList<BillItem>();
		// BillItem billItem=new BillItem();
		// billItem.setItemID(1);
		// billItem.setItemName("test1");
		// billItems.add(billItem);
		// BillItem billItem2=new BillItem();
		// billItem2.setItemID(12);
		// billItems.add(billItem2);

		ModelAndView modelAndView = new ModelAndView("billitemlist");
		modelAndView.addObject("billItems", billItems);
		return modelAndView;
	}

}
