package com.bigin.api.advertiser.repository;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.mysql.cj.xdevapi.SessionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class JDBCDataRegisterRepository  implements  DataRegisterRepository{
    @Override
    public void insertShopData(SDRegisterRequest params) {

    }
}
