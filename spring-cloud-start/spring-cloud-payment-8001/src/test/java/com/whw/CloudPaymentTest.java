package com.whw;

import com.whw.service.BasePaymentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CloudPaymentTest {
    @Autowired
    BasePaymentService service;
    @Test
    void testPayment(){
        System.out.println(service.findById(1));
    }
}
