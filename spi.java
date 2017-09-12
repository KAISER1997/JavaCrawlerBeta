package ninja;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import org.jsoup.Jsoup;  
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;  

public class spi {

	public static void main(String[] args) {
		String stfu="http://jsoup.org";
		Set<String> store=new HashSet<String>();
		Queue<String> waiting=new LinkedList<>();
		Document doc = null;
	 waiting.add(stfu);
	 
 int u=0;
 while(1!=0)
 {
	 
	String ss=waiting.remove();
	if((store.contains(ss)))
	{
		continue;
	}
	
	if(!(store.contains(ss)))
	{ 
		System.out.println(ss);
		++u;
		if(u==52)
			break;
		store.add(ss);
		 Elements links =  InListe(ss);
		 for(Element lint:links)
		 {   
			 String absHref = lint.attr("abs:href");
			waiting.add(absHref);
			 
			 //System.out.println(absHref);
			 
		 }
		
		
		
		
	}
 	 
	 
 }
 
 
  
 
	}
	
	
public static Elements InListe(String hoe)
{
	
	Document doc = null;
	try {
	   doc = Jsoup.connect(hoe).get();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 Elements links = doc.select("a[href]");
 return(links);
	
	
	
	
}
	
 	

}
