import javax.swing.JOptionPane;

public class FunctionCurrency {
    ConverterCurrency currency = new ConverterCurrency();

    public void convertCurrency(double inputValue) {
        String options = (JOptionPane.showInputDialog(null, "Seleccionar operación", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"COP a USD", "COP a EUR", "USD a COP", "EUR a COP"}, "Selected")).toString();

        switch (options) {
            case "COP a USD": {
                currency.convertCopToUsd(inputValue);
                break;
            }
            case "COP a EUR": {
                currency.convertCopToEur(inputValue);
                break;
            }
            case "USD a COP": {
                currency.convertUsdToCop(inputValue);
                break;
            }
            case "EUR a COP": {
                currency.convertEurToCop(inputValue);
                break;
            }
            default:
                throw new IllegalArgumentException("Valor inválido");
        }
    }
}
