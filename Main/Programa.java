package Main;
import java.util.Scanner;

import Main.Calculo.Mensalidade_Sexo_F;
import Main.Calculo.Mensalidade_Sexo_M;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade do cliente: ");
        int idade = scanner.nextInt();

        System.out.print("Informe o sexo do cliente (M/F): ");
        String sexo = scanner.next();
        
        double mensalidade;


        if (sexo.equalsIgnoreCase("M")) {
            mensalidade = Mensalidade_Sexo_M.calcularMensalidade_Sexo_M(idade, sexo);
        } else if (sexo.equalsIgnoreCase("F")) {
            mensalidade = Mensalidade_Sexo_F.calcularMensalidade_Sexo_F(idade, sexo);
        } else {
            System.out.println("Sexo inválido.");
            mensalidade = 0.0;
        }

        System.out.println("Valor da mensalidade: R$" + mensalidade);

        scanner.close();
    }
    }

