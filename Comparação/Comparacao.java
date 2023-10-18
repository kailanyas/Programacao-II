public class Comparacao{
    public static void main(String[] args){
        float num1 = 9;
        float num2 = 9;
        boolean p = false;
        
        while(p == false){
            
            System.out.println("Comparando " + num1 + " e " + num2 +":");
            if(num1 == num2){
                System.out.println(+ num1 + " é igual a " + num2);
            }
            
            if(num1 < num2){
                System.out.println(+ num1 + " é menor que " + num2);
            }
            
            if(num1 > num2){
                System.out.println(+ num1 + " é maior que " + num2);
            }
            
            if(num1 != num2){
                System.out.println(+ num1 + " é diferente de " + num2);
            }
            
            p = true;
        }
    
    }

}
