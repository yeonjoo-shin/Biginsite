package com.bigin.api.advertiser.repository;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DataMapper {

    String d ="dd";
    public void insertData(SDRegisterRequest params);
}
