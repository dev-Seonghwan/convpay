package com.convpay;

import com.convpay.config.ApplicationConfig;
import com.convpay.dto.PayCancelRequest;
import com.convpay.dto.PayCancelResponse;
import com.convpay.dto.PayRequest;
import com.convpay.dto.PayResponse;
import com.convpay.service.ConveniencePayService;
import com.convpay.type.ConvenienceType;
import com.convpay.type.PayMethodType;

public class UserClient {
    public static void main(String[] args) {

        ApplicationConfig applicationConfig = new ApplicationConfig();
        ConveniencePayService conveniencePayService = applicationConfig.conveniencePayServiceDiscountPayMethod();

        //GS25, 결제 1000원
        PayRequest payRequest = new PayRequest(PayMethodType.CARD,
                ConvenienceType.GS25, 50);
        PayResponse payResponse = conveniencePayService.pay(payRequest);

        System.out.println(payResponse);

        //GS25, 취소 500원
        PayCancelRequest payCancelRequest = new PayCancelRequest(PayMethodType.MONEY,
                ConvenienceType.GS25, 500);
        PayCancelResponse payCancelResponse = conveniencePayService.payCancel(payCancelRequest);

        System.out.println(payCancelResponse);

    }
}
