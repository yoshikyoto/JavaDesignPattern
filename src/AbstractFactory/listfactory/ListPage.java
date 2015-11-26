package AbstractFactory.listfactory;

import java.util.Iterator;
import AbstractFactory.factory.*;

public class ListPage extends Page {
	public ListPage(String title, String author) {
		super(title, author);
	}
	
	@Override
	public String makeHtml() {
		StringBuffer buff = new StringBuffer();
		buff.append("<html><head><title>" + title + "</title></head>\n");
		buff.append("<body>\n");
		buff.append("<h1>" + title + "</h1>\n");
		buff.append("<ul>\n");
		Iterator iter = content.iterator();
		while(iter.hasNext()) {
			Item item = (Item)iter.next();
			buff.append(item.makeHtml());
		}
		buff.append("</ul>");
		buff.append("<hr><address>" + author + "</address>");
		buff.append("</body></html>\n");
		return buff.toString();
	}
}
