# Cálculo de IMC (Índice de Massa Corporal)

Este projeto em Java faz o cálculo do IMC de diferentes pacientes e, com base em seu valor, imprime um diagnóstico.

## Descrição

O programa contém uma classe `Paciente` que recebe `altura` e `peso` no construtor, faz o cálculo do IMC e imprime na tela tanto o valor do IMC (com duas casas decimais) quanto o diagnóstico correspondente.

## Estrutura de Arquivos
├── App.java └── Paciente.java

- **App.java**: Classe principal que instancia os objetos `Paciente` e executa o programa.
- **Paciente.java**: Classe responsável pelo cálculo do IMC e por dar o diagnóstico.

## Código

### Paciente.java

```java
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

```
### App.java

```
public class App {
    public static void main(String[] args) throws Exception {
        Paciente A = new Paciente(1.75, 76.50);
        System.out.println("Diagnostico: " + A.diagnostico + "\n");
        Paciente B = new Paciente(1.68, 83.90);
        System.out.println("Diagnostico: " + B.diagnostico + "\n");
        Paciente C = new Paciente(1.78, 67.00);
        System.out.println("Diagnostico: " + C.diagnostico + "\n");
    }
}

```
Ao executar, você verá na tela o valor do IMC de cada paciente, formatado com duas casas decimais, seguido de seu respectivo diagnóstico.

## Notas

O cálculo do IMC é dado pela fórmula:

$$ \text{IMC} = \frac{\text{peso (kg)}}{(\text{altura (m)})^2} $$

Os intervalos para diagnóstico podem variar de acordo com a classificação, mas, neste exemplo, estamos usando a seguinte tabela:

- **< 16**: Baixo peso muito grave
- **16 a < 17**: Baixo peso grave
- **17 a < 18.5**: Baixo peso
- **18.5 a < 25**: Peso normal
- **25 a < 30**: Sobrepeso
- **30 a < 35**: Obesidade grau I
- **35 a < 40**: Obesidade grau II
- **>= 40**: Obesidade grau III

