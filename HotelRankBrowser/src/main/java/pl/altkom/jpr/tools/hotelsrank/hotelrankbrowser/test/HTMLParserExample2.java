/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr.tools.hotelsrank.hotelrankbrowser.test;

/**
 *
 * @author W530
 */
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HTMLParserExample2 {

    public static void main(String[] args) {

        Document doc;

        try {

            // need http protocol
            doc = Jsoup.connect("http://www.agoda.com/pl-pl/melia-bali-indonesia/hotel/bali-id.html").userAgent("Mozilla").get();
           
            
            String title = doc.title();
            System.out.println("title : " + title);

            // get page title
            // get all links
            Elements links = doc.select("#ctl00_ctl00_MainContent_ContentMain_mainHotelPhotoHD_lblTotalScore");
            for (Element link : links) {

                // get the value from href attribute
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());
                System.out.println("class : " + link.className());

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
