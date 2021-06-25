package com.bigin.api.advertiser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/advertiser")
public class ResisterController {

    @GetMapping(name = "등록" , value = "/shopdata")
    public @ResponseBody Object setShopdataRegister() {
        return "hooew";
    }


}
