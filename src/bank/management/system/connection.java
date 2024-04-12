package bank.management.system;

import java.sql.*;

public class connection {


        Connection connection;

        Statement statement;

        public connection() {

            try {

                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BanksysDB", "root", "jain@1609");
                statement = connection.createStatement();


            } catch (Exception g) {
                g.printStackTrace();
            }

        }

        public static void main(String[] args) {

            new connection();
        }
    }


