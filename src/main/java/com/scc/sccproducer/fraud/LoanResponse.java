package com.scc.sccproducer.fraud;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class LoanResponse {

    private FraudCheckStatus fraudCheckStatus;

    private String message;
}
