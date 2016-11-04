import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

	
public class link3 {
    /** 
* 使用jsoup来对文档分析 
       * 获取目标内容所在的目标层 
       * 这个目标层可以是div，table，tr等等 
*/  
public static String getDivContentByJsoup(String content){  
   
	//获取要解析的HTML
   Document doc=Jsoup.parse(content); 
   //
   Elements divs=doc.getElementsByClass("main_left"); 
   //
   String divContent=divContent=divs.toString();  
   System.out.println("黄柳淞；；；；\n\n\n\n\n div:"+divContent);  
   return divContent;  
}  
}
