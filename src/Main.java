import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        FunctionCurrency currency = new FunctionCurrency();
        FunctionTemperature temperature = new FunctionTemperature();

        String options = (JOptionPane.showInputDialog(null, "Seleccionar opción", "Menu",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Selected")).toString();

        switch (options) {
            case "Conversor de Moneda": {
                String input = JOptionPane.showInputDialog("Ingrese un valor");

                try {
                    double value = Double.parseDouble(input);
                    currency.convertCurrency(value);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }

                endMssg();

                break;
            }
            case "Conversor de Temperatura": {
                String inputTemp = JOptionPane.showInputDialog("Ingrese un valor");

                try {
                    double valueTmp = Double.parseDouble(inputTemp);
                    temperature.convertTemperature(valueTmp);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido");
                }

                endMssg();

                break;
            }
            default:
                throw new IllegalArgumentException("Valor inválido");
        }
    }

    public static void endMssg() {
        int select = JOptionPane.showConfirmDialog(null, "Continuar?");
        if(JOptionPane.OK_OPTION == select) {
            System.out.println("Seleccionó opción afirmativa");
        } else {
            JOptionPane.showMessageDialog(null, "Programa terminado");
        }
    }
}