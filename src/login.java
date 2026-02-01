package  Employee.management.system_1;





import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class login extends JFrame implements ActionListener {

    JTextField tusername;
    JPasswordField tuser_password;
    JButton login, back;

    login(){

        JLabel username = new JLabel("Username");
        username.setBounds(40,20,100,30);
        add(username);

        tusername = new JTextField();
        tusername.setBounds(150,20,150,30);
        add(tusername);

        JLabel user_password = new JLabel("Password");
        user_password.setBounds(40,70,100,30);
        add(user_password);

        tuser_password = new JPasswordField();
        tuser_password.setBounds(150,70,150,30);
        add(tuser_password);

        login = new JButton("LOGIN");
        login.setBounds(150,140,150,30);
        login.setBackground(Color.black);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        back = new JButton("BACK");
        back.setBounds(150,180,150,30);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i22 = i11.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i33 = new ImageIcon(i22);
        JLabel imgg = new JLabel(i33);
        imgg.setBounds(350,10,600,400);
        add(imgg);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/LoginB.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,600,300);
        add(img);

        setSize(600,300);
        setLocation(450,200);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            try {
                String username = tusername.getText();
                String password = tuser_password.getText();

                var conn = new Conne();
                String sql = "INSERT INTO login (username, user_password) VALUES (?, ?)";
                ResultSet resultSet = conn.statement.executeQuery(sql);
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, username);
                String passwd = null;
                ps.setString(2, passwd);

                int i = ps.executeUpdate();
                if (!resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                } else {
                    setVisible(false);


                }

            } catch (Exception E) {
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        try {
            LoginPage login1 = new LoginPage();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}


