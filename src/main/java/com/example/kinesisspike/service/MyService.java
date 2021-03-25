package com.example.kinesisspike.service;

import de.bringmeister.spring.aws.kinesis.AwsKinesisOutboundGateway;
import de.bringmeister.spring.aws.kinesis.Record;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final AwsKinesisOutboundGateway gateway;

    public MyService(AwsKinesisOutboundGateway gateway) {
        this.gateway = gateway;
    }

    public void sendMyMessage() {
        Record record = new Record(new MyMessage("my content"), new MyMetadata("my metadata"));
        gateway.send("my-stream", record);
    }
}