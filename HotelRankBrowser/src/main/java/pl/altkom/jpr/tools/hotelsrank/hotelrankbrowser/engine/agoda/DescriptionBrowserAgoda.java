package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelDescriptionBrowser;

/**
 * 
 * @author Marcin Lis
 * 
 */
public class DescriptionBrowserAgoda implements HotelDescriptionBrowser {

	private Document doc;

	public String loadDescription(String pageUrl) {

		try {
			if (doc == null) {
				doc = Jsoup.connect(pageUrl).userAgent("Mozilla").get();
			}
			Elements links = doc
					.select("#ctl00_ctl00_MainContent_ContentMain_mainHotelPhotoHD_lblTotalScore");

			for (Element link : links) {
				return link.text();
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	public void setDocument(Document doc) {
		this.doc = doc;

	}

}
