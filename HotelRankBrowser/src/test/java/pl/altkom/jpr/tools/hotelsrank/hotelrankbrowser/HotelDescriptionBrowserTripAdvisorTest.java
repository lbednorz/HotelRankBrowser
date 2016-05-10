package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.template.HotelDescriptionBrowserTemplate;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.tripadvisor.DescriptionBrowserTripAdvisor;

public class HotelDescriptionBrowserTripAdvisorTest {
	String pageUrl = "http://pl.tripadvisor.com/Hotel_Review-g274837-d1218723-Reviews-Andel_s_Hotel_Lodz-Lodz_Lodz_Province_Central_Poland.html";

	@Test
	public void test() {
		HotelDescriptionBrowserTemplate edsc = new DescriptionBrowserTripAdvisor();
		String loadDescription = edsc.loadDescription(pageUrl);
		System.out.println(loadDescription);
		assertTrue(isStringNotNullAndNotEmpty(loadDescription));
	}

	private boolean isStringNotNullAndNotEmpty(String loadDescription) {
		return (loadDescription != null && loadDescription.length() > 0 );
	}

}
