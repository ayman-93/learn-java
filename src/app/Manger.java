package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Manger
 */
public class Manger extends Employee {
    private String department;

    public Manger(long id, String name, String position, float salary, String department) {
        super(id, name, position, salary);
        this.department = department;
    }

    public void test() {
        super.test();
        System.out.println("Manger");
    }

    public void WriteFile() throws IOException {
        Path path = Paths.get("C:/Users/ayman/Desktop/java-course/Write to File/src/test.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("ID: " + this.id + "\n" + "Name: " + this.name + "\n");
            writer.write("Position: " + this.position + "\n");
            writer.write("Salary: " + this.salary + "\n");
            writer.write("Department: " + this.department);
        }
    }

    public void ReadFile() {
        String str = "";
        File file = new File("C:/Users/ayman/Desktop/java-course/Write to File/src/test.txt");
        Scanner sc;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                str += sc.nextLine() + "\n";
            }
            System.out.println(str);
            JOptionPane.showMessageDialog(null, str, "Manger Inforamtion", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // try {
        // BufferedReader br = new BufferedReader(new FileReader(file));
        // String str = "";
        // while (br.has) {
        // str += br.readLine();
        // System.out.println(str);

        // }

        // br.close();
        // } catch (FileNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

    }
}