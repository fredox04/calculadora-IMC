public class Paciente{
    double altura;
    double peso;
    double IMC;
    String diagnostico;

    Paciente(double altura, double peso){
        this.altura = altura;
        this.peso = peso;
        this.IMC = calcularIMC(peso, altura);
        this.diagnostico = dar_diagnostico(IMC);
    }

    double calcularIMC(double peso, double altura){
        double IMC = peso/(altura*altura);
        System.out.printf("IMC: %.2f \n", IMC);
        return IMC;
    }

    String dar_diagnostico(double IMC){
        if (IMC < 16){
            return "Baixo peso muito grave";
        }
        else if (IMC >= 16 && IMC < 17){
            return "Baixo peso grave";
        }
        else if (IMC >= 17 && IMC < 18.5){
            return "Baixo peso";
        }
        else if (IMC >= 18.5 && IMC < 25){
            return "Peso normal";
        }
        else if (IMC >= 25 && IMC < 30){
            return "Sobrepeso";
        }
        else if (IMC >= 30 && IMC < 35){
            return "Obesidade grau I";
        }
        else if (IMC >= 35 && IMC < 40){
            return "Obesidade grau II";
        }
        else{
            return "Obesidade grau III";
        }
    }
}