package Employee.management.system_1;


import jdk.internal.agent.Agent;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginPage extends JFrame {
    conn c;
    private Agent tfUsername;
    private JPasswordField pfPassword;


    public LoginPage() throws SQLException {
            setSize(400, 300);
             c = new conn();
              System.out.println(c.conn); // must NOT be null

        setLayout(null);
            setVisible(true);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);k

            JLabel label = new JLabel("Login Page");
            label.setBounds(150, 120, 100, 30);
            add(label);





// 🔥 REQUIRED
        }
    private void login() {
        try {
            if (c.con != null) {
                String sql = "SELECT * FROM login WHERE username=? AND user_password=?";
                PreparedStatement ps = c.con;

                ps.setString(1, String.valueOf(tfUsername.getClass()));
                ps.setString(2, String.valueOf(pfPassword.getPassword()));

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Login Successful");
                    new Main_class();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Username or Password");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Database connection failed");
                return;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void main(String[] args) throws SQLException {
            new LoginPage();
            System.out.println(c.conn);

        }

}
