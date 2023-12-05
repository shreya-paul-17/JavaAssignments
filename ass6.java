import javax.swing.JOptionPane;

public class ass6 {
    public static void main(String args[]) {
        int button = 0;
        while (button != 5) {
            String number1, number2;
            double a, b, ans;

            String opt = JOptionPane.showInputDialog("1.addition\n 2.subtraction\n 3.multiplication\n 4.division\n -99.exit");
                    
            button = Integer.parseInt(opt);
            switch (button) {
                case 1:
                    number1 = JOptionPane.showInputDialog("enter first decimal number");
                    number2 = JOptionPane.showInputDialog("enter first decimal number");
                    a = Double.parseDouble(number1);
                    b = Double.parseDouble(number2);
                    ans = a + b;
                    JOptionPane.showMessageDialog(null, ans);
                    break;
                case 2:
                    number1 = JOptionPane.showInputDialog("enter first decimal number");
                    number2 = JOptionPane.showInputDialog("enter first decimal number");
                    a = Double.parseDouble(number1);
                    b = Double.parseDouble(number2);
                    ans = a - b;
                    JOptionPane.showMessageDialog(null, ans);
                    break;
                case 3:
                    number1 = JOptionPane.showInputDialog("enter first decimal number");
                    number2 = JOptionPane.showInputDialog("enter first decimal number");
                    a = Double.parseDouble(number1);
                    b = Double.parseDouble(number2);
                    ans = a * b;
                    JOptionPane.showMessageDialog(null, ans);
                    break;
                case 4:
                    number1 = JOptionPane.showInputDialog("enter first decimal number");
                    number2 = JOptionPane.showInputDialog("enter first decimal number");
                    a = Double.parseDouble(number1);
                    b = Double.parseDouble(number2);
                    ans = a / b;
                    JOptionPane.showMessageDialog(null, ans);
                    break;
                case -99:
                    System.exit(0);
            }
        }
    }
}