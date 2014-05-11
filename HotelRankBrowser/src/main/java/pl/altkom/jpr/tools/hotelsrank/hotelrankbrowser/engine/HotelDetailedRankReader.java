package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.DetailedRank;

/**
 *
 * @author Leszek Bednorz
 */
public interface HotelDetailedRankReader {

    public DetailedRank readDetailedRank(String hotelUrl);
}
