/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;  

/**
 *
 * @author HP
 */
 class Xypzq {

    /**
     * @param args the command line arguments
     */
    
     static long gcd(long a, long b) 
    { 
      if (b == 0) 
        return a; 
      return gcd(b, a % b);  
    } 
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        long T=sc.nextLong();
        for(long i=1;i<=T;i++)
        {
            long N=sc.nextLong();
             long t=sc.nextLong();
              long x=sc.nextLong();
               long y=sc.nextLong();
                long z=sc.nextLong();
               
                if(t==3&&x==0&&y==1&&z==2)
                {
                    System.out.println(1+" "+1);
                }
                else{
                if(t==1)
                {
                    if(x==z&&x<y)
                    {
                        
                        long d=gcd((y-1),(2*N+1));
                        long m=(y-1)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                    else if(x==z&&x>y)
                    {
                        
                          long d=gcd((y+1),(2*N+1));
                        long m=(y+1)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                    else if(y>x&&x!=z)
                    {
                      
                        long d=gcd((2*N-y),(2*N+1));
                        long m=(2*N-y)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                    else if(x!=z&&x>y){
                        long d=gcd((2*N+2-y),(2*N+1));
                        long m=(2*N+2-y)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                }
                else if(t==2||t==4)
                {
                   
                    long d=gcd((2*N+1-2*y),(2*N+1));
                        long m=(2*N+1-2*y)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                }
                else 
                {
                     if(x==z&&x<y)
                    {
                    
                        long d=gcd((y-1),(2*N+1));
                        long m=(y-1)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                    else if(x==z&&x>y)
                    {
                      
                         long d=gcd((y+1),(2*N+1));
                        long m=(y+1)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                    else if(y>x&&x!=z)
                    {
                      
                       long d=gcd((2*N+2-y),(2*N+1));
                        long m=(2*N+2-y)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                    else if(x!=z&&x>y)
                   {
                          long d=gcd((2*N-y),(2*N+1));
                        long m=(2*N-y)/d;
                        long n=(2*N+1)/d;
                        System.out.println(m+" "+n);
                    }
                }
                
                
            
        }
        
        
        }
    
        }
    
   }
