package com.bigin.api.advertiser.core;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class SDRegisterUpdateRequest {

    private String adverId;     // 광고주 아이디
    private String prdtCode;    // 상품 아이디
    private int    prdtPrice;   // 상품 가격
    private String prdtImg;     // 상품 이미지
    private String prdtUrl;     // 상품 url

    //업데이트 여부
    private String prdtPriceUpdateYn;
    private String prdtImgUpdateYn;
    private String prdtUrlUpdateYn;
}
