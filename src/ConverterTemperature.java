import javax.swing.JOptionPane;

public class ConverterTemperature {
    public double ConvertCelciusToFarenheit(double value) {
        double farenheit = value * 1.8 + 32;
        farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Grados Celcius son " +farenheit+ " Grados Farenheit");
        return farenheit;
    }

    public void ConvertCelciusToKelvin(double value){
        double kelvin = value + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Grados Celcius son " +kelvin+ " Kelvin");
    }

    public void ConvertFarenheitToCelcius(double value) {
        double celcius = (value - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Grados Farenheit son " +celcius+ " Celcius");
    }

    public double ConvertKelvinToCelcius(double value) {
        double kelvinCelcius = value - 273.15;
        kelvinCelcius = (double) Math.round(kelvinCelcius *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Kelvin son " +kelvinCelcius+ " Celcius");
        return kelvinCelcius;
    }

    public void ConvertirKelvinToFarenheit(double value) {
        double kelvinFarenheit = ConvertKelvinToCelcius(value);
        kelvinFarenheit = ConvertCelciusToFarenheit(kelvinFarenheit);
        kelvinFarenheit	= (double) Math.round(kelvinFarenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +value+ " Kelvin son " +kelvinFarenheit+ " Celcius");
    }
}
