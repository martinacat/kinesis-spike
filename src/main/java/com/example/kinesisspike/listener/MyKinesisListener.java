package com.example.kinesisspike.listener;

import com.example.kinesisspike.dto.MyData;
import com.example.kinesisspike.dto.MyMetadata;
import de.bringmeister.spring.aws.kinesis.KinesisListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MyKinesisListener {

    @KinesisListener(stream = "foo-stream")
    public void handle(MyData data, MyMetadata metadata) {
        log.info("Data: {}, Metadata: {}", data, metadata);
    }
}