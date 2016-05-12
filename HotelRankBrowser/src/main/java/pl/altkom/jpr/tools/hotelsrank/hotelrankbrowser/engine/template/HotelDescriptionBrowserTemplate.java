package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.template;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelDescriptionBrowser;

public abstract class HotelDescriptionBrowserTemplate implements
		HotelDescriptionBrowser {

	public static Logger LOGGER = Logger.getLogger(HotelDescriptionBrowserTemplate.class);
	//TODO - Urywatnic po zabstraktowaniu wszystkich metod interfejsu 
	protected Document doc;
	protected String loadedUrl = "";
	
	
	public String loadDescription(String pageUrl) {
	
	    try {
	        if ((doc == null) || (!loadedUrl.equals(pageUrl))) {
	            doc = Jsoup.connect(pageUrl).userAgent("iexplore").get();
	            loadedUrl = pageUrl;
	        }
	
	        Elements links = parseDescription(doc);
	
	        for (Element link : links) {
	            return link.text();
	        }
	        return null;
	    } catch (Exception e) {
	    	LOGGER.error("Page " + pageUrl + " connection error: ", e);
	        return null;
	    }
	}

	/**
	 * Template method for html parsing for Description.
	 * @param doc 
	 * @return
	 */
	abstract protected Elements parseDescription(Document doc);
	
	

}
