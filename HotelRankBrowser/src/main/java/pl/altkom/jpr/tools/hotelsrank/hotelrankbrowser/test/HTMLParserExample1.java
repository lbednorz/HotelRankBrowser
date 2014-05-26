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

public class HTMLParserExample1 {

    public static void main(String[] args) {

        Document doc;

        try {

            // need http protocol
//           doc = Jsoup.connect("http://www.google.com/cse?cx=006337136994700578281%3Aqan4jalbtjg&cof=FORID%3A11&q=melia+bali&ad=n9&num=10&rurl=http%3A%2F%2Fwww.agoda.com%2Fpl-pl%2Fpages%2Fagoda%2Fdefault%2Fpage_googleresults.aspx%3Fcx%3D006337136994700578281%253Aqan4jalbtjg%26cof%3DFORID%253A11%26q%3Dmelia%2Bbali").userAgent("Mozilla").get();
            doc = Jsoup.connect("http://www.google.com/cse?cx=006337136994700578281%3Aqan4jalbtjg&cof=FORID%3A11&q=Melia%2BBali%20Nusa+Dua&ad=n9&num=10&rurl=http%3A%2F%2Fwww.agoda.com%2Fpl-pl%2Fpages%2Fagoda%2Fdefault%2Fpage_googleresults.aspx%3Fcx%3D006337136994700578281%253Aqan4jalbtjg%26cof%3DFORID%253A11%26q%3DMelia%2BBali%2520Nusa%2BDua").userAgent("Mozilla").get();
            String title = doc.title();
            System.out.println("title : " + title);

            // get page title
            // get all links
            Elements links = doc.select("a[href]");
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
