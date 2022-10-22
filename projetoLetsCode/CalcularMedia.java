public class CalcularMedia {

    public CalcularMedia() {
    }

    public double calculaMedia(double[] temperaturas){
        double soma = 0.0;
        for (int i = 0; i < temperaturas.length; i++) {
            soma += temperaturas[i];
        }
        return soma/ temperaturas.length;
    }
}
