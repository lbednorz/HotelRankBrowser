package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.test;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda.AgodaPageSearcher;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda.DescriptionBrowserAgoda;

public class AgodaPageSearcherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgodaPageSearcher agoda = new AgodaPageSearcher();

		String searchPage = agoda.searchPage("Hotel Exquisit", "Munich",
				"Germany");
		System.out.println(searchPage);

		DescriptionBrowserAgoda da = new DescriptionBrowserAgoda();
    	String str= da.loadDescription(searchPage);
    	System.out.println(str);
	}

}
