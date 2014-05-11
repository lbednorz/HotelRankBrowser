/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.*;

/**
 *
 * @author Leszek Nednorz
 */
public abstract class HotelPageRankReader {
    
   protected HotelDescriptionBrowser hotelDescriptionBrowserEngine;
   protected HotelDetailedRankReader hotelDetailedRankReader;
   protected HotelMainRankReader hotelMainRankReader;
   protected HotelPageSearcher hotelPageSearcher;
   
   
   public boolean checkConfig(){
       return true;
   }
   
 
    
}
