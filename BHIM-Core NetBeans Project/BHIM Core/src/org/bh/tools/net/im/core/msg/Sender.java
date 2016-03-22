package org.bh.tools.net.im.core.msg;

import java.net.InetAddress;

/**
 * Sender is copyright Blue Husky Programming ©2016 BH-1-PS <hr/>
 *
 * Designates a person from whom a transmission originated.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2016-03-21 (1.0.0) - Kyli created Sender
 * @since 2016-03-21
 */
public class Sender implements Source {

    private InetAddress address;
    private int port;

    public Sender(InetAddress address, int port) {
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

    public class MutableSender extends Sender {

        public MutableSender(InetAddress address, int port) {
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
