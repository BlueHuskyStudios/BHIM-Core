package org.bh.tools.net.im.core.msg;

import java.net.InetAddress;

/**
 * InternetLocation is copyright Blue Husky Programming ©2016 BH-1-PS <hr/>
 *
 * Designates somewhere on the Internet.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2016-03-19 (1.0.0) - Kyli created InternetLocation
 * @since 2016-03-19
 */
public interface InternetLocation {

    /**
     * @return The address to which the data will be sent
     */
    public InetAddress getAddress();

    /**
     * @return The port through which the data will be sent
     */
    public int getPort();
}
