import java.io.IOException;
import java.util.Date;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class link4 {

    /** 
     * ����jsoup������ȡhtmlContent 
            * ����򵥵�ʱ���¼ 
     * @throws IOException  
     */  
    public static String getContentByJsoup(String url){  
        String content="";  
        try {  
            System.out.println("time===��ʼ==start");  
            //��Ӧ��ʼʱ��
            Date startdate=new Date();
            //����url
            Document doc=Jsoup.connect(url)  
            .data("jquery", "java")  // ������� 
            .userAgent("Mozilla")  // ���� User-Agent 
            .cookie("auth", "token")  // ���� cookie 
            .timeout(50000)  // �������ӳ�ʱʱ��
            .get();  		// ʹ�� Get �������� URL .
            //����ʱ��
            Date enddate=new Date();  
            // ��Ӧʱ���
            Long time=enddate.getTime()-startdate.getTime(); 
            //���
            System.out.println("ʹ��Jsoup��ʱ=="+time);  
            System.out.println("time=====end");  
            content=doc.toString();//��ȡiteye��վ��Դ��html����  
            System.out.println(doc.title());//��ȡiteye��վ�ı���  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
      //  System.out.println("���ǻ�����"+content);   
        return content;  
    }  

}
