package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda.*;

/**
 *
 * @author Leszek Bednorz
 */
public class AgodaBrowser extends HotelPageRankReader{

    public AgodaBrowser(){        
        this.engineName = "Agoda";
        this.hotelPageSearcher = new AgodaPageSearcherEngine2();
        this.hotelDescriptionBrowser = new DescriptionBrowserAgoda();
        this.hotelMainRankReader = new MainRankReaderAgoda();
        this.hotelDetailedRankReader = new DetailedRankReaderAgoda();
    }
}
