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

    private final String resultVal          = "resultVal";
    private final String resultMsg          = "resultMsg";
    private final String strResultFail      = "Fail";
    private final String strResultSuccess   = "Success";
    private final String strParentException = "예외";


    /**
     * 단 건의 상품 등록
     * @param params
     * @return
     */
    @PostMapping(name = "상품 등록" , value = "/shopdata/insert" , produces = "application/json")
    public @ResponseBody Object setShopdataRegister(@RequestBody SDRegisterRequest params) {

        Map<String,Object> data = new HashMap<>();

        String strFailure           = "Failure";
        try {

            registerService.insertShopData(params);

            data.put(resultMsg,    strResultSuccess);

        } catch (Exception e) {
            data.put(resultMsg,     strResultFail);
            e.printStackTrace();
        }

        return data;
    }

    /**
     * 광고주 ID와 상품코드로 해당 상품 단 건 조회
     * @param adverId
     * @param prdtCode
     * @return
     */
    @GetMapping(name = "상품 조회", value = "/shopdata/select/{adverId}/{prdtCode}", produces = "application/json")
    public @ResponseBody Object findShopData(@PathVariable String adverId
                                            ,@PathVariable String prdtCode)  {
        List<SDRegisterRequest> resultList = null;

        try {
            Map<String,String> param = new HashMap<>();
            param.put("adverId", adverId);
            param.put("prdtCode", prdtCode);

            resultList = registerService.findShopData(param);

        } catch (Exception e) {
            e.printStackTrace();

            resultList = new ArrayList<>();
        }

        return resultList;

    }

    /**
     * 광고주 ID와 상품코드로 해당 상품 단 건 삭제
     * @param adverId
     * @param prdtCode
     * @return
     */
    @DeleteMapping(name = "상품 삭제", value = "/shopData/del/{adverId}/{prdtCode}",produces = "application/json")
    public @ResponseBody Object delShopData(@PathVariable String adverId
                                           ,@PathVariable String prdtCode) {

        Map<String,Object> data = new HashMap<>();

        String strFailure           = "Failure";
        try {
            Map<String,String> param = new HashMap<>();
            param.put("adverId", adverId);
            param.put("prdtCode", prdtCode);

            registerService.delShopData(param);

            data.put(resultMsg,    strResultSuccess);

        } catch (Exception e) {
            data.put(resultMsg,     strResultFail);
            e.printStackTrace();
        }

        return data;

    }

    @PutMapping(name = "상품 수정" , value = "/shopData/update/{adverId}/{prdtCode}",produces = "application/json")
    public @ResponseBody Object updateShopData(@PathVariable String adverId
                                              ,@PathVariable String prdtCode) {

        Map<String,Object> data = new HashMap<>();

        String strFailure           = "Failure";
        try {
            Map<String,String> param = new HashMap<>();
            param.put("adverId", adverId);
            param.put("prdtCode", prdtCode);

            registerService.updateShopData(param);

            data.put(resultMsg,    strResultSuccess);

        } catch (Exception e) {
            data.put(resultMsg,     strResultFail);
            e.printStackTrace();
        }

        return data;


    }



}
