package com.github.swrirobotics.bags.reader.messages.serialization;

import com.github.swrirobotics.bags.reader.messages.serialization.MessageType;
import java.sql.Timestamp;

public class BagMessage {

    private String topic;
    private MessageType msg;
    private Timestamp timestamp;

    public BagMessage() {}

    public BagMessage(String topic, MessageType msg, Timestamp timestamp) {
        this.topic = topic;
        this.msg = msg;
        this.timestamp = timestamp;
    }

    public String getTopic() {
        return this.topic;
    }

    public MessageType getMessage() {
        return this.msg;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }
}
