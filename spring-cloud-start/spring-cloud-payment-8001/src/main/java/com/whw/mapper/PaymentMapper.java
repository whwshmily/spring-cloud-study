package com.whw.mapper;

import com.whw.domain.Payment;
import org.apache.ibatis.annotations.Param;
public interface PaymentMapper {

    int insert(Payment payment);

    Payment findById(@Param("id") int id);

}
