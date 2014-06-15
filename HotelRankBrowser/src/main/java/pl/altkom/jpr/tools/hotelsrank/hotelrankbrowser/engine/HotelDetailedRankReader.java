package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.DetailedRankAndInfo;

/**
 *
 * @author Leszek Bednorz
 */
public interface HotelDetailedRankReader extends PriorLoadedDoc {

    public DetailedRankAndInfo readDetailedRank(String hotelUrl);
}
