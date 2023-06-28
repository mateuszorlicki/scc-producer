package com.scc.sccproducer;

import com.scc.sccproducer.fraud.FraudCheckStatus;
import com.scc.sccproducer.fraud.FraudController;
import com.scc.sccproducer.fraud.FraudService;
import com.scc.sccproducer.fraud.LoanResponse;
import com.scc.sccproducer.msg.ProducerController;
import com.scc.sccproducer.msg.ProducerMessageService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;

public abstract class BaseTestClass {

    ProducerController producerController = new ProducerController(producerMessageService());
    FraudController fraudController = new FraudController(fraudService());

    @BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(this.producerController, this.fraudController);
    }

    private ProducerMessageService producerMessageService() {
        return () -> "Producer message";
    }

    private FraudService fraudService() {
        return argument -> new LoanResponse(FraudCheckStatus.FRAUD, "Amount too high");
    }
}
