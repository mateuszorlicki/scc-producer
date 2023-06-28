package com.scc.sccproducer.fraud;

import org.springframework.stereotype.Service;

@Service
public class FraudServiceImpl implements FraudService{

    private static final LoanResponse OK_RESPONSE = new LoanResponse(FraudCheckStatus.OK, "Amount is ok");
    private static final LoanResponse FRAUD_RESPONSE = new LoanResponse(FraudCheckStatus.FRAUD, "Amount too high");

    @Override
    public LoanResponse check(LoanRequest loanRequest) {
         /*if (loanRequest.getLoanAmount() > 10000) {
                return FRAUD_RESPONSE;
            } else {
                return OK_RESPONSE;
            }*/
        return null;
    }
}
