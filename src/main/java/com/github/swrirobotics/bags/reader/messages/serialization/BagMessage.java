package com.github.swrirobotics.bags.reader.messages.serialization;

import com.github.swrirobotics.bags.reader.messages.serialization.MessageCollection;
import com.github.swrirobotics.bags.reader.records.Connection;

public class BagMessage {
    final public Connection conn;
    final public MessageCollection msg;

    public BagMessage(Connection conn, MessageCollection msg) {
        this.conn = conn;
        this.msg = msg;
    }
}
