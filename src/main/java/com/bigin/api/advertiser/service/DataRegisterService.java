package com.bigin.api.advertiser.service;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.bigin.api.advertiser.repository.DataResisterReository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
@Component
public class DataRegisterService {

    private final DataResisterReository reository;
    public DataRegisterService(DataResisterReository reository) {
        this.reository = reository;
    }

    /**
     *    상품 데이터 등록.
     */
    public void insertShopData(SDRegisterRequest params) {

        reository.insertData(params);
    }

    /***
     *  상품 데이터 조회.
     */
    public List<SDRegisterRequest> findShopData(Map<String,String> param) {
        List<SDRegisterRequest> resl = reository.findShopData(param);
        log.info("이겨머{}",resl);
        return  resl;
    }
}
