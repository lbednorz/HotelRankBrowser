package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine;

/**
 *
 * @author Leszek Bednorz
 */
public interface HotelDescriptionBrowser extends PriorLoadedDoc {
   
     public String loadDescription(String pageUrl);
    
}
