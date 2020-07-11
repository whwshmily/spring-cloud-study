package com.whw.service;

import com.whw.domain.Payment;
import com.whw.mapper.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class paymentServiceImpl implements BasePaymentService{
    @Autowired
    private PaymentMapper mapper;
    @Override
    public int insert(Payment payment) {
        return mapper.insert(payment);
    }

    @Override
    public Payment findById(int id) {
        return mapper.findById(id);
    }
}
