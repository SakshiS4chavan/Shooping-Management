package org.dnyanyog.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CouponController {

    @GetMapping("/fetchCoupons")
    public Map<String, Integer> getCoupons() {
        Map<String, Integer> coupons = new HashMap<>();
        return coupons;
    }
}
