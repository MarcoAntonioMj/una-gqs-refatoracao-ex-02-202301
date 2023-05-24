package Main.Calculo;

public class Mensalidade_Sexo_F {
    private static double mensalidade;


    public static double calcularMensalidade_Sexo_F(int idade, String sexo) {
        if (sexo.equalsIgnoreCase("F")) {
            if (idade <= 15) {
                setMensalidade(60.0);
            } else if (idade <= 18) {
                setMensalidade(60.0);
            } else if (idade <= 30) {
                setMensalidade(90.0);
            } else if (idade <= 40) {
                setMensalidade(90.0);
            } else {
                setMensalidade(90.0);
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
        Mensalidade_Sexo_F.mensalidade = mensalidade;
    }
    
    
}
