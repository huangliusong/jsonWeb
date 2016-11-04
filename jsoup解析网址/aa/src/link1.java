import java.io.IOException;


public class link1 {

    /** 
     * @method 测试获取内容程序 
     */  
    public static void main(String[] args) throws IOException {  
          
        /** 
         * 执行分析程序 
         */  
        String url="http://www.iteye.com/";  
        String HtmlContent=link4.getContentByJsoup(url);  
        String divContent=link3.getDivContentByJsoup(HtmlContent);  
        link2.getLinksByJsoup(divContent);  
    }  

}
