import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class link2 {
    /** 
     * 使用jsoup分析divContent 
     * 1.获取链接 2.获取url地址（绝对路径） 
     */  
    public static void getLinksByJsoup(String divContent){  
        String abs="http://www.iteye.com/"; 
        //将相对地址转为绝对地址
        Document doc=Jsoup.parse(divContent,abs);  
        
        Elements linkStrs=doc.getElementsByTag("li");
        //链接地址数
        System.out.println("链接==="+linkStrs.size());  
        
        for(Element linkStr:linkStrs){  
        	/*getElementsByTag:通过标签获得元素*/
        	//attr(String key)  获得元素的数据
            String url=linkStr.getElementsByTag("a").attr("abs:href");
            //text()得到文本值
            String title=linkStr.getElementsByTag("a").text();
            System.out.println("标题:"+title+" url地址:"+url);  
        }  
    }  

}
