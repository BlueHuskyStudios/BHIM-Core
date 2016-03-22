package org.bh.tools.net.im.core.msg;

/**
 * Copyright BHStudios ©2016 BH-1-PS <hr/>
 *
 * Created by Kyli Rouge on 2016-01-31.
 *
 * The body of a message ready to be sent across the network.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2016-01-01 (1.0.0) - Kyli created Body
 * @param <DataType> The type of data in this header
 * @since 2016-03-10
 */
public class Body<DataType> implements CharSequence, TransmittablePiece {

    protected DataType _content;
    protected CharSequence _cachedStringVersion;

    public Body(DataType content) {
        _content = content;
    }

    public DataType getContent() {
        return _content;
    }

    private void setContent(DataType content) {
        _content = content;
        _cachedStringVersion = null;
    }

    protected CharSequence getCachedStringVersion() {
        return _cachedStringVersion == null
                ? (_content == null
                        ? ""
                        : String.valueOf(_content))
                : _cachedStringVersion;
    }

    @Override
    public int length() {
        return getCachedStringVersion().length();
    }

    @Override
    public char charAt(int index) {
        return _content == null ? 0 : getCachedStringVersion().charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return _content == null ? null : getCachedStringVersion().subSequence(start, end);
    }

    @Override
    public long size() {
        return convertToBytes().length;
    }

    @Override
    public byte[] convertToBytes() {
        return getCachedStringVersion().toString().getBytes();
    }
}
