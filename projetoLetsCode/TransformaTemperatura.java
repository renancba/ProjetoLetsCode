public class TransformaTemperatura {
    public TransformaTemperatura() {
    }
    public double transformacaoTemperatura(double temp, String unidadeInicial, String unidadeFinal) throws Exception {
        switch (unidadeInicial) {
            case "celsius":
                if (unidadeFinal.equalsIgnoreCase("kelvin")) {
                    return transformaCelsiusEmKelvin(temp);
                } else if (unidadeFinal.equalsIgnoreCase("fahrenheit")) {
                    return transformaCelsiusEmFahrenheit(temp);
                } else if (unidadeFinal.equalsIgnoreCase("celsius")) {
                    return temp;
                } else throw new Exception("Temperatura a ser transformada inválida.");
            case "fahrenheit":
                if (unidadeFinal.equalsIgnoreCase("kelvin")) {
                    return transformaFahrenheitEmKelvin(temp);
                } else if (unidadeFinal.equalsIgnoreCase("celsius")) {
                    return transformaFahrenheitEmCelsius(temp);
                } else if (unidadeFinal.equalsIgnoreCase("fahrenheit")) {
                    return temp;
                } else throw new Exception("Temperatura a ser transformada inválida.");
            case "kelvin":
                if (unidadeFinal.equalsIgnoreCase("fahrenheit")) {
                    return transformaKelvinEmFahrenheit(temp);}
                else if (unidadeFinal.equalsIgnoreCase("celsius")) {
                    return transformaKelvinEmCelsius(temp);}
                else if (unidadeFinal.equalsIgnoreCase("kelvin")) {
                    return temp;}
                else throw new Exception("Temperatura a ser transformada inválida.");
        }
        throw new Exception("Temperatura inicial inserida está inválida.");
    }
    private double transformaCelsiusEmKelvin(double temp) {
        return temp + 273.15;
    }
    private double transformaKelvinEmCelsius(double temp) {
        return temp-273.15;
    }
    private double transformaCelsiusEmFahrenheit(double temp){
        return (temp*(9/5))+32;
    }
    private double transformaFahrenheitEmCelsius(double temp){
        return (temp-32)*(5/9);
    }
    private double transformaFahrenheitEmKelvin(double temp){
        return transformaCelsiusEmKelvin(transformaFahrenheitEmCelsius(temp));
    }
    private double transformaKelvinEmFahrenheit(double temp){
        return transformaCelsiusEmFahrenheit(transformaKelvinEmCelsius(temp));
    }
}