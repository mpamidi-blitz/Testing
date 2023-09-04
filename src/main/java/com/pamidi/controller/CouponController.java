package com.pamidi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pamidi.entity.Coupon;
import com.pamidi.service.CouponService;

@RestController
@RequestMapping(value = "/couponsapi")
public class CouponController {

	@Autowired
	private CouponService service;
	
	
	@GetMapping(value="/test")
	public String getCouponsTest() {
		return "This is from getCouponsTest() method CouponController Class";
	}
	
	@GetMapping(value = "/coupons/{code}")
	public Coupon getCoupon(@PathVariable(name = "code") String code) {
		return service.getCoupons(code);
	}
	
	@GetMapping(value="/coupons/all/{code}")
	public List<Coupon> getCouponsContaining(@PathVariable("code") String code) {
		return service.getCouponsContaining(code);
	}
	
	@GetMapping(value="/coupons")
	public List<Coupon> getCoupons() {
		return service.getCoupons();
	}
	
	@PostMapping(value = "/coupons")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return service.saveCoupon(coupon);
	}
	
	@DeleteMapping(value="/coupons/{code}")
	public Coupon deleteCoupon(@PathVariable("code") String code) {
		return service.deleteCoupon(code);
	}
	
	@PutMapping(value="/coupons")
	public Coupon updateCoupon(@RequestBody Coupon coupon) {
		return service.updateCoupon(coupon);
	}
}
