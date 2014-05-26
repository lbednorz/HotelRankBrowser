package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelPageSearcher;

public final class AgodaPageSearcherEngine2 implements HotelPageSearcher {

    Logger logger = Logger.getLogger(AgodaPageSearcherEngine2.class);

    public String searchPage(String hotelName, String city, String country) {
        org.jsoup.nodes.Document doc;
        try {
            String hotelNameURL = hotelName.replace(" ", "%2B");
            String cityUrl = city.replace(" ", "%2B");
            String hotelNameURL2 = hotelName.replace(" ", "+");
            String cityUrl2 = city.replace(" ", "+");
            String url = "http://www.google.com/cse?cx=006337136994700578281%3Aqan4jalbtjg&cof=FORID%3A11&q=" + hotelNameURL + "%20" + cityUrl2 + "&ad=n9&num=10&rurl=http%3A%2F%2Fwww.agoda.com%2Fpl-pl%2Fpages%2Fagoda%2Fdefault%2Fpage_googleresults.aspx%3Fcx%3D006337136994700578281%253Aqan4jalbtjg%26cof%3DFORID%253A11%26q%3D" + hotelNameURL + "%2520" + cityUrl;
//            String url = "http://www.google.com/cse?cx=006337136994700578281%3Aqan4jalbtjg&cof=FORID%3A11&q=" + hotelNameURL + "%20"+cityUrl2+"&ad=n9&num=10&rurl=http%3A%2F%2Fwww.agoda.com%2Fpl-pl%2Fpages%2Fagoda%2Fdefault%2Fpage_googleresults.aspx%3Fcx%3D006337136994700578281%253Aqan4jalbtjg%26cof%3DFORID%253A11%26q%3Dmelia%2Bbali";
            doc = Jsoup.connect(url).userAgent("Mozilla").get();
            String title = doc.title();
            if (logger.isDebugEnabled()) {
                logger.debug("title : " + title);
                logger.debug("Real url : " + url);
            }
            // get page title
            // get all links
            Elements links = doc.select("a[href]");
//            System.out.println(links.toString());
            for (Element link : links) {

                if (logger.isDebugEnabled()) {
                    logger.debug("link : " + link.attr("href"));
                    logger.debug("text : " + link.text());
                    logger.debug("class : " + link.className());
                }
                if ((link.text().contains("Rezerwacja hoteli i noclegów online"))
                        || (link.text().contains("rezerwuj pokoje w hotelu"))) {
                    return link.attr("href");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

}
