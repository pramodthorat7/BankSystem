// package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;



public class SignupOne extends JFrame implements ActionListener {

    // Declare variables
    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField,
            stateTextField, pincodeTextField;
    JRadioButton male, female, other, married, unmarried;
    JButton next;
    

    // Constructor
    SignupOne() {
        setLayout(null);
 
        // Generate a random application form number
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        // Application Form Number Label
        JLabel formno = new JLabel("Application Form No. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        // Personal Details Header
        JLabel personaldetail = new JLabel("Page 1: Personal Details");
        personaldetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personaldetail.setBounds(290, 80, 400, 40);
        add(personaldetail);

        // Name Field
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 150, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        nameTextField.setBounds(290, 150, 400, 30);
        add(nameTextField);

        // Father's Name Field
        JLabel fname = new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 200, 150, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        fnameTextField.setBounds(290, 200, 400, 30);
        add(fnameTextField);

        // Date of Birth Field
        JLabel dob = new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 250, 150, 30);
        add(dob);

        dobTextField = new JTextField();
        dobTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        dobTextField.setBounds(290, 250, 400, 30);
        add(dobTextField);

        // Gender Field
        JLabel gender = new JLabel("Gender: ");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 300, 150, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(300, 300, 90, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450, 300, 90, 30);
        female.setBackground(Color.WHITE);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(600, 300, 90, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);

        // Email Field
        JLabel email = new JLabel("Email Address: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 350, 150, 30);
        add(email);
/*
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        emailTextField.setBounds(290, 350, 400, 30);
        add(emailTextField);

        // Marital Status Field
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 400, 150, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(300, 400, 90, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(410, 400, 90, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);

        // Address Field
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 450, 150, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        addressTextField.setBounds(290, 450, 400, 30);
        add(addressTextField);

        // City Field
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 500, 150, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        cityTextField.setBounds(290, 500, 400, 30);
        add(cityTextField);

        // State Field
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 550, 150, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        stateTextField.setBounds(290, 550, 400, 30);
        add(stateTextField);

        // PinCode Field
        JLabel pincode = new JLabel("PinCode: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 600, 150, 30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 16));
        pincodeTextField.setBounds(290, 600, 400, 30);
        add(pincodeTextField);

        // Next Button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(450, 650, 80, 30);
        next.addActionListener(this);
        add(next);

        // Frame settings
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno = String.valueOf(random);
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = dobTextField.getText();
        String email = emailTextField.getText();
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        // Get selected gender
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        } else if (other.isSelected()) {
            gender = "Other";
        }

        // Get marital status
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        }

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required.");
            } else {
                // Save to database (using a mock Conn class)
                Conn c = new Conn(); // Ensure Conn class exists and is correct
                String query = "INSERT INTO signup VALUES ('" + formno + "','" + name + "','" + fname + "','" + dob
                        + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','"
                        + state + "','" + pincode + "')";
                c.s.executeUpdate(query);

                // Move to next page
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignupOne();
    }
}

*/