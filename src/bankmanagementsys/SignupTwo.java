


package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
   
    JTextField pan, aadhar;
    JButton next;
   
    JRadioButton syes, sno, eyes, eno, other;
    JComboBox religion, category, occupation, education,income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
       

        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway", Font.BOLD, 20));
        Religion.setBounds(100,140,100,30);
        add(Religion);
        
        
        String valReligion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
         religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE );
        add(religion);
        
      
        
         JLabel Category = new JLabel("Category:");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100,190,200,30);
        add(Category);
        
        String valCategory[] = {"General", "OBC", "SC", "ST", "Other"};
         category = new JComboBox(valCategory);
         category.setBounds(300, 190, 400, 30);
          category.setBackground(Color.WHITE );
        add(category);
        
        
        
        
         JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100,240,200,30);
        add(Income);
        
         String IncomeCategory[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
         income = new JComboBox(IncomeCategory);
         income.setBounds(300,240,400,30);
          income.setBackground(Color.WHITE );
        add(income);
        
    
        JLabel Educational = new JLabel("Educational:");
        Educational.setFont(new Font("Raleway", Font.BOLD, 20));
        Educational.setBounds(100,290,200,30);
        add(Educational);
        
       
        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        Qualification.setBounds(100,315,200,30);
        add(Qualification);
        
         String educationValue[] = {"Non-Graduation", "Graduate", "Post-Graduate", "Doctrate", "Other"};
         education = new JComboBox(educationValue);
         education.setBounds(300, 315, 400, 30);
          education.setBackground(Color.WHITE );
        add(education);
        
         
        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100,390,200,30);
        add(Occupation);
          String OccupationValue[] = {"Salaried", "Self-employed", "Business", "Student", "Retired", "Other"};
         occupation = new JComboBox(OccupationValue);
         occupation.setBounds(300, 390, 400, 30);
          occupation.setBackground(Color.WHITE );
        add(occupation);
        
       
        
         JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        
         pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD,14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
        JLabel Aadhar = new JLabel("Aadhar Number :");
        Aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        Aadhar.setBounds(100,490,200,30);
        add(Aadhar);
        
         aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD,14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        
         syes = new JRadioButton("YES");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
          sno = new JRadioButton("NO");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
    
        
        ButtonGroup scitizengroup = new ButtonGroup();
        scitizengroup.add(sno);
        scitizengroup.add(syes);

        
        JLabel pincode = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
          eyes = new JRadioButton("YES");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
          eno = new JRadioButton("NO");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        
        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eno);
        existinggroup.add(eyes);
        
        
         next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
    
        
     public void actionPerformed(ActionEvent ae){
         String sreligion  = (String)religion.getSelectedItem();
         String scategory =  (String)category.getSelectedItem();
         String sincome   =(String)income.getSelectedItem();
         String seducation   =(String)education.getSelectedItem();
         String soccupation   =(String)occupation.getSelectedItem();
         
         String seniorcitizen = null;
         if(syes.isSelected()){
             seniorcitizen = "Yes";
         }else if(sno.isSelected()){
             seniorcitizen ="No";
         }
        
          String existingaccount = null;
         if(eyes.isSelected()){
             existingaccount = "Yes";
         }else if(eno.isSelected()){
             existingaccount ="No";
         }
         
         String span  = pan.getText();
         String saadhar  = aadhar.getText();
      
         
         try{
            
                 conn c = new conn();
                 String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+seniorcitizen+"', '"+existingaccount+"', '"+span+"', '"+saadhar+"')";
                 c.s.executeUpdate(query);
                 setVisible(false);
                 new SignupThree(formno).setVisible(true);

         }
             catch(Exception e){ //error
    System.out.println(e);
}
         
     }
    public static void main(String args[]){
        new SignupTwo("");
    }

    private static class string {

        public string() {
        }
    }
    
}
 