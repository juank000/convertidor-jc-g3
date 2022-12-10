import javax.swing.JOptionPane;

public class FunctionTemperature {
    ConverterTemperature temperature = new ConverterTemperature();

    public void convertTemperature(double value) {
        String options = (JOptionPane.showInputDialog(null, "Seleccionar operación", "Temperatura",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Celcius a Farenheit", "Celcius a Kelvin", "Farenheit a Celcius", "Kelvin a Celcius", "Kelvin a Farenheit"}, "Selected")).toString();

        switch (options) {
            case "Celcius a Farenheit": {
                temperature.ConvertCelciusToFarenheit(value);
                break;
            }
            case "Celcius a Kelvin": {
                temperature.ConvertCelciusToKelvin(value);
                break;
            }
            case "Farenheit a Celcius": {
                temperature.ConvertFarenheitToCelcius(value);
                break;
            }
            case "Kelvin a Celcius": {
                temperature.ConvertKelvinToCelcius(value);
                break;
            }
            case "Kelvin a Farenheit": {
                temperature.ConvertirKelvinToFarenheit(value);
                break;
            }
        }
    }
}
