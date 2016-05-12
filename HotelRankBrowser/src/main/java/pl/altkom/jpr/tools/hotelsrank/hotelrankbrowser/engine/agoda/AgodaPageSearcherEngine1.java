package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelPageSearcher;

public final class AgodaPageSearcherEngine1 implements HotelPageSearcher {

	private static final String COUNTRY_XML = "country.xml";
	private static final String URL = "http://www.agoda.com/pl-pl/%s/hotel/%s-%s.html";


	public String searchPage(String hotelName, String city, String country) {
		String url = String.format(URL, hotelName, city,
				prepareCountry(country));
		return url;
	}

	private String prepareExpression(String country) {
		StringBuilder sb = new StringBuilder();
		sb.append("/countries/country[@name='");
		sb.append(country);
		sb.append("']");
		return sb.toString();
	}

	private String prepareCountry(String country) {
		try {
			InputStream resourceAsStream = AgodaPageSearcherEngine1.class
					.getResourceAsStream(COUNTRY_XML);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(resourceAsStream);
			XPath xPath = XPathFactory.newInstance().newXPath();
			String expression = prepareExpression(country);
			String result = xPath.compile(expression).evaluate(doc);
			return result;
		} catch (Exception e) {
			return null;
		}

	}

}
