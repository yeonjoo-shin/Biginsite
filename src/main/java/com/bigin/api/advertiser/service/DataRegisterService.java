package com.bigin.api.advertiser.service;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.bigin.api.advertiser.core.SDRegisterUpdateRequest;
import com.bigin.api.advertiser.repository.DataResisterReository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
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
        return  reository.findShopData(param);
    }

    /**
     *  상품 데이터 삭제.
     */
    public void delShopData(Map<String,String> param) {
        reository.delShopData(param);
    }

    /**
     * 상품 데이터 수정.
     */
    public void updateShopData(SDRegisterUpdateRequest request) {
        reository.updateShopData(request);
    }
}
