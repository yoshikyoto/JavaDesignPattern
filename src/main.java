import java.io.*;

import AbstractFactory.factory.*;
import AbstractFactory.listfactory.*;

public class main {
	public static void main(String args[]) {
		// テキストのコードだとこう
		// Factory factory = Factory.getFactory(args[0]);
		Factory factory = Factory.getFactory("AbstractFactory.listfactory.ListFactory");
		
		Link asahi = factory.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factory.createLink("読売新聞", "http://www.yomiuri.co.jp");
		
		Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
		Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp");
		Link excite = factory.createLink("Excite", "http://www.excite.com.");
		Link google = factory.createLink("Google", "http://www.google.com");
		
		Tray tray_news = factory.createTray("新聞");
		tray_news.add(asahi);
		tray_news.add(yomiuri);
		
		Tray tray_yahoo = factory.createTray("Yahoo!");
		tray_yahoo.add(us_yahoo);
		tray_yahoo.add(jp_yahoo);
		
		Tray tray_search = factory.createTray("サーチエンジン");
		tray_search.add(tray_yahoo);
		tray_search.add(excite);
		tray_search.add(google);
		
		Page page = factory.createPage("LinkPage", "yoshiki_utakata");
		page.add(tray_news);
		page.add(tray_search);
		
		page.output();
	}
}
