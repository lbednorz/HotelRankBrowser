/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.test;

import java.util.HashMap;
import java.util.Map;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.*;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelPageSearcher;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.tripadvisor.TripAdvisorPageSearcher;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda.*;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.HotelInfo;

/**
 *
 * @author W530
 */
public class TestBrowse {
    public static void main(String args[]){
    	
//    	DescriptionBrowserAgoda da = new DescriptionBrowserAgoda();
//    	String str= da.loadDescription("http://www.agoda.com/pl-pl/jumpunta-gardenview-resort/hotel/bangkok-th.html");
//    	System.out.println(str);	
        
//        HotelPageSearcher tps = new TripAdvisorPageSearcher();
        HotelPageRankReader reader = new AgodaBrowser();
        Map<String, HotelInfo> findedUrl = new HashMap<String, HotelInfo>();
        findedUrl.put("Melia Bali", reader.getInfo("Melia Bali", "Nusa Dua", "Indonesia"));
        findedUrl.put("First Residence Samui", reader.getInfo("First Residence Samui", "Koh Samui", "Thailand"));
        findedUrl.put("Ibis Bremen Altstadt", reader.getInfo("Ibis Bremen Altstadt", "Bremen", "Germany"));
//        tps.searchPage("Melia Bali", "Nusa Dua", "Indonesia");
     
        System.out.println("------");
        for (Map.Entry<String, HotelInfo> entry : findedUrl.entrySet()) {
            String string = entry.getKey();
            HotelInfo info = entry.getValue();
            System.out.println(string + " - "+info);
        }
    }
}
 