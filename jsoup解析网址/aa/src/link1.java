import java.io.IOException;


public class link1 {

    /** 
     * @method ���Ի�ȡ���ݳ��� 
     */  
    public static void main(String[] args) throws IOException {  
          
        /** 
         * ִ�з������� 
         */  
        String url="http://www.iteye.com/";  
        String HtmlContent=link4.getContentByJsoup(url);  
        String divContent=link3.getDivContentByJsoup(HtmlContent);  
        link2.getLinksByJsoup(divContent);  
    }  

}
