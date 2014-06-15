package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Leszek Bednorz
 */
public interface HotelDescriptionBrowser extends PriorLoadedDoc {

    public String loadDescription(String pageUrl);

    public Map<String, List<String>> loadFacilites(String pageUrl);

    public Map<String, String> loadUsefoulInfo(String pageUrl);

}
