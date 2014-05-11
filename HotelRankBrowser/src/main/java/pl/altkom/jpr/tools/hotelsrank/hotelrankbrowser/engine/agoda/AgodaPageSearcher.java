package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelPageSearcher;

public final class AgodaPageSearcher implements HotelPageSearcher {

	private static final String COUNTRY_XML = "country.xml";
	private static final String COUNTRY_ATTRIB = "alpha-2";
	private static final String COUNTRY_PATTERN = "/countries/country[@name='%s']";
	private static final String URL = "http://www.agoda.com/pl-pl/%s/hotel/%s-%s.html";

	public String searchPage(String hotelName, String city, String country) {
		String url = String.format(URL, prepareHotelName(hotelName),
				prepareCity(city), prepareCountry(country));
		return url;
	}

	private String prepareHotelName(String hotelName) {
		hotelName = hotelName.replaceAll(" ", "-");
		return hotelName.toLowerCase();
	}

	private String prepareCity(String city) {
		return city.toLowerCase();
	}

	private String prepareExpression(String country) {
		return String.format(COUNTRY_PATTERN, country);
	}

	private Document prepareDocumentCountry() throws Exception {
		InputStream resourceAsStream = Test.class
				.getResourceAsStream(COUNTRY_XML);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(resourceAsStream);
		return doc;
	}

	private String getAttribCountry(Document doc, String country)
			throws Exception {
		XPath xPath = XPathFactory.newInstance().newXPath();
		String expression = prepareExpression(country);
		Element evaluate = (Element) xPath.compile(expression).evaluate(doc,
				XPathConstants.NODE);
		String result = evaluate.getAttribute(COUNTRY_ATTRIB);
		return result;
	}

	private String prepareCountry(String country) {
		try {
			Document doc = prepareDocumentCountry();
			String result = getAttribCountry(doc, country);
			return result.toLowerCase();
		} catch (Exception e) {
			return "";
		}
	}

}
