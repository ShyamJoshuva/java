import java.util.*;
class Main{
  
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    int a=0;
    a=sc.nextInt();
    if(a>100){
      System.out.println("Invalid");
    }
    else{
      if(a<=100 && a>=90){
        System.out.println("Grade A.");
      }
      else{
        if(a<90 && a>=80){
          System.out.println("Grade B.");
        }
        else{
          if(a<80 && a>=70){
            System.out.println("Grade C.");}
            else{
              if(a<70 && a>=60){
                  if(a==69){System.out.println("69.");}
                  else{System.out.println("Grade d.");}
              }
              else{
                if(a<60 && a>=50){
                  System.out.println("Grade E.");
                }
                else{
                  System.out.println("Fail.");
                  }
              }
            } 
          } 
        }       
      }
    }
  }