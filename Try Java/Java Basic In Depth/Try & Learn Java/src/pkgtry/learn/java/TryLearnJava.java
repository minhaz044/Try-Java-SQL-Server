
package pkgtry.learn.java;
/**
 *
 * @author minhaz
 */
public class TryLearnJava {
 
    public static void main(String[] args) {
        
        BitWiseOperator test =new BitWiseOperator();
        test.inputA=10;
        test.inputB=20;
        System.out.println("Bitwise And & Or of " +test.inputA+"  &  "+test.inputB+ " is = "+ test.And()+"  &  "+test.Or());
        System.out.println();  System.out.println();  System.out.println("--------------------------------------------------------");System.out.println();
      
        LeftAndRightShift test1= new LeftAndRightShift();
        test1.inputA=4;
        test1.leftShift(1);
        test1.rightShift(1);
        System.out.println();  System.out.println();  System.out.println("--------------------------------------------------------");System.out.println();
        
        
        
        IfElse test2=new IfElse();
        System.out.println("This is our Maximum Function:"+ test2.maximum(10, 25));
        System.out.println("This is our Minimum Function:"+ test2.minimum(55, 22));
        test2.oddEven(25);
        System.out.println();  System.out.println();  System.out.println("--------------------------------------------------------");System.out.println();
 
       TernaryOperator test3=new TernaryOperator();
        System.out.println("Result Between 25,55\t"+test3.assignHigherValue(25, 55));
        System.out.println("Result Between 80,77\t"+test3.assignHigherValue(80, 77));
        System.out.println();  System.out.println("--------------------------------------------------------");  System.out.println();


        Pattern test4=new Pattern();
        test4.pattern7654567(9);
        test4.rectanglePattern(8);
        test4.pattern4123(5);
        System.out.println();  System.out.println("--------------------------------------------------------");  System.out.println();
     
                
        SwitchCase test5=new SwitchCase();
        test5.switchWithoutBreak(5);
        test5.switchWithBreak(5);
        test5.switchWithoutBreakAndDefault(20);
        System.out.println();  System.out.println("--------------------------------------------------------");  System.out.println();
          
          
        ForWhileDoWhileLoop test6=new ForWhileDoWhileLoop();
        test6.a.printASCI();
        System.out.println();  System.out.println("--------------------------------------------------------");  System.out.println();

        

        
    }
}













class ForWhileDoWhileLoop{
    forLoop a=new forLoop();
    class forLoop{
        void printASCI(){
            for (int i = 0; i <=127; i++) {
            	if(i%20==0) {
            	System.out.println();	
            	}
                System.out.print("ASCI Value of "+i+" is :  "+(char)i +"\t");
            }
        }
    }
    
    void forLoop(){
        
    }
    void whileLoop(){
        
    }
    void doWhileLoop(){
        
    }
            
    
    
}
class SwitchCase{
    void switchWithoutBreak(int i){
        System.out.println("Switch Case Result Without Break:");
        switch(i){
            case 1:
                System.out.println("This is One");
            case 2:
                System.out.println("This is Two");
            case 3:
                System.out.println("This is Three");
            case 4:
                System.out.println("This is Four");
            case 5:
                System.out.println("This is Five");   
            case 6:
                System.out.println("This is Six");
            case 7:
                System.out.println("This is Seven");  
            case 8:
                System.out.println("This is Eight");    
            case 9:
                System.out.println("This is Nine");   
            case 10:
                System.out.println("This is Ten");   
        }
        
    }
    
     void switchWithBreak(int i){
        System.out.println("Switch Case Result With Break:");
        switch(i){
            case 1:
                System.out.println("This is One");
                break;
            case 2:
                System.out.println("This is Two");
                break;
            case 3:
                System.out.println("This is Three");
                break;
            case 4:
                System.out.println("This is Four");
                break;
            case 5:
                System.out.println("This is Five"); 
                break;
            case 6:
                System.out.println("This is Six");
                break;
            case 7:
                System.out.println("This is Seven"); 
                break;
            case 8:
                System.out.println("This is Eight"); 
                break;
            case 9:
                System.out.println("This is Nine"); 
                break;
            case 10:
                System.out.println("This is Ten"); 
                break;
        }
        
    }   
    
    void switchWithoutBreakAndDefault(int i){
        System.out.println("Switch Case Result With Break And Default:");
        switch(i){
            case 1:
                System.out.println("This is One");
            case 2:
                System.out.println("This is Two");
            case 3:
                System.out.println("This is Three");
            case 4:
                System.out.println("This is Four");
            case 5:
                System.out.println("This is Five");   
            case 6:
                System.out.println("This is Six");
            case 7:
                System.out.println("This is Seven");  
            case 8:
                System.out.println("This is Eight");    
            case 9:
                System.out.println("This is Nine");   
            case 10:
                System.out.println("This is Ten");
            default:
                System.out.println("This number is not in Range(1-10)");
        }
        
    }  
    
}




class Pattern{
    void pattern7654567(int input){
        int printvalue=input;
        for(int i=1;i<=input;i++){
            for(int j=1;j<= input;j++){
                System.out.print(printvalue);
                if(i<=(input+1)/2){
                    if(i>j  ){
                        printvalue=printvalue-1; 
                    }else if(j>=input-(i-1) && j<input){
                        printvalue=printvalue+1;   
                    }

                }else {
                     
                    if(input-i>=j){
                        printvalue=printvalue-1; 
                    
                    }else if( j>=i && j<input){
                        printvalue=printvalue+1;   
                    }                    


                }
   
            }
            
            
            System.out.println();
        }
        
    }
    void rectanglePattern(int n) {
    
    	for(int i=1;i<=n;i++) {
    		for (int j = 1;j<=n;j++) {
    			if(i==1 || i==n) {
    				System.out.print("*");
    				
    			}else if(j==1 || j==n) {
    				System.out.print("*");
    				
    			}else {
    				System.out.print(" ");
    			}
    			
				
			}
    		System.out.println();
    	}
    }
    void pattern4123(int n) {

    	for (int i = 1; i <=n; i++) {
        	int k=i;
    		for (int j = 1; j <=n ;j++) {
				System.out.print(k);
    			if(k==n) {
    				k=0;
    			}
    			k++;
			}
    		
			System.out.println();
		}
    }
    
}

class TernaryOperator{
    int maxvalue;
    int assignHigherValue(int x,int y){
        
        maxvalue= x>y?x:y;
        return maxvalue;
         
    }
} 

class BitWiseOperator {
  
    public int inputA,inputB;
    int And(){
        return inputA & inputB;
        
    }
    int Or(){
        return inputA | inputB;
    }
    
}

class LeftAndRightShift{
    public int inputA;
    
    void leftShift(int shift){
        System.out.println((inputA<<shift) +"\t");
    }
    void rightShift(int shift){
        System.out.println((inputA>>shift) +"\n");
    }
}

class IfElse{

    int minimum(int inputA,int inputB){
        if (inputA> inputB){
            return inputB;
        }else{
            return inputA;
        }  
    }
    int maximum(int inputA,int inputB){
        if (inputA < inputB){
            return inputB;
        }else{
            return inputA;
        }        
    }
    
    void oddEven(int inputA){
        if(inputA%2==0){
            System.out.println("This is a Even Number");
        }else{
            System.out.println("This is a Odd Number");
        }
    }   
}