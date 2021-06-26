package com.bigin.api.advertiser.repository;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

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
     *    상품 데이터 등록.
     */
    void insertData(SDRegisterRequest params);
}
