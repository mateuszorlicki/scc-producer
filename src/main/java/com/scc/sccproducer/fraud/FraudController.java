package com.scc.sccproducer.fraud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FraudController {

    private final FraudService fraudService;

    @PostMapping(value = "/fraudcheck", produces="application/json", consumes = "application/json")
    public LoanResponse check(@RequestBody LoanRequest loanRequest) {
        return fraudService.check(loanRequest);
    }
}
