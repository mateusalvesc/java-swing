package calculatorjavaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorApp {

	private JFrame frame;
	private JTextField display;
	
	double firstValue;
	double secondValue;
	double result;
	String operation;
	String answer; 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculator");
		frame.setForeground(Color.BLUE);
		frame.setResizable(false);
		frame.setBounds(100, 100, 300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setEditable(false);
		display.setFont(new Font("Lucida Sans", Font.PLAIN, 40));
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setBounds(10, 6, 266, 84);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton buttonC = new JButton("C");
		buttonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(null);
			}
		});
		buttonC.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonC.setBounds(14, 96, 54, 47);
		frame.getContentPane().add(buttonC);
		
		JButton buttonPercent = new JButton("%");
		buttonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = Double.parseDouble(display.getText());
				display.setText("");
				operation = "%";
			}
		});
		buttonPercent.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonPercent.setBounds(82, 96, 54, 47);
		frame.getContentPane().add(buttonPercent);
		
		JButton buttonDiv = new JButton("/");
		buttonDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = Double.parseDouble(display.getText());
				display.setText("");
				operation = "/";
			}
		});
		buttonDiv.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonDiv.setBounds(150, 96, 54, 47);
		frame.getContentPane().add(buttonDiv);
		
		JButton buttonMult = new JButton("*");
		buttonMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = Double.parseDouble(display.getText());
				display.setText("");
				operation = "*";
			}
		});
		buttonMult.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonMult.setBounds(218, 96, 54, 47);
		frame.getContentPane().add(buttonMult);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button7.getText();
				display.setText(number);
			}
		});
		button7.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button7.setBounds(14, 149, 54, 47);
		frame.getContentPane().add(button7);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button4.getText();
				display.setText(number);
			}
		});
		button4.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button4.setBounds(14, 202, 54, 47);
		frame.getContentPane().add(button4);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button1.getText();
				display.setText(number);
			}
		});
		button1.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button1.setBounds(14, 255, 54, 47);
		frame.getContentPane().add(button1);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button0.getText();
				display.setText(number);
			}
		});
		button0.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button0.setBounds(14, 308, 122, 47);
		frame.getContentPane().add(button0);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button8.getText();
				display.setText(number);
			}
		});
		button8.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button8.setBounds(82, 149, 54, 47);
		frame.getContentPane().add(button8);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button9.getText();
				display.setText(number);
			}
		});
		button9.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button9.setBounds(150, 149, 54, 47);
		frame.getContentPane().add(button9);
		
		JButton buttonSub = new JButton("-");
		buttonSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = Double.parseDouble(display.getText());
				display.setText("");
				operation = "-";
			}
		});
		buttonSub.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonSub.setBounds(218, 149, 54, 47);
		frame.getContentPane().add(buttonSub);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button5.getText();
				display.setText(number);
			}
		});
		button5.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button5.setBounds(82, 202, 54, 47);
		frame.getContentPane().add(button5);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button6.getText();
				display.setText(number);
			}
		});
		button6.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button6.setBounds(150, 202, 54, 47);
		frame.getContentPane().add(button6);
		
		JButton buttonSum = new JButton("+");
		buttonSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = Double.parseDouble(display.getText());
				display.setText("");
				operation = "+";
			}
		});
		buttonSum.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonSum.setBounds(218, 202, 54, 47);
		frame.getContentPane().add(buttonSum);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button2.getText();
				display.setText(number);
			}
		});
		button2.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button2.setBounds(82, 255, 54, 47);
		frame.getContentPane().add(button2);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+button3.getText();
				display.setText(number);
			}
		});
		button3.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		button3.setBounds(150, 255, 54, 47);
		frame.getContentPane().add(button3);
		
		JButton buttonDot = new JButton(".");
		buttonDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = display.getText()+buttonDot.getText();
				display.setText(number);
			}
		});
		buttonDot.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonDot.setBounds(150, 308, 54, 47);
		frame.getContentPane().add(buttonDot);
		
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondValue = Double.parseDouble(display.getText());
				switch (operation) {
					case "+":
						result = firstValue + secondValue;
						answer = String.format("%.2f", result);
						display.setText(answer);
						break;
					case "-":
						result = firstValue - secondValue;
						answer = String.format("%.2f", result);
						display.setText(answer);
						break;
					case "*":
						result = firstValue * secondValue;
						answer = String.format("%.2f", result);
						display.setText(answer);
						break;
					case "/":
						result = firstValue / secondValue;
						answer = String.format("%.2f", result);
						display.setText(answer);
						break;
					case "%":
						result = firstValue * secondValue / 100;
						answer = String.format("%.2f", result);
						display.setText(answer);
						break;
					default:
						display.setText("ERRO");
						break;
				}
			}
		});
		buttonEqual.setFont(new Font("Lucida Sans", Font.PLAIN, 15));
		buttonEqual.setBounds(218, 255, 54, 100);
		frame.getContentPane().add(buttonEqual);
	}
}