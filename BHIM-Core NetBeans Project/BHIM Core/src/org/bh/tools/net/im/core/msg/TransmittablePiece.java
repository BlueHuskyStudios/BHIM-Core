package org.bh.tools.net.im.core.msg;

/**
 * TransmittablePiece, made for BHIM, is copyright Blue Husky Programming ©2016 BH-1-PS <hr/>
 *
 * A major piece of a message ready to be sent across the network.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2016-03-18 (1.0.0) - Kyli created Header
 * @since 2016-03-18
 */
public interface TransmittablePiece {

    public long size();

    public byte[] convertToBytes();
}
