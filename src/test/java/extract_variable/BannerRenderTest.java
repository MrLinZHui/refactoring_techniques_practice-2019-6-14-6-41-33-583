package extract_variable;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BannerRenderTest {
    @Test
    public void should_return_IE_on_Mac_when_send_platform_contain_mac_and_browser_contain_ie(){
        //given
        BannerRender bannerRender = new BannerRender();
        //when
        String renderBanner = bannerRender.renderBanner("Ipnoe_mac","browse_ie");
        //then
        assertEquals("IE on Mac?",renderBanner);
    }
    @Test
    public void should_return_banner_when_send_platform_not_contain_mac_and_browser_contain_ie(){
        //given
        BannerRender bannerRender = new BannerRender();
        //when
        String renderBanner = bannerRender.renderBanner("Ipnoe","browse_ie");
        //then
        assertEquals("banner",renderBanner);
    }
    @Test
    public void should_return_banner_when_send_platform_contain_mac_and_browser_not_contain_ie(){
        //given
        BannerRender bannerRender = new BannerRender();
        //when
        String renderBanner = bannerRender.renderBanner("Ipnoe_mac","browse");
        //then
        assertEquals("banner",renderBanner);
    }
}
