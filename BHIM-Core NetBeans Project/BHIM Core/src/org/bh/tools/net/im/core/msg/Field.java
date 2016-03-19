package org.bh.tools.net.im.core.msg;

/**
 * Field, made for BHIM, is copyright Blue Husky Programming ©2016 BH-1-PS <hr/>
 *
 * A small piece of a piece of a message to be sent across a network.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2016-03-18 (1.0.0) - Kyli created Header
 * @param <KeyType> The type of key which will label this field
 * @param <DataType> The type of data in this field
 * @since 2016-03-18
 */
public interface Field<KeyType, DataType> {

    public DataType getData();

    public long getSize();

    public KeyType getKey();
}
