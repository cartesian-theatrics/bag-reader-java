package com.github.swrirobotics.bags.reader.messages.serialization;

import com.github.swrirobotics.bags.reader.messages.serialization.MessageType;
import java.sql.Timestamp;

public class BagMessage {
    final public String topic;
    final public MessageType msg;
    final public Timestamp timestamp;

    public BagMessage(String topic, MessageType msg, Timestamp timestamp) {
        this.topic = topic;
        this.msg = msg;
        this.timestamp = timestamp;
    }
}
