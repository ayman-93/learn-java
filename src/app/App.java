package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog(null, "What is your name", "Name");
        Employee manger = new Manger(01, name, "Developer", 8000, "Development");

        manger.WriteFile();
        // Manger.WriteFile();
        manger.ReadFile();
    }
}
