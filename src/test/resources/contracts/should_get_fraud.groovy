package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'POST'
        url '/fraudcheck'
        body([
                id        : "12345",
                loanAmount: 99999
        ])
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body([
                fraudCheckStatus: "FRAUD",
                message         : "Amount too high"
        ])
        headers {
            contentType('application/json')
        }
    }
}
