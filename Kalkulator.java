import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame implements ActionListener {
    // Membuat komponen GUI
    JTextField textField;
    JButton[] buttons;
    String[] buttonLabels = { 
    "1", "2", "3", "/",
    "*", "4", "5", "6",
    "-", "+", "7", "8",
    "9", ".", "=", 
    "0", "+", "C"
};
    String operator = "";
    double num1 = 0, num2 = 0, result = 0;

    public Kalkulator() {
        setTitle("Kalkulator Sederhana");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        add(textField, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));
        buttons = new JButton[buttonLabels.length];
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        String text = source.getText();

        if (text.equals("=")) {
            // Menyelesaikan perhitungan ketika tombol "=" ditekan
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        textField.setText("Error");
                        return;
                    }
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result; // update num1 untuk operasi berikutnya
            operator = ""; // reset operator
        } else if (text.equals("C")) {
            // Hapus semua dan reset kalkulator ketika tombol "C" ditekan
            textField.setText("");
            num1 = num2 = result = 0;
            operator = "";
        } else if (text.equals("/") || text.equals("*") || text.equals("-") || text.equals("+")) {
            // Menyimpan operator untuk operasi berikutnya
            operator = text;
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
        } else {
            // Menambahkan angka atau titik desimal pada textField
            textField.setText(textField.getText() + text);
        }
    }

    public static void main(String[] args) {
        Kalkulator frame = new Kalkulator();
        frame.setVisible(true);
    }
}
