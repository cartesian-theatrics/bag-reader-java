package com.github.swrirobotics.bags.reader.messages.serialization;

import com.github.swrirobotics.bags.reader.records.Connection;
import com.github.swrirobotics.bags.reader.messages.serialization.MessageType;

public class BagMessage {
    final public Connection conn;
    final public MessageType msg;

    public BagMessage(Connection conn, MessageType mt) {
        this.conn = conn;
        this.msg = mt;
    }
}
