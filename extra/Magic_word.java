public class Magic_word{

     public static void main(String []args){
         int a=198;
         int d=a;
         int c=0;
         int b;
         
         for(int i=1;i<=a;i++)
         {
             
             b=d%10;
             d=d/10;
             c=c+b;
             
         }}
        System.out.println(c);
     }
}