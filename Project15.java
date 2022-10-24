import java.util.Scanner;
import java.io.*;
public class q15 {
    public static int k = -1000;
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the Integer :- ");
        int a = getint();

        while(a == -10){
            a = k;

        }

        Integer x = (Integer)a;

        int p = x.toString().length();
        
        getvalue(p, x);
        
        
        
        
    }
    public static int getint() throws IOException{
        Scanner newobj = new Scanner(System.in);

        try{
            int b = newobj.nextInt();
            while(b<0){
                System.out.println("Negative Value Please Try again");
                b = newobj.nextInt();
            }
            k = b;
            return b;
        }
        catch(Exception e){
            System.err.println("Error Found Try Entering Valid Integer Value");
            getint();

        }
        return -10;
        
        
    }
    public static void getvalue(int p,int x){ 
        if(p%2==0){
            int f = p/2;
            int k = 0;
            int l = (int)Math.pow(10,f);
            int j = (int)Math.pow(10,f);
            k = x % l ;    
            int q = k*j;
            int kx = 0;
            int pl = 0;
            int p2 = p;
            for(int op = f;op > 0; op--){
                int j1 = (int)Math.pow(10,p2);
                int j2 = (int)Math.pow(10,p2-1);
                kx = x%j1-x%j2 ;
                pl = pl + kx;
                
                p2 = p2-1;
            }
            int pl2 = 0;
            int j4 = (int)Math.pow(10,f);
            pl2 = pl/j4;
            System.out.println(q+pl2);
        }
        
        if(p%2!=0){

            int f = p/2;
            int k = 0;
            int l = (int)Math.pow(10,f);
            int j = (int)Math.pow(10,f+1);
            k = x % l ;    
            int q = k*j;
            int kx = 0;
            int pl = 0;
            int p2 = p;;
            for(int op = f ; op > 0 ; --op){
                int j1 = (int)Math.pow(10,p2);
                int j2 = (int)Math.pow(10,p2-1);
                kx = x%j1-x%j2 ;
                pl = pl + kx;
                p2 = p2-1;
                
            }
            int pl2 = 0;
            int j4 = (int)Math.pow(10,f+1);
            int j1 = (int)Math.pow(10,f+1);
            int j2 = (int)Math.pow(10,f);
            int q2 = x%j1-x%j2;
            pl2 = pl/j4;
            System.out.println(q + pl2 + q2);
            
        }

    
    }
}
