package com.convpay.convpay.service;

import org.junit.jupiter.api.Test;

import static com.convpay.convpay.service.MoneyUseResult.USE_FAIL;
import static com.convpay.convpay.service.MoneyUseResult.USE_SUCCESS;
import static org.junit.jupiter.api.Assertions.*;

class MoneyAdapterTest {
    MoneyAdapter moneyAdapter = new MoneyAdapter();
    @Test
    void money_use_fail(){
        //given
        Integer payAmount = 1000_001;
        //when
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);
        //then
        assertEquals(USE_FAIL, moneyUseResult);
    }

    @Test
    void money_use_success(){
        //given
        Integer payAmount = 1000_000;
        //when
        MoneyUseResult moneyUseResult = moneyAdapter.use(payAmount);
        //then
        assertEquals(USE_SUCCESS, moneyUseResult);
    }
}