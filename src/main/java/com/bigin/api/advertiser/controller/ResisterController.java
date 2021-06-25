package com.bigin.api.advertiser.controller;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.bigin.api.advertiser.service.DataRegisterService;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * create 2021/06/25
 * crud API
 *
 * @author yjshin
 * @since jdk11
 */
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping(value = "/advertiser")
public class ResisterController {

    private DataRegisterService registerService;

    private final String resultMsg          = "resultMsg";
    private final String strResultFail      = "Fail";
    private final String strResultSuccess   = "Success";


    @PostMapping(name = "상품 등록" , value = "/shopdata" , produces = "application/json")
    public @ResponseBody Object setShopdataRegister(@RequestBody SDRegisterRequest params) {

        Map<String,Object> data = new HashMap<>();

        String strFailure           = "Failure";
        try {
            log.info("regDate {}",params.getRegDate());
            registerService.insertShopData(params);
            data.put(resultMsg,    strResultSuccess);

        } catch (Exception e) {
            data.put(resultMsg,     strFailure);
            e.printStackTrace();
        }

        return data;
    }


}
