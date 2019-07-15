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
}
