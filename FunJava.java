import java.io.*;

class FunJava {
    
    public static void fun (int a) 
    {
        String r = Integer.toString(a);
        for (int i=0; i<r.length(); i++) {
            System.out.println(r.charAt(i));
        }
        System.out.println(a);
    }
    
	public static void main (String[] args) {
		
		fun(1244);
		
	}
}