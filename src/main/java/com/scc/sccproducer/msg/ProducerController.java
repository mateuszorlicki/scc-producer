package com.scc.sccproducer.msg;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProducerController {

    private final ProducerMessageService producerMessageService;

    @GetMapping(value = "/producer", produces = "application/json")
    public String getProducerMessage() {
        return producerMessageService.getProducerMessage();
    }

}
