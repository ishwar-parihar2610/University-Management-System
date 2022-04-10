package university.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.*;

class AddStudent implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,studentName ,fatherName,age,dob,address,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    JComboBox c1,c2;
    
      
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
    
    

    public AddStudent(){
        f = new JFrame("Add Student");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("university/management/system/icons/fourth.jpg"));
        Image i3 = img.getImage().getScaledInstance(1220, 700,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);

        id8 = new JLabel("New Student Details");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        studentName=new JTextField();
        studentName.setBounds(200,150,150,30);
        id15.add(studentName);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        fatherName=new JTextField();
        fatherName.setBounds(600,150,150,30);
        id15.add(fatherName);

        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        age=new JTextField();
        age.setBounds(200,200,150,30);
        id15.add(age);

        id4= new JLabel("DOB (yyyy/mm/dd)");
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        dob=new JTextField();
        dob.setBounds(600,200,150,30);
        id15.add(dob);

        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        address=new JTextField();
        address.setBounds(200,250,150,30);
        id15.add(address);

        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);

        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id15.add(t7);

        id9= new JLabel("Class X(%)");
        id9.setBounds(400,300,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id15.add(t8);

        id10= new JLabel("Class XII(%)");
        id10.setBounds(50,350,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        id15.add(t9);


        id11= new JLabel("Aadhar No");
        id11.setBounds(400,350,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        id15.add(t10);

        id12= new JLabel("Roll No");
        id12.setBounds(50,400,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        t11.setText("1533"+first);
        id15.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(400,400,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab);
            
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,400,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Branch");
        lab2.setBounds(50,450,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,450,150,30);
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }

    public void actionPerformed(ActionEvent ae){
        
        String sName = studentName.getText();
        String sFather = fatherName.getText();
        String sAge = age.getText();
        String sDob = dob.getText();
        String addressText = address.getText();
        String mobileNumber = t6.getText();
        String studentGmailId = t7.getText();
        String studentMaticPercentage = t8.getText();
        String higherPercentage = t9.getText();
        String aadharNumber = t10.getText();
        String studentRollNumber= t11.getText();
        String studentSelectedCourse = (String)c1.getSelectedItem();
        String branch = (String)c2.getSelectedItem();


        System.out.println(" stundent name is ==> "+sName);
        System.out.println(" stundent father name is ==> "+sFather);
        System.out.println(" stundent age is ==> "+sAge);
        System.out.println(" date of birth age is ==> "+sDob);
        System.out.println(" address is ==> "+addressText);
        System.out.println(" mobile number is ==> "+mobileNumber);
        System.out.println(" mstudent gmail id is ==> "+studentGmailId);
        System.out.println(" higherPercentage ==> "+higherPercentage);
        System.out.println(" aadharNumber ==> "+aadharNumber);
        System.out.println(" studentRollNumber ==> "+studentRollNumber);
        System.out.println(" studentSelectedCourse ==> "+studentSelectedCourse);
        System.out.println(" branch ==> "+branch);
      //  c2 subject m
        // sDob dob
        if(ae.getSource() == b){

                conn cc = new conn();
                String q = "insert into student values('"+sName+"','"+sFather+"','"+sAge+"','"+addressText+"','"+studentGmailId+"','"+studentMaticPercentage+"','"+higherPercentage+"','"+aadharNumber+"','"+studentRollNumber+"','"+studentSelectedCourse+"','"+branch+"','"+mobileNumber+"','"+sDob+"')";
            try {
                cc.s.executeUpdate(q);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                f.setVisible(false);

        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new Project().setVisible(true);
            
        }
    }
    public static void main(String[ ] arg){
        new AddStudent().f.setVisible(true);
    }
}