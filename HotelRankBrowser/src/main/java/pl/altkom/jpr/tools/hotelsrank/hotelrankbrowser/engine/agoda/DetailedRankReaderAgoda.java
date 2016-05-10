package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelDetailedRankReader;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.DetailedRankAndInfo;

/**
 *
 * @author Marcin Lis
 *
 */
public class DetailedRankReaderAgoda implements HotelDetailedRankReader {

    private Document doc;
    private String loadedUrl = "";

    public DetailedRankAndInfo readDetailedRank(String hotelUrl) {

        try {
            if ((doc == null) || (!loadedUrl.equals(hotelUrl))) {
                doc = Jsoup.connect(hotelUrl).userAgent("Mozilla").get();
                loadedUrl = hotelUrl;
            }
            Elements values = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblFood");
            DetailedRankAndInfo rank = new DetailedRankAndInfo();

            for (Element val : values) {

                rank.setFood(toFloat(val.text()));
            }

            Elements values1 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblLocation");
            for (Element val : values1) {

                rank.setLoacalization(toFloat(val.text()));
            }

            Elements values2 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblValueOfMoney");
            for (Element val : values2) {

                rank.setWorthPrice(toFloat(val.text()));
            }

            Elements values3 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblRoomComfort");
            for (Element val : values3) {

                rank.setRoomComfort(toFloat(val.text()));
            }

            Elements values4 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblHotelCond");
            for (Element val : values4) {

                rank.setWorkers(toFloat(val.text()));
            }

            Elements values5 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblStaff");
            for (Element val : values5) {

                rank.setQuality(toFloat(val.text()));
            }
            Elements airportsInfo = doc.select("#ctl00_ctl00_MainContent_AlternateHotelLis_BulletHotelDescriptionHD_pnlDistanceToAirport");
            for (Element val : airportsInfo) {
                if (val.text() != null) {
                    rank.setDistanceToAirportInfo(val.text().replace("Odległość do lotniska:", ""));
                }

            }
            Elements likedBy = doc.select("#ctl00_ctl00_MainContent_AlternateHotelLis_BulletHotelDescriptionHD_pnlAreaRecommended");
            for (Element val2 : likedBy.select("li")) {
                if (val2.text() != null) {
                    rank.getAreaRecommended().add(val2.text());
                }
            }

            Elements values6 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblAllReviews2521");
            for (Element val : values6) {
                rank.setReviewCountAll(toInt(val.text()));
            }
            Elements values7 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblBusinessReviews2521");
            for (Element val : values7) {
                rank.setReviewCountBusinessTravelers(toInt(val.text()));
            }
            Elements values8 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblFamilyYoungReviews2521");
            for (Element val : values8) {
                rank.setReviewCountFamiliesWithYountChildrens(toInt(val.text()));
            }
            Elements values9 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblFamilyOlderReviews2521");
            for (Element val : values9) {
                rank.setReviewCOuntFamiliesWithOlderChildrens(toInt(val.text()));
            }
            Elements values10 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblCouplesReviews2521");
            for (Element val : values10) {
                rank.setReviewCountCouples(toInt(val.text()));
            }
            Elements values11 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblOthersReviews2521");
            for (Element val : values11) {
                rank.setReviewCountGroups(toInt(val.text()));
            }
            Elements values12 = doc.select("#ctl00_ctl00_MainContent_ContentMain_HotelReview1_lblSoloReviews2521");
            for (Element val : values12) {
                rank.setReviewCountSolorTravelers(toInt(val.text()));
            }

            return rank;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setDocument(Document doc) {
        this.doc = doc;

    }

    private float toFloat(String str) throws java.lang.NumberFormatException {
        String number = str.replace(",", ".");
        return Float.parseFloat(number);
    }

    private int toInt(String str) throws java.lang.NumberFormatException {
        str = str.replace("(", "");
        str = str.replace(")", "");
        return Integer.parseInt(str);
    }

}
