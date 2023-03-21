package gradleaf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField tfInput;
	private JLabel lbOutput;

	public UI() {
		setTitle("Sum");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 178, 224);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfInput = new JTextField();
		tfInput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tfInput.setBounds(27, 40, 112, 33);
		contentPane.add(tfInput);
		tfInput.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digits-Sum");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(54, 10, 112, 20);
		contentPane.add(lblNewLabel);
		
		lbOutput = new JLabel("");
		lbOutput.setForeground(Color.DARK_GRAY);
		lbOutput.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbOutput.setBounds(27, 144, 112, 20);
		contentPane.add(lbOutput);
		
		JButton btnSum = new JButton("Sum-Digits");
		btnSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String inputString = tfInput.getText();
				Long inputDouble = Long.parseLong(inputString);
				sumDigits obj = new sumDigits();
				int result = (int) obj.sumDigits(inputDouble);
				String resultFinal = Integer.toString(result);
				lbOutput.setText(resultFinal);
					
			}
		});
		btnSum.setBounds(27, 96, 100, 21);
		contentPane.add(btnSum);
	}
}
