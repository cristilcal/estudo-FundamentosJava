// 1 - Pacote
package fundamentos;

//2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Medidas {
    //3.1 - Atributos
    static Scanner entrada;
    //3.2 - Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area = 0;

        entrada = new Scanner(System.in); // instanciar o objeto de Leitura
        System.out.println("Escolha o Cálculo Desejado");
        System.out.println("(1) - Área do Quadrado");
        System.out.println("(2) - Área do Retângulo");
        System.out.println("(3) - Área do Triângulo");
        System.out.println("(4) - Área do Circulo");
        opcao = entrada.nextLine();
        switch (opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                //ToDO: calcular area do retangulo
                break;
            default:
                System.out.println("Opção Invalida: " + opcao);
        }
        if (area > 0){
        System.out.println("A área é de " + area + "m²");
        }

    }

    public static int calcularAreaDoQuadrado() {
        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); //leitura do tamanho do Lado
       return lado * lado;

    }
}
