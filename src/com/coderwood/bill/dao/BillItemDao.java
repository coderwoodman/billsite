package com.coderwood.bill.dao;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coderwood.bill.entity.BillItem;
import com.coderwood.bill.inter.IBillItemOperation;

@Repository
public class BillItemDao {
	@Autowired
	IBillItemOperation mapper;

	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}

	public BillItem getBillItemByItemID(int itemID) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			BillItem billItem = (BillItem) session
					.selectOne(
							"com.coderwood.bill.inter.BillItemMapper.selectBillItemByID",
							1);
			return billItem;
		} finally {
			session.close();
		}
	}

	public List<BillItem> getBillItems(String userName) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			List<BillItem> billItems = session.selectList("com.coderwood.bill.inter.BillItemMapper.selectBillItems",userName);
			return billItems;
		} finally {
			session.close();
		}
	}
}
