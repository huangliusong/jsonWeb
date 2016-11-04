import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class link4 {

    /** 
     * 根据jsoup方法获取htmlContent 
            * 加入简单的时间记录 
     * @throws IOException  
     */  
    public static String getContentByJsoup(String url){  
        String content="";  
        try {  
            System.out.println("time===开始==start");  
            //响应开始时间
            Date startdate=new Date();
            //设置url
            Document doc=Jsoup.connect(url)  
            .data("jquery", "java")  // 请求参数 
            .userAgent("Mozilla")  // 设置 User-Agent 
            .cookie("auth", "token")  // 设置 cookie 
            .timeout(50000)  // 设置连接超时时间
            .get();  		// 使用 Get 方法访问 URL .
            //结束时间
            Date enddate=new Date();  
            // 响应时间差
            Long time=enddate.getTime()-startdate.getTime(); 
            //输出
            System.out.println("使用Jsoup耗时=="+time);  
            System.out.println("time=====end");  
            content=doc.toString();//获取iteye网站的源码html内容  
            System.out.println(doc.title());//获取iteye网站的标题  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
      //  System.out.println("我是黄柳淞"+content);   
        return content;  
    }  

}
