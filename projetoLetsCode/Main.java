
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        TransformaTemperatura transformador = new TransformaTemperatura();
        CalcularMedia calculador = new CalcularMedia();
        System.out.println("Digite a quantidade de temperaduras a serem transformadas: ");
        int quantidadeTemp = Integer.parseInt(sc.nextLine());
        double[] temperaturas = new double[quantidadeTemp];
        System.out.println("Digite as temperaduras a serem transformadas: ");
        for (int i = 0; i < quantidadeTemp; i++) {
            temperaturas[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Digite a unidade de origem da temperatura(Celsius, Kelvin ou Fahrenheit): ");
        String unidadeOriginal = sc.nextLine();
        System.out.println("Digite a unidade de temperatura a ser transformada(Celsius, Kelvin ou Fahrenheit): ");
        String unidadeTranformada = sc.nextLine();

        double[] temperaturasTransformadas = new double[quantidadeTemp];

        for(int j = 0; j<temperaturas.length; j++){
            temperaturasTransformadas[j] = transformador.transformacaoTemperatura(temperaturas[j], unidadeOriginal.toLowerCase(), unidadeTranformada.toLowerCase());
        }

        System.out.printf("As Temperaturas passadas em %s são: "+"\n", unidadeOriginal);
        for(double temperatura: temperaturas){
            System.out.printf("%.2f" + "\n", temperatura);
        }

        System.out.printf("As Temperaturas transformadas em %s são: "+"\n", unidadeTranformada);
        for(double temperaturaTransformada: temperaturasTransformadas){
            System.out.printf("%.2f" + "\n", temperaturaTransformada);
        }

        double mediaTemperaturaInicial = calculador.calculaMedia(temperaturas);
        double mediaTemperaturaTransformada = calculador.calculaMedia(temperaturasTransformadas);

        System.out.printf("A média das temperaturas com a unidade inicial: %s é: %.2f" + "\n", unidadeOriginal, mediaTemperaturaInicial);
        System.out.printf("A média das temperaturas com a unidade transformada em: %s é: %.2f" + "\n", unidadeTranformada, mediaTemperaturaTransformada);

    }
}
