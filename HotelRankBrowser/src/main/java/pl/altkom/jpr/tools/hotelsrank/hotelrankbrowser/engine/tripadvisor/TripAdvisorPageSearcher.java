package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.tripadvisor;

import java.io.IOException;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelPageSearcher;

public final class TripAdvisorPageSearcher implements HotelPageSearcher {

    private static final String COUNTRY_XML = "country.xml";
    private static final String URL = "http://www.agoda.com/pl-pl/%s/hotel/%s-%s.html";

    public String searchPage(String hotelName, String city, String country) {
        org.jsoup.nodes.Document doc;

        try {

            String hotelNameURL = hotelName.replace(" ", "+");
            String cityUrl = city.replace(" ", "+");
            // need http protocol
            String url = "http://pl.tripadvisor.com/Search?q=%22" + hotelNameURL + "%22+" + cityUrl + "";
            System.out.println("Szukam na stronie : " + url);
            doc = Jsoup.connect(url).userAgent("Mozilla").get();
            String title = doc.title();
            System.out.println("title : " + title);

            // get page title
            // get all links
//            Elements links = doc.select(".searchResult.srLODGING > .srHead > a[href]");
            Elements results = doc.select(".searchResult.srLODGING");

            for (Element result : results) {

                Elements links = result.select(".srHead > a[href]");
                for (Element link : links) {
                    System.out.println("\nlink : " + link.attr("href"));
                    System.out.println("text : " + link.text());
                    System.out.println("class : " + link.className());
                    if (link.text().contains(hotelName)) {
                        return "http://pl.tripadvisor.com" + link.attr("href");
                    } else if (results.size() == 1) {
                         return "http://pl.tripadvisor.com" + link.attr("href");
                    }
                }
//                Elements descr = result.select(".srSubHead.soSubHead");
//                System.out.println("Szukam subnhesad");
//                for (Element desc : descr) {;
//                    System.out.println("description : " + desc.text());
//                    System.out.println("class : " + desc.className());
//                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
    
    
    private boolean checkUrlOk(String url, String hotelName, String city, String country){
        return false;
    }

}
