package segundo.modulo.aulas.dominio;

//Aulas 03
public class Calculadora {
    public void soma(){
        System.out.println(10+10);
    }

    public void subtracao(){

        System.out.println(25-10);
    }

    public void multiplicacao(int number1, int number2){
        System.out.println(number1*number2);
    }

    public double divisao(double number1, double number2){
        if (number1 ==0 || number2 == 0){
            return 0;
        }
        return number1/number2;
    }

    //Video Aula 52 - Aula 08
    public void somaArry(int [] numeros){
        int soma = 0;
        for (int i: numeros){
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarargs(int... numeros){
        int soma = 0;
        for (int i: numeros){
            soma += i;
        }
        System.out.println(soma);
    }

}

