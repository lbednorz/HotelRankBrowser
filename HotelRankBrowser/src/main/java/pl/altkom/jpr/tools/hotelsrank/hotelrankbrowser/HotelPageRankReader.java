/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.*;
import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.model.*;
/**
 *
 * @author Leszek Nednorz
 */
public abstract class HotelPageRankReader {
    
   protected HotelDescriptionBrowser hotelDescriptionBrowser;
   protected HotelDetailedRankReader hotelDetailedRankReader;
   protected HotelMainRankReader hotelMainRankReader;
   protected HotelPageSearcher hotelPageSearcher;
   
   protected String engineName;
   
  
   
   public HotelInfo getInfo(String name, String city, String country){
       
       HotelInfo info  = new HotelInfo();
       info.setEngineName(engineName);
       info.setPageUrl(hotelPageSearcher.searchPage(name, city, country));
       if (info.getPageUrl() == null){
           return null;
       }
       info.setDescription(hotelDescriptionBrowser.loadDescription(info.getPageUrl()));
       info.setFacilites(hotelDescriptionBrowser.loadFacilites(info.getPageUrl()));
       info.setUsefoulInfo(hotelDescriptionBrowser.loadUsefoulInfo(info.getPageUrl()));
       info.setMainRank(hotelMainRankReader.readMainRank(info.getPageUrl()));
       info.setDetailedRank(hotelDetailedRankReader.readDetailedRank(info.getPageUrl()));
       
       return info;
       
       
   }
 
    
}
