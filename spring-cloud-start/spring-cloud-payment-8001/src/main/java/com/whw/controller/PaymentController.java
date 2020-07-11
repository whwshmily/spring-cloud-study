package com.whw.controller;

import com.whw.domain.Payment;
import com.whw.service.BasePaymentService;
import com.whw.util.ResultMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private BasePaymentService service;

    @PostMapping("/add")
    public ResultMessage addPayment(@RequestBody Payment payment) {
        int result = service.insert(payment);
        log.info("****增加的结果:" + result + "--->" + payment);
        if (result > 0) {
            return new ResultMessage<Payment>("200", "增加成功", payment);
        }
        return new ResultMessage("444", "增加失败");
    }

    @GetMapping("/get/{id}")
    public ResultMessage addPayment(@PathVariable("id") int id) {
        Payment result = service.findById(id);
        if (result != null) {
            return new ResultMessage<Payment>("200", "查询成功", result);
        }
        return new ResultMessage("444", "查询失败");
    }
}
