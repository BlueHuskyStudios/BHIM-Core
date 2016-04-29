package org.bh.tools.net.im.core.meta;

/**
 *
 * @author ben_s
 */
public enum FeatureToggle {
    @SuppressWarnings("Convert2Lambda")
    IPv6(false, "Allow clients to communicate via IPv6", new OnFeatureToggled() {
        @Override
        public void onFeatureToggled() {
            System.setProperty("java.net.preferIPv4Stack", Boolean.toString(IPv6.isEnabled()));
        }
    });

    private final String DESCRIPTION;
    private boolean enabled;

    private FeatureToggle(boolean initEnabled, String initDescription, OnFeatureToggled initInternalListener) {
        enabled = initEnabled;
        DESCRIPTION = initDescription;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getDescription() {
        return DESCRIPTION;
    }

    //TODO: load from preferences file on startup

    private static interface OnFeatureToggled {

        public void onFeatureToggled();
    }
}
