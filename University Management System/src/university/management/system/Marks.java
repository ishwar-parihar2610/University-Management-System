/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Marks extends JFrame{

   JTextArea studentName;
   JPanel p1;
   
   Marks(){}
   Marks(String str){
       setSize(500,600);
       setLayout(new BorderLayout());
       
       p1 = new JPanel();

       studentName = new JTextArea(50,15);
       JScrollPane jsp = new JScrollPane(studentName);
       studentName.setFont(new Font("Senserif",Font.ITALIC,18));
       
       add(p1,"North");
       
       add(jsp,"Center");
       
       setLocation(450,200);
       mark(str);
   }
   
   public void mark(String s){
    try{
           conn c = new conn();
           
           studentName.setText("\tResult of Examination\n\nSubject\n");
           
           ResultSet rs1 = c.s.executeQuery("select * from subject where rollno="+s);
           
           if(rs1.next()){
               studentName.append("\n\t"+rs1.getString("subjecstudentName"));
               studentName.append("\n\t"+rs1.getString("subject2"));
               studentName.append("\n\t"+rs1.getString("subject3"));
               studentName.append("\n\t"+rs1.getString("subject4"));
               studentName.append("\n\t"+rs1.getString("subject5"));
               studentName.append("\n-----------------------------------------");
               studentName.append("\n");
           }
           
           ResultSet rs2 = c.s.executeQuery("select * from marks where rollno="+s);
           
           if(rs2.next()){
               studentName.append("\nMarks\n\n\t"+rs2.getString("marks1"));
               studentName.append("\n\t"+rs2.getString("marks2"));
               studentName.append("\n\t"+rs2.getString("marks3"));
               studentName.append("\n\t"+rs2.getString("marks4"));
               studentName.append("\n\t"+rs2.getString("marks5"));
               studentName.append("\n-----------------------------------------");
               studentName.append("\n");
           }
         
       }catch(Exception e){
           e.printStackTrace();
       }
   }
   
   public static void main(String[] args){
       new Marks().setVisible(true);
   }
}