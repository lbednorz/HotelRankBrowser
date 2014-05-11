package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.DetailedRank;

/**
 *
 * @author Leszek Bednorz
 */
public interface HotelDetailedRankReader extends PriorLoadedDoc {

    public DetailedRank readDetailedRank(String hotelUrl);
}
