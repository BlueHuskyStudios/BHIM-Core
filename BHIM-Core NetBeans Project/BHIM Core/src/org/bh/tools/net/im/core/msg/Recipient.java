package org.bh.tools.net.im.core.msg;

import java.net.InetAddress;

/**
 * Recipient is copyright Blue Husky Programming ©2016 BH-1-PS <hr>
 *
 * Designates a person to whom a transmission is to be sent.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2016-03-20 (1.0.0) - Kyli created Recipient
 * @since 2016-03-20
 */
public class Recipient implements Destination {

    private InetAddress address;
    private int port;

    public Recipient(InetAddress address, int port) {
        this.address = address;
        this.port = port;
    }

    @Override
    public InetAddress getAddress() {
        return address;
    }

    @Override
    public int getPort() {
        return port;
    }

    public class MutableRecipient extends Recipient {

        public MutableRecipient(InetAddress address, int port) {
            super(address, port);
        }

        public void setAddress(InetAddress address) {
            super.address = address;
        }

        public void setPort(int port) {
            super.port = port;
        }
    }
}
