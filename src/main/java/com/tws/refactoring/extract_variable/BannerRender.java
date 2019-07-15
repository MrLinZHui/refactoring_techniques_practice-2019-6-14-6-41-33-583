package com.tws.refactoring.extract_variable;

public class BannerRender {

    private static final String PLATFORM_MAC = "MAC";
    private static final String BROWSE_IE = "IE";

    public String renderBanner(String platform, String browser) {
        boolean IsMacOnIE = (platform.toUpperCase().contains(PLATFORM_MAC)) &&
                (browser.toUpperCase().contains(BROWSE_IE));
        if (IsMacOnIE) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
