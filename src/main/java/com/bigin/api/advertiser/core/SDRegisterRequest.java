package com.bigin.api.advertiser.core;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
public class SDRegisterRequest {

    private String adverId;     // 광고주 아이디
    private String prdtCode;    // 상품 아이디
    private int    prdtPrice;   // 상품 가격
    private String prdtImg;     // 상품 이미지
    private String prdtUrl;     // 상품 url
    private Date   regDate;     // 생성일
    private Date   artDate;     // 수정일

}
