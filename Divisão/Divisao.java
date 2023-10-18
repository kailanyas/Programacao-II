public class Divisao{
    private int numero1;
    private int numero2;
    private int resto;
    
    public void setResto(int numero1, int numero2){
        this.resto = (numero1 % numero2);
    }
    
    public int getResto(){
        return this.resto;
    }
}
