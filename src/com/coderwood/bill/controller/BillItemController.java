package com.coderwood.bill.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coderwood.bill.entity.BillItem;
import com.coderwood.bill.service.BillItemService;

@Controller
@RequestMapping("/billitem")
public class BillItemController {
	private BillItemService billItemService;

	@RequestMapping("/list")
	public ModelAndView listAll() {
		billItemService=new BillItemService();
		List<BillItem> billItems = billItemService.getBillItems("%×Ê%");

		ModelAndView modelAndView = new ModelAndView("billitemlist");
		modelAndView.addObject("billItems", billItems);
		return modelAndView;
	}
	
	@RequestMapping("/detail")
	public ModelAndView showDetail() {
		billItemService=new BillItemService();
		BillItem billItem = billItemService.getBillItemByItemID(1);
		
		ModelAndView modelAndView = new ModelAndView("billitemdetail");
		modelAndView.addObject("billItem", billItem);
		return modelAndView;
	}

}
