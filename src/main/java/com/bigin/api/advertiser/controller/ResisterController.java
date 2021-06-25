package com.bigin.api.advertiser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * create 2021/06/25
 * crud API
 *
 * @author yjshin
 * @since jdk11
 */
@RestController
@RequestMapping(value = "/advertiser")
public class ResisterController {

    @GetMapping(name = "상품 등록" , value = "/shopdata")
    public @ResponseBody Object setShopdataRegister() {
        return "hooew";
    }


}
