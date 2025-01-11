public class Paciente{
    double altura;
    double peso;
    double IMC;

    Paciente(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
        this.IMC = calcularIMC(peso, altura);
        diagnostico(IMC);
    }

    double calcularIMC(double peso, double altura){
        double IMC = peso/(altura*altura);
        System.out.printf("IMC: %.2f \n", IMC);
        return IMC;
    }

    void diagnostico(double IMC){
        if (IMC < 16){
            System.out.println("Baixo peso muito grave \n");
        }
        else if (IMC >= 16 && IMC < 17){
            System.out.println("Baixo peso grave \n");
        }
        else if (IMC >= 17 && IMC < 18.5){
            System.out.println("Baixo peso \n");
        }
        else if (IMC >= 18.5 && IMC < 25){
            System.out.println("Peso normal \n");
        }
        else if (IMC >= 25 && IMC < 30){
            System.out.println("Sobrepeso \n");
        }
        else if (IMC >= 30 && IMC < 35){
            System.out.println("Obesidade grau I \n");
        }
        else if (IMC >= 35 && IMC < 40){
            System.out.println("Obesidade grau II \n");
        }
        else{
            System.out.println("Obesidade grau III \n");
        }
    }
}