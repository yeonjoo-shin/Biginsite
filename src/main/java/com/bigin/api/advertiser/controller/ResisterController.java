package com.bigin.api.advertiser.controller;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.bigin.api.advertiser.service.DataRegisterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private final String strParentException = "예외";



    @PostMapping(name = "상품 등록" , value = "/shopdata/insert" , produces = "application/json")
    public @ResponseBody Object setShopdataRegister(@RequestBody SDRegisterRequest params) {

        Map<String,Object> data = new HashMap<>();

        String strFailure           = "Failure";
        try {
            log.info("regDate {}",params.getRegDate());
            registerService.insertShopData(params);
            data.put(resultMsg,    strResultSuccess);

        } catch (Exception e) {
            data.put(resultMsg,     strResultFail);
            e.printStackTrace();
        }

        return data;
    }

    @GetMapping(name = "상품 조회", value = "/shopdata/select/{adverId}/{prdtCode}", produces = "application/json")
    public @ResponseBody Object findShopData(@PathVariable String adverId
                                            ,@PathVariable String prdtCode)  {

        List<SDRegisterRequest> resultList = null;
        Map<String,Object> rtnResponseMap = new HashMap<>();
        String strReturnMsgValue;

        try {
            Map<String,String> param = new HashMap<>();
            param.put("adverId", adverId);
            param.put("prdtCode", prdtCode);

            resultList = registerService.findShopData(param);
            rtnResponseMap.put("list",resultList);

            //Resonse 값 맵 리턴
            strReturnMsgValue = strResultSuccess;
            rtnResponseMap.put(resultMsg,strReturnMsgValue);


        } catch (Exception e) {
            strReturnMsgValue = strParentException;

            rtnResponseMap.put(resultMsg,strReturnMsgValue);
            rtnResponseMap.put(resultMsg,strResultFail);
            e.printStackTrace();

            resultList = new ArrayList<>();

        }

        return rtnResponseMap;

    }



}
