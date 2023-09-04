package com.pamidi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pamidi.dao.CouponDAO;
import com.pamidi.entity.Coupon;

@Component
public class CouponService {

	@Autowired
	private CouponDAO dao;
	
	public Coupon getCoupons(String code) {
		return dao.getCoupons(code);
	}
	
	public List<Coupon> getCouponsContaining(String code) {
		return dao.getCouponsContaining(code);
	}

	public Coupon saveCoupon(Coupon coupon) {
		return dao.saveCoupon(coupon);
	}

	public Coupon deleteCoupon(String code) {
		return dao.deleteCoupon(code);
	}

	public List<Coupon> getCoupons() {
		return dao.getCoupons();
	}

	public Coupon updateCoupon(Coupon coupon) {
		return dao.updateCoupon(coupon);
	}
}
