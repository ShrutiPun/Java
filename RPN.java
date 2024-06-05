import java.util.Scanner;
public class Unary{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
String token;
double[] arr=new double[10];

int i=0;
while(input.hasNext()){
 token=input.next();
 if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^")){
     
      double result=binary(arr[i-2],arr[i-1],token.charAt(0));
   
   arr[i-2]=result;
   i=i-1;
}else if(token.equals("~") || token.equals("@")  ){
      double result=unary(arr[i-1],token.charAt(0));

   arr[i-1]=result;
  

   
}

   else if(token.equals("$")){
      break;
}else{
  double x=Double.parseDouble(token);
    arr[i]=x;
    i++;

  }
}
System.out.printf("%f",arr[i-1]);
}
public static double binary(double x,double y,char operator){
  switch (operator){

 case'+':
   return x+y;
 case'-':
    return x-y;
 case'/':
    return x/y;
 case'*':
    return x*y;
 case'^':
    return Math.pow(x,y);
 default:
    return 0;
   }
 }

public static double unary(double x,char operator){
  switch (operator){

 case'@':
   return x;
 case'~':
    return -x;
  default:
    return 0;
   }
 }


}