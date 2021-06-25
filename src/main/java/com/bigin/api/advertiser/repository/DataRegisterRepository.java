package com.bigin.api.advertiser.repository;

import com.bigin.api.advertiser.core.SDRegisterRequest;

/**
 * create on2021/06/25
 * crud API
 *
 * @author yjshin
 * @since jdk11
 */
public interface DataRegisterRepository {

    /**
     *    상품 데이터 등록.
     */
    void insertShopData(SDRegisterRequest params);
}
