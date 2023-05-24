package Main.Calculo;

public class Mensalidade_Sexo_F {

    public static double calcularMensalidade_Sexo_F(int idade, String sexo) {
        double mensalidade;
        if (sexo.equalsIgnoreCase("F")) {
            if (idade <= 15) {
                mensalidade = 60.0;
            } else if (idade <= 18) {
                mensalidade = 60.0;
            } else if (idade <= 30) {
                mensalidade = 90.0;
            } else if (idade <= 40) {
                mensalidade = 85.0;
            } else {
                mensalidade = 80.0;
            }
        } else {
            System.out.println("Sexo inválido.");
            mensalidade = 0.0;
        }

        return mensalidade;
    }
    
}
