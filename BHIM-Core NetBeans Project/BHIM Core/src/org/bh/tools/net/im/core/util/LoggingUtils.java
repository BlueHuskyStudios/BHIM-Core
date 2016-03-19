package org.bh.tools.net.im.core.util;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bh.tools.log.handlers.DialogHandler;

/**
 * LoggingUtils, made for BHIM, is copyright Blue Husky Programming ©2015 BH-1-PS <hr/>
 *
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0 - 2015-08-29 (1.0.0) - Kyli created LoggingUtils
 * @since 2015-08-29
 */
@SuppressWarnings("ClassWithMultipleLoggers")
public class LoggingUtils {

    public static final Logger FOREGROUND = Logger.getLogger(PlatformInfo.APP_NAME_SHORT + ".FOREGROUND");
    public static final Logger BACKGROUND = Logger.getLogger(PlatformInfo.APP_NAME_SHORT + ".BACKGROUND");

    static {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        FOREGROUND.addHandler(new DialogHandler(Level.INFO));
        FOREGROUND.addHandler(new ConsoleHandler());

        BACKGROUND.addHandler(new ConsoleHandler());
    }

    private LoggingUtils() {
    }
}
