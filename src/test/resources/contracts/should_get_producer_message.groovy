package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/producer'
    }
    response {
        status OK()
        body("Producer message")
        headers {
            contentType('application/json')
        }
    }
}