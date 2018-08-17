
public class ejecicio1 {

	public static void mlb(int a) {
		// TODO Auto-generated method stub
		a+=10;
       System.out.println("zona3 ="+a);
       a=30;
       System.out.println("zona 4 ="+a);
	}
	
	public static void mla(int a) {
		
       System.out.println("zona 5 ="+a);
       mlb(a);
       
       if(a>5) {
    	   mlb(10);
       }
       System.out.println("zona 6 ="+a);
       a=10;
       System.out.println("zona 7 ="+a);
       mlb(a);
       System.out.println("zona 8 ="+a);
	}
	public static void main(String[] args) {
		
		int a=5;
		System.out.println("zona 1="+a);
		mla(a);
		System.out.println("zona 2 ="+a);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
