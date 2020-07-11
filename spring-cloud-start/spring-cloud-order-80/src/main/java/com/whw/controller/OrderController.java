package com.whw.controller;

import com.whw.domain.Payment;
import com.whw.util.ResultMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    private final String PAYMENT_URL = "http://localhost:8001";
    @Autowired
    private RestTemplate template;

    @GetMapping("/add")
    public ResultMessage<Payment> addPayment(Payment payment) {
        return template.postForObject(PAYMENT_URL + "/payment/add", payment, ResultMessage.class);
    }

    @GetMapping("/get/{id}")
    public ResultMessage<Payment> findPayment(@PathVariable("id") int id) {
        return template.getForObject(PAYMENT_URL + "/payment/get/" + id, ResultMessage.class);
    }
}
