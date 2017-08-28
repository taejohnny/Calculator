import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame{
	
	//North panel components
	private JLabel intro;
	private JLabel followUp, lineSep;
	
	//South panel components
	private JLabel class1, class2, class3, class4, class5, class6, class7, class8;
	private JTextField class1Space, class2Space, class3Space, class4Space, class5Space, class6Space, class7Space;
	private JLabel class1Grade, class2Grade, class3Grade, class4Grade, class5Grade, class6Grade, class7Grade;
	private JTextField class1GPA, class2GPA, class3GPA, class4GPA, class5GPA, class6GPA, class7GPA;
	private int val1, val2, val3, val4, val5, val6, val7;
	private double gpa1, gpa2, gpa3, gpa4, gpa5, gpa6, gpa7;
	
	//East panel components
	private JButton confirm;
	
	//South panel components
	private JLabel response;
	private JLabel addedReply;
	
	//West panel components
	private JLabel scale, A, AMinus, BPlus, B, BMinus, CPlus, C, CMinus, DPlus, D, DMinus, F;
	
	public Calculator(){
		createView();
		
		setTitle("Umass Amherst GPA Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setSize(800, 450);
		pack();
		setLocationRelativeTo(null);
	}
	
	private void createView() {
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		getContentPane().add(panel);
		
		JPanel panelForm = new JPanel(new BorderLayout());
		panel.add(panelForm);
		
		JPanel northPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		//Setting the title for the program
		Font bigFont = new Font("Century Gothic", Font.BOLD, 20);
		Font myFont = new Font("Century Gothic", Font.BOLD, 15);
		intro = new JLabel("Umass Amherst GPA calculator per semester");
		intro.setFont(bigFont);
		c.gridx = 0;
		c.gridy = 0;
		northPanel.add(intro, c);
	
		followUp = new JLabel("For up to 7 classes, enter the number of credits and number grade received for each");
		followUp.setFont(bigFont);
		c.gridx = 0;
		c.gridy = 1;
		northPanel.add(followUp, c);
		
		//A line seperator to make things easier to read
		lineSep = new JLabel("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		c.gridx = 0;
		c.gridy = 2;
		northPanel.add(lineSep, c);
		
		panelForm.add(northPanel, BorderLayout.NORTH);
		
		//Starting center panel
		JPanel centerPanel = new JPanel(new GridBagLayout());
		
		//Many jLabels and jTextFields to account for up to 7 classes
		class1 = new JLabel("Class #1 credits: ");
		class1.setFont(myFont);
		c.gridx = 0;
		c.gridy = 0;
		c.insets = new Insets(5, 0, 5, 10);
		centerPanel.add(class1, c);
		
		class1Space = new JTextField(3);
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class1Space, c);
		
		class1Grade = new JLabel("Grade received: ");
		class1Grade.setFont(myFont);
		c.gridx = 2;
		c.gridy = 0;
		c.insets = new Insets(5, 20, 5, 10);
		centerPanel.add(class1Grade, c);
		
		class1GPA = new JTextField(3);
		c.gridx = 3;
		c.gridy = 0;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class1GPA, c);
		
		//class 2
		class2 = new JLabel("Class #2 credits: ");
		class2.setFont(myFont);
		c.gridx = 0;
		c.gridy = 1;
		c.insets = new Insets(5, 0, 5, 10);
		centerPanel.add(class2, c);
		
		class2Space = new JTextField(3);
		c.gridx = 1;
		c.gridy = 1;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class2Space, c);
		
		class2Grade = new JLabel("Grade received: ");
		class2Grade.setFont(myFont);
		c.gridx = 2;
		c.gridy = 1;
		c.insets = new Insets(5, 20, 5, 10);
		centerPanel.add(class2Grade, c);
		
		class2GPA = new JTextField(3);
		c.gridx = 3;
		c.gridy = 1;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class2GPA, c);
		
		//class 3
		class3 = new JLabel("Class #3 credits: ");
		class3.setFont(myFont);
		c.gridx = 0;
		c.gridy = 2;
		c.insets = new Insets(5, 0, 5, 10);
		centerPanel.add(class3, c);
		
		class3Space = new JTextField(3);
		c.gridx = 1;
		c.gridy = 2;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class3Space, c);
		
		class3Grade = new JLabel("Grade received: ");
		class3Grade.setFont(myFont);
		c.gridx = 2;
		c.gridy = 2;
		c.insets = new Insets(5, 20, 5, 10);
		centerPanel.add(class3Grade, c);
		
		class3GPA = new JTextField(3);
		c.gridx = 3;
		c.gridy = 2;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class3GPA, c);
		
		//class 4
		class4 = new JLabel("Class #4 credits: ");
		class4.setFont(myFont);
		c.gridx = 0;
		c.gridy = 3;
		c.insets = new Insets(5, 0, 5, 10);
		centerPanel.add(class4, c);
		
		class4Space = new JTextField(3);
		c.gridx = 1;
		c.gridy = 3;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class4Space, c);
		
		class4Grade = new JLabel("Grade received: ");
		class4Grade.setFont(myFont);
		c.gridx = 2;
		c.gridy = 3;
		c.insets = new Insets(5, 20, 5, 10);
		centerPanel.add(class4Grade, c);
		
		class4GPA = new JTextField(3);
		c.gridx = 3;
		c.gridy = 3;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class4GPA, c);
		
		//class 5
		class5GPA = new JTextField(3);
		c.gridx = 3;
		c.gridy = 4;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class5GPA, c);
		
		class5 = new JLabel("Class #5 credits: ");
		class5.setFont(myFont);
		c.gridx = 0;
		c.gridy = 4;
		c.insets = new Insets(5, 0, 5, 10);
		centerPanel.add(class5, c);
		
		class5Space = new JTextField(3);
		c.gridx = 1;
		c.gridy = 4;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class5Space, c);
		
		class5Grade = new JLabel("Grade received: ");
		class5Grade.setFont(myFont);
		c.gridx = 2;
		c.gridy = 4;
		c.insets = new Insets(5, 20, 5, 10);
		centerPanel.add(class5Grade, c);
		
		//class 6
		class6GPA = new JTextField(3);
		c.gridx = 3;
		c.gridy = 5;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class6GPA, c);
		
		class6 = new JLabel("Class #6 credits: ");
		class6.setFont(myFont);
		c.gridx = 0;
		c.gridy = 5;
		c.insets = new Insets(5, 0, 5, 10);
		centerPanel.add(class6, c);
		
		class6Space = new JTextField(3);
		c.gridx = 1;
		c.gridy = 5;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class6Space, c);
		
		class6Grade = new JLabel("Grade received: ");
		class6Grade.setFont(myFont);
		c.gridx = 2;
		c.gridy = 5;
		c.insets = new Insets(5, 20, 5, 10);
		centerPanel.add(class6Grade, c);
		
		//class 7
		class7GPA = new JTextField(3);
		c.gridx = 3;
		c.gridy = 6;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class7GPA, c);
		
		class7 = new JLabel("Class #7 credits: ");
		class7.setFont(myFont);
		c.gridx = 0;
		c.gridy = 6;
		c.insets = new Insets(5, 0, 5, 10);
		centerPanel.add(class7, c);
		
		class7Space = new JTextField(3);
		c.gridx = 1;
		c.gridy = 6;
		c.insets = new Insets(5, 0, 5, 0);
		centerPanel.add(class7Space, c);
		
		class7Grade = new JLabel("Grade received: ");
		class7Grade.setFont(myFont);
		c.gridx = 2;
		c.gridy = 6;
		c.insets = new Insets(5, 20, 5, 10);
		centerPanel.add(class7Grade, c);
		
		panelForm.add(centerPanel, BorderLayout.CENTER);
		
		//East and South panel
		JPanel eastPanel = new JPanel(new FlowLayout());
		JPanel southPanel = new JPanel(new GridBagLayout());
		response = new JLabel("Your GPA for the semester is: ");
		response.setFont(myFont);
		c.gridx = 0;
		c.gridy = 0;
		southPanel.add(response, c);
		
		addedReply = new JLabel(" ");
		addedReply.setFont(new Font("Century Gothic", Font.ITALIC, 12));
		c.gridx = 0;
		c.gridy = 1;
		southPanel.add(addedReply, c);
		
		panelForm.add(southPanel, BorderLayout.SOUTH);
		
		//When the button is clicked, the calculations are called via totalCredits and totalGPA and the output is displayed
		confirm = new JButton("CONFIRM");
		confirm.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				double totalCredits = addCredits();
				double totalGPA = addGPA();
				double answer = totalGPA / totalCredits;
				response.setText("Your GPA for the semester is: " + answer);
				addedReply.setText("If output was NaN, then make sure only numbers are used and corresponding boxes are filled");
				panelForm.add(southPanel, BorderLayout.SOUTH);
				}
		});
		eastPanel.add(confirm);
		
		panelForm.add(eastPanel, BorderLayout.EAST);
		
		//West Panel
		JPanel westPanel = new JPanel(new GridBagLayout());
		westPanel.setBackground(Color.GREEN);
		
		//These JLabels display the corresponding number grade to each letter
		JLabel scale = new JLabel("Grading Scale");
		c.gridx = 0;
		c.gridy = 0;
		westPanel.add(scale, c);
		
		JLabel A = new JLabel("A = 4.0");
		c.gridx = 0;
		c.gridy = 1;
		westPanel.add(A, c);
		
		JLabel AMinus = new JLabel("A- = 3.70");
		c.gridx = 0;
		c.gridy = 2;
		westPanel.add(AMinus, c);
		
		JLabel BPlus = new JLabel("B+ = 3.30");
		c.gridx = 0;
		c.gridy = 3;
		westPanel.add(BPlus, c);
		
		JLabel B = new JLabel("B = 3.0");
		c.gridx = 0;
		c.gridy = 4;
		westPanel.add(B, c);
		
		JLabel BMinus = new JLabel("B- = 2.70");
		c.gridx = 0;
		c.gridy = 5;
		westPanel.add(BMinus, c);
		
		JLabel CPlus = new JLabel("C+ = 2.30");
		c.gridx = 0;
		c.gridy = 6;
		westPanel.add(CPlus, c);
		
		JLabel C = new JLabel("C = 2.0");
		c.gridx = 0;
		c.gridy = 7;
		westPanel.add(C, c);
		
		JLabel CMinus = new JLabel("C- = 1.70");
		c.gridx = 0;
		c.gridy = 8;
		westPanel.add(CMinus, c);
		
		JLabel DPlus = new JLabel("D+ = 1.30");
		c.gridx = 0;
		c.gridy = 9;
		westPanel.add(DPlus, c);
		
		JLabel D = new JLabel("D = 1.0");
		c.gridx = 0;
		c.gridy = 10;
		westPanel.add(D, c);
		
		JLabel DMinus = new JLabel("D- = 0.70");
		c.gridx = 0;
		c.gridy = 11;
		westPanel.add(DMinus, c);
		
		JLabel F = new JLabel("F = 0.0");
		c.gridx = 0;
		c.gridy = 12;
		westPanel.add(F, c);
		
		panelForm.add(westPanel, BorderLayout.WEST);
	}
	
	//Multiplies credits for each class by the grade point value
	private double addGPA(){
		if(class1GPA.getText().isEmpty()){
			gpa1 = 0;
		}else{
			gpa1 = Double.valueOf(class1GPA.getText());
			gpa1 = gpa1 * val1;
		}
		if(class2GPA.getText().isEmpty()){
			gpa2 = 0;
		}else{
			gpa2 = Double.valueOf(class2GPA.getText());
			gpa2 = gpa2 * val2;
		}
		if(class3GPA.getText().isEmpty()){
			gpa3 = 0;
		}else{
			gpa3 = Double.valueOf(class3GPA.getText());
			gpa3 = gpa3 * val3;
		}
		if(class4GPA.getText().isEmpty()){
			gpa4 = 0;
		}else{
			gpa4 = Double.valueOf(class4GPA.getText());
			gpa4 = gpa4 * val4;
		}
		if(class5GPA.getText().isEmpty()){
			gpa5 = 0;
		}else{
			gpa5 = Double.valueOf(class5GPA.getText());
			gpa5 = gpa5 * val5;
		}
		if(class6GPA.getText().isEmpty()){
			gpa6 = 0;
		}else{
			gpa6 = Double.valueOf(class6GPA.getText());
			gpa6 = gpa6 * val6;
		}
		if(class7GPA.getText().isEmpty()){
			gpa7 = 0;
		}else{
			gpa7 = Double.valueOf(class7GPA.getText());
			gpa7 = gpa7 * val7;
		}
		return gpa1 + gpa2 + gpa3 + gpa4 + gpa5 + gpa6 + gpa7;
	}
	
	//Adds the total number of credits taken
	private double addCredits(){
		if(class1Space.getText().isEmpty()){
			val1 = 0;
		}else{
			val1 = Integer.valueOf(class1Space.getText());
		}
		if(class2Space.getText().isEmpty()){
			val2 = 0;
		}else{
			val2 = Integer.valueOf(class2Space.getText());
		}
		if(class3Space.getText().isEmpty()){
			val3 = 0;
		}else{
			val3 = Integer.valueOf(class3Space.getText());
		}
		if(class4Space.getText().isEmpty()){
			val4 = 0;
		}else{
			val4 = Integer.valueOf(class4Space.getText());
		}
		if(class5Space.getText().isEmpty()){
			val5 = 0;
		}else{
			val5 = Integer.valueOf(class5Space.getText());
		}
		if(class6Space.getText().isEmpty()){
			val6 = 0;
		}else{
			val6 = Integer.valueOf(class6Space.getText());
		}
		if(class7Space.getText().isEmpty()){
			val7 = 0;
		}else{
			val7 = Integer.valueOf(class7Space.getText());
		}
		int total = val1 + val2 + val3 + val4 + val5+ val6 + val7;
		return total;
	}

	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new Calculator().setVisible(true);	
			}
		});	
	}
	
}
	
