package AbstractFactory.listfactory;

import AbstractFactory.factory.*;
import java.util.Iterator;

public class ListTray extends Tray {
	public ListTray(String caption) {
		super(caption);
	}
	
	@Override
	public String makeHtml() {
		StringBuffer buff = new StringBuffer();
		buff.append("<li>\n");
		buff.append(caption + "\n");
		buff.append("<ul>\n");
		Iterator iter = tray.iterator();
		while(iter.hasNext()) {
			Item item = (Item)iter.next();
			buff.append(item.makeHtml());
		}
		buff.append("</ul>\n");
		buff.append("</li>\n");
		return buff.toString();
	}
}
