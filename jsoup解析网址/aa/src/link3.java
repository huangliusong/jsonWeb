import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

	
public class link3 {
    /** 
* ʹ��jsoup�����ĵ����� 
       * ��ȡĿ���������ڵ�Ŀ��� 
       * ���Ŀ��������div��table��tr�ȵ� 
*/  
public static String getDivContentByJsoup(String content){  
   
	//��ȡҪ������HTML
   Document doc=Jsoup.parse(content); 
   //
   Elements divs=doc.getElementsByClass("main_left"); 
   //
   String divContent=divContent=divs.toString();  
   System.out.println("��������������\n\n\n\n\n div:"+divContent);  
   return divContent;  
}  
}
