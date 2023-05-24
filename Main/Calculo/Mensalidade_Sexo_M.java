package Main.Calculo;

public class Mensalidade_Sexo_M {
    public static double calcularMensalidade_Sexo_M(int idade, String sexo) {
        double mensalidade;

        if (sexo.equalsIgnoreCase("M")) {
            if (idade <= 15) {
                mensalidade = 60.0;
            } else if (idade <= 18) {
                mensalidade = 75.0;
            } else if (idade <= 25) {
                mensalidade = 90.0;
            } else if (idade <= 40) {
                mensalidade = 85.0;
            } else {
                mensalidade = 800.0;
            }
        } else {
            System.out.println("Sexo inválido.");
            mensalidade = 0.0;
        }

        return mensalidade;
    }
}
