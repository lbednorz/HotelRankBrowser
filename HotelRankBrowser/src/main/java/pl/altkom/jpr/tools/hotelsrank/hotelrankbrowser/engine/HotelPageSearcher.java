package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine;

/**
 * 
 * @author Leszek Bednorz
 */
public interface HotelPageSearcher {
 
    /**
     * Return url to proper hotel page
     * @param hotelName
     * @param city
     * @param country
     * @return 
     */
    public String searchPage(String hotelName, String city, String country);
    
}
