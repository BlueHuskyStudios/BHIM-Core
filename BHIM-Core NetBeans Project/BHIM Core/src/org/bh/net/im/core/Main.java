/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bh.net.im.core;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ben_s
 */
public class Main {

    public static final String BHIM_URL_STRING = "https://github.com/BlueHuskyStudios/BHIM/releases";
    public static final URL BHIM_URL;

    static {
        URL temp = null;
        try {
            temp = new URL(BHIM_URL_STRING);
        } catch (MalformedURLException ex) {
            Logger.getGlobal().log(Level.SEVERE, "Could not generate URL from string: " + BHIM_URL_STRING, ex);
        }
        BHIM_URL = temp;
    }

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UseSpecificCatch") // catch everything paranoidly
    public static void main(String[] args) {
        String title = "Oops! This isn't exactly an app.";
        String messageLine1 = "BHIM Core is a library for the core functionality of BHIM.";
        String message = messageLine1 + " \nFor the full instant messenger, see " + BHIM_URL_STRING;

        try {
            System.out.println(title);
            System.out.println(message);

            if (Desktop.isDesktopSupported()) {
                message = messageLine1;
                String initialSelectionValue = "OK";
                String navigateToUrlValue = "Go get BHIM!";
                String[] selectionValues = {initialSelectionValue, navigateToUrlValue};

                int selection = JOptionPane.showOptionDialog(
                        null, message, title, JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                        selectionValues, initialSelectionValue);

                if (selection == 1) {
                    Desktop.getDesktop().browse(BHIM_URL.toURI());
                }
            }
        } catch (Throwable t) {
            title = "Oops! Something went wrong.";
            message = "Couldn't open a browser! \nTo download it, yourself, go to: " + BHIM_URL_STRING;
            Logger.getGlobal().log(Level.SEVERE, message, t);
            JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
