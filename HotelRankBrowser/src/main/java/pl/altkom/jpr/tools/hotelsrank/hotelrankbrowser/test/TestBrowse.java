/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.test;

import pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.engine.agoda.DescriptionBrowserAgoda;

/**
 *
 * @author W530
 */
public class TestBrowse {
    public static void main(String args[]){
    	
    	DescriptionBrowserAgoda da = new DescriptionBrowserAgoda();
    	String str= da.loadDescription("http://www.agoda.com/pl-pl/jumpunta-gardenview-resort/hotel/bangkok-th.html");
    	System.out.println(str);	
    }
}
