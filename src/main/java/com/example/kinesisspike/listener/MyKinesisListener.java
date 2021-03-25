package com.example.kinesisspike.listener;

import com.example.kinesisspike.service.MyMetadata;
import de.bringmeister.spring.aws.kinesis.KinesisListener;
import org.springframework.stereotype.Service;

@Service
public class MyKinesisListener {

    @KinesisListener(stream = "foo-stream")
    public void handle(MyData data, MyMetadata metadata) {
        System.out.println(data + ", " + metadata);
    }
}