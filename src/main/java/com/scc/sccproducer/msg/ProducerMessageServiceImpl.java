package com.scc.sccproducer.msg;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ProducerMessageServiceImpl implements ProducerMessageService {

    List<String> messages = List.of("Message 1", "Message 2", "Message 3", "Message 4");

    @Override
    public String getProducerMessage() {
        Random random = new Random();
        int i = random.nextInt(messages.size() - 1);
        return messages.get(i);
    }
}
