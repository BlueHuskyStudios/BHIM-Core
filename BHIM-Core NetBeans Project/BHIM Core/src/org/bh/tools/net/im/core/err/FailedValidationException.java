package org.bh.tools.net.im.core.err;

/**
 * FailedValidationException, made for BHIM, is copyright Blue Husky Programming ©2015 BH-1-PS <hr/>
 *
 * Represents that a computed checksum did not match a cached checksum.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2015-09-30 (1.0.0) - Kyli created FailedValidationException
 * @since 2015-09-30
 */
public class FailedValidationException extends CorruptedMessageException {

    /**
     * Creates a new instance of {@link FailedValidationException} without detail message.
     */
    public FailedValidationException() {
        super();
    }
}
