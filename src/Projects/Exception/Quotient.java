package Projects.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Quotient {

        public static void exept() throws FileNotFoundException, IOException, UserExeption  {
            Scanner input = new Scanner(System.in);

            // Запросити користувача ввести два цілі числа
            System.out.print("Enter two integers: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();
            if(number2==0) throw new IOException();
            if(number1==0) throw new FileNotFoundException();
            if (number1==3) throw new UserExeption("kjhbghg");
            System.out.println(number1 + " / " + number2 + " is " +
                    (number1 / number2));

        }
        public static void main(String[] args) {
            Connection connection = null;
            try {

                connection = DriverManager.getConnection("äf");


                exept();
                System.out.println();

            } catch (FileNotFoundException e) {
                System.out.println(e);

            } catch (IOException e) {
                System.out.println();
            } catch (SQLException | UserExeption e) {

            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

