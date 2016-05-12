/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.*;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.HotelPageSearcher;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.tripadvisor.TripAdvisorPageSearcher;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda.*;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.DetailedRankAndInfo;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.HotelInfo;

/**
 *
 * @author W530
 */
public class TestBrowse {

    public static void main(String args[]) {

//        HotelPageRankReader reader = new AgodaBrowser();
//        Map<String, HotelInfo> findedUrl = new HashMap<String, HotelInfo>();
//        findedUrl.put("Melia Bali", reader.getInfo("Melia Bali", "Nusa Dua", "Indonesia"));
//        findedUrl.put("First Residence Samui", reader.getInfo("First Residence Samui", "Koh Samui", "Thailand"));
//        findedUrl.put("Ibis Bremen Altstadt", reader.getInfo("Ibis Bremen Altstadt", "Bremen", "Germany"));
//
//        System.out.println("------");
//        for (Map.Entry<String, HotelInfo> entry : findedUrl.entrySet()) {
//            String string = entry.getKey();
//            HotelInfo info = entry.getValue();
//            System.out.println(string + " - " + info);
//        }
//        DescriptionBrowserAgoda da = new DescriptionBrowserAgoda();
//        Map<String, List<String>> fsc = da.loadFacilites("http://www.agoda.com/pl-pl/melia-bali-indonesia/hotel/bali-id.html");
//        for (Map.Entry<String, List<String>> entry : fsc.entrySet()) {
//            String string = entry.getKey();
//            System.out.println("Klucz " + string);
//            List<String> list = entry.getValue();
//            for (String string1 : list) {
//                System.out.print(string1 + " - ");
//            }
//            System.out.println("");
//        }
        
//        da.loadUsefoulInfo("http://www.agoda.com/pl-pl/melia-bali-indonesia/hotel/bali-id.html");
//        System.out.println("");
//        System.out.println("Koniec");
        
//        DetailedRankReaderAgoda da = new DetailedRankReaderAgoda();
//        DetailedRankAndInfo info = da.readDetailedRank("http://www.agoda.com/pl-pl/melia-bali-indonesia/hotel/bali-id.html");
//        System.out.println(info.toString());
    }
}
