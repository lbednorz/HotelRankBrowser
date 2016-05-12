package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelDescriptionBrowser;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.template.HotelDescriptionBrowserTemplate;

/**
 *
 * @author Marcin Lis
 *
 */
public class DescriptionBrowserAgoda extends HotelDescriptionBrowserTemplate {

    public Elements parseDescription(Document doc) {
		Elements links = doc
		        .select("#ctl00_ctl00_MainContent_ContentMain_HotelInformation1_pnlDescription");
		return links;
	}

    public void setDocument(Document doc) {
        this.doc = doc;

    }

    public Map<String, List<String>> loadFacilites(String pageUrl) {

        Map<String, List<String>> returnValue = new HashMap<String, List<String>>();
        try {
            if ((doc == null) || (!loadedUrl.equals(pageUrl))) {
                doc = Jsoup.connect(pageUrl).userAgent("Mozilla").get();
                loadedUrl = pageUrl;
            }

            returnValue.put("Udogodnienia", createRows("#ctl00_ctl00_MainContent_ContentMain_HotelFeatures1_trFacilites"));
            returnValue.put("Sport i rekreacja", createRows("#ctl00_ctl00_MainContent_ContentMain_HotelFeatures1_trSport"));
            returnValue.put("Internet", createRows("#ctl00_ctl00_MainContent_ContentMain_HotelFeatures1_trInternet"));
            returnValue.put("Parking", createRows("#ctl00_ctl00_MainContent_ContentMain_HotelFeatures1_trCarpark"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }

    private List<String> createRows(String tag) {
        List<String> udogodnienia = new ArrayList<String>();
        Elements table = doc
                .select(tag);

        for (Element tab : table) {
            //System.out.println("tab= " + tab);
            for (Element row : tab.select("p.black")) {
//                    Elements tds = row.select("td");
                if (row.text().length() > 0) {
                    udogodnienia.add(row.text());
                }
            }
        }
        return udogodnienia;
    }

    public Map<String, String> loadUsefoulInfo(String pageUrl) {
        Map<String, String> returnValue = new HashMap<String, String>();
        try {
            if ((doc == null) || (!loadedUrl.equals(pageUrl))) {
                doc = Jsoup.connect(pageUrl).userAgent("Mozilla").get();
                loadedUrl = pageUrl;
            }
            Elements table = doc
                    .select("#ctl00_ctl00_MainContent_ContentMain_HotelInformation1_pnlUsefulInfo>div>div");
            for (Element tab : table) {
                String key = tab.select(".useful_left").text();
                String value = tab.select(".floatleft").text();
                returnValue.put(key, value);                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return returnValue;
    }

}
