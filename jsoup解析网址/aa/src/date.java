import java.util.Date;


public class date {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date startdate=new Date();  
		Long t=startdate.getTime();
		for(int i=0;i<1000;i++){
			System.out .print("");
		}
		Date enddate=new Date();
	
		Long time=enddate.getTime()-t;
		System.out .print("\n»¨Ê±¼ä£º"+time);
	}

}
