package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelMainRankReader;

/**
 * 
 * @author Marcin Lis
 * 
 */
public class MainRankReaderAgoda implements HotelMainRankReader {

	private Document doc;

	public float readMainRank(String pageUrl) {

		try {
			if (doc == null) {
				doc = Jsoup.connect(pageUrl).userAgent("Mozilla").get();
			}
			Elements links = doc
					.select("#ctl00_ctl00_MainContent_ContentMain_mainHotelPhotoHD_lblTotalScore");

			for (Element link : links) {
				return new Float(link.text());
			}
			return 0;
		} catch (Exception e) {
			return 0;
		}
	}

	public void setDocument(Document doc) {
		this.doc = doc;

	}

}
