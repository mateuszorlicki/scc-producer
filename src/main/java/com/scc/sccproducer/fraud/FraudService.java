package com.scc.sccproducer.fraud;

public interface FraudService {

    LoanResponse check(LoanRequest loanRequest);
}
