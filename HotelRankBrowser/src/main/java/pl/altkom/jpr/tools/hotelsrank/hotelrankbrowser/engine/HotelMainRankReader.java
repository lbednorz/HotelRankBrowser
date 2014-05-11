package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine;

/**
 * 
 * @author Leszek Bednorz
 */
public interface HotelMainRankReader extends PriorLoadedDoc  {
    
    public float readMainRank(String pageUrl);
    
}
