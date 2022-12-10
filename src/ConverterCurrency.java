import javax.swing.JOptionPane;

public class ConverterCurrency {

    public void convertCopToUsd(double inputValue) {
        double dolar = inputValue / 4900.10;
        dolar = (double) Math.round(dolar*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + dolar + " Dolares");
    }

    public void convertUsdToCop(double inputValue) {
        double peso = inputValue * 4900.10;
        peso = (double) Math.round(peso*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + peso + " Pesos");
    }

    public void convertCopToEur(double inputValue) {
        double euro = inputValue / 5050.50;
        euro = (double) Math.round(euro*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + euro + " Euros");
    }

    public void convertEurToCop(double inputValue) {
        double peso = inputValue * 5050.50;
        peso = (double) Math.round(peso*100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + peso + " Pesos");
    }

}
