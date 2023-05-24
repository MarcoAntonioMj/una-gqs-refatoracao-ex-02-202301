package Main.Calculo;

public class Mensalidade_Sexo_M {
    private static double mensalidade;


    public static double calcularMensalidade_Sexo_M(int idade, String sexo) {

        if (sexo.equalsIgnoreCase("M")) {
            if (idade <= 15) {
                setMensalidade(60.0);
            } else if (idade <= 18) {
                setMensalidade(75.0);
            } else if (idade <= 25) {
                setMensalidade(90.0);
            } else if (idade <= 40) {
                setMensalidade(85.0);
            } else {
                setMensalidade(800.0);
            }
        } else {
            System.out.println("Sexo inválido.");
            setMensalidade(0.0);
        }

        return getMensalidade();
    }


    public static double getMensalidade() {
        return mensalidade;
    }


    public static void setMensalidade(double mensalidade) {
        Mensalidade_Sexo_M.mensalidade = mensalidade;
    }
}
