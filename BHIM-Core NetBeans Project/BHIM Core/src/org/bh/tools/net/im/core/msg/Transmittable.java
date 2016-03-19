package org.bh.tools.net.im.core.msg;

/**
 * Transmittable, made for BHIM, is copyright Blue Husky Programming ©2016 BH-1-PS <hr/>
 *
 * A message ready to be sent across the network.
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2016-03-10 (1.0.0) - Kyli created Transmittable
 * @param <HeaderType> The type of header in this transmittable
 * @param <BodyType>
 * @param <FooterType>
 * @since 2016-03-10
 */
public interface Transmittable<HeaderType extends Header, BodyType extends Body, FooterType extends Footer> extends TransmittablePiece {

    /**
     * @return the header in this Transmittable.
     */
    public HeaderType getHeader();

    /**
     * @return the body in this Transmittable.
     */
    public BodyType getBody();

    /**
     * @return the footer in this Transmittable.
     */
    public FooterType getFooter();
}
