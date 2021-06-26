package com.bigin.api.advertiser.controller;

import com.bigin.api.advertiser.core.SDRegisterRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.cj.log.Log;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@AutoConfigureMockMvc
class ResisterControllerTest {

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void setShopdataRegiTEst() throws Exception {
        String url = "/shopdata/insert";

        SDRegisterRequest request = new SDRegisterRequest();

        request.setAdverId("shopbot2");
        request.setPrdtCode("34");
        request.setPrdtPrice(3400);
        request.setPrdtImg("http:skkeke.com");
        request.setPrdtUrl("sdsere.com");

        String content = mapper.writeValueAsString(request);

        mockMvc.perform(MockMvcRequestBuilders.post(url)
        .content(content)
        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(result -> {
                    MockHttpServletResponse response = result.getResponse();
                });
    }

    @Test
    void findtest() throws  Exception {
        String url = "/shopdata/select/cj 건강상품2/46";

        mockMvc.perform(MockMvcRequestBuilders.get(url)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(result -> {
                    MockHttpServletResponse response = result.getResponse();
                });

    }


}