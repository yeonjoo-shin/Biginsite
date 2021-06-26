package com.bigin.api.advertiser.repository;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.bigin.api.advertiser.core.SDRegisterUpdateRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * create on2021/06/25
 * crud API
 *
 * @author yjshin
 * @since jdk11
 */
@Mapper
@Repository
public interface DataResisterReository {
    /**
     *  상품 데이터 등록.
     */
    void insertData(SDRegisterRequest params);

    /**
     *  상품 데이터 조회
     */

    List<SDRegisterRequest> findShopData(Map<String,String> param);

    /**
     * 상품 데이터 삭제.
     */
    void delShopData(Map<String,String> param);

    /**
     * 상품 데이터 수정.
     */
    void updateShopData(SDRegisterUpdateRequest request);
}
