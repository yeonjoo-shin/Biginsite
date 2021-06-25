package com.bigin.api.advertiser.service;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.bigin.api.advertiser.repository.DataMapper;
import com.bigin.api.advertiser.repository.DataRegisterRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
@Component
public class DataRegisterService {

    //private final DataRegisterRepository repository;


    /*public DataRegisterService(DataRegisterRepository repository) {
        this.repository = repository;
    }*/
    private final DataMapper mapper;
    public DataRegisterService(DataMapper mapper) {
        this.mapper = mapper;
    }

    /**
     *    상품 데이터 등록.
     */
    public void insertShopData(SDRegisterRequest params) {
        //repository.insertShopData(params);
        mapper.insertData(params);
    }
}
