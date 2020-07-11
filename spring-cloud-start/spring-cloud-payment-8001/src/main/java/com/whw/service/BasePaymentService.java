package com.whw.service;

import com.whw.domain.Payment;

public interface BasePaymentService {
    int insert(Payment payment);

    Payment findById(int id);
}
