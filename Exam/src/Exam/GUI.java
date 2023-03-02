package Exam;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 564);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(45, 32, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(45, 98, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(45, 160, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(45, 220, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 273, 96, 21);
		contentPane.add(scrollPane);
		
		JComboBox<?> comboBox = new JComboBox();
		scrollPane.setViewportView(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Red", "Green", "Blue", "Yellow", "Pink"}));
		
		JLabel lblRadius = new JLabel("Radius");
		lblRadius.setBounds(220, 35, 45, 13);
		contentPane.add(lblRadius);
		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setBounds(220, 101, 45, 13);
		contentPane.add(lblHeight);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(220, 163, 45, 13);
		contentPane.add(lblArea);
		
		JLabel lblVolumn = new JLabel("Volumn");
		lblVolumn.setBounds(220, 223, 45, 13);
		contentPane.add(lblVolumn);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(220, 273, 45, 13);
		contentPane.add(lblColor);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		btnNewButton.setBounds(473, 137, 102, 36);
		contentPane.add(btnNewButton);
		Container columns;
		columns.add("radius");
		columns.add("height");
		columns.add("area");
		columns.add("volumn");
		columns.add("color");
		
	
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 322, 750, 195);
		contentPane.add(scrollPane_2);
		
		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"radius", "height", "volumn", "area", "color"
			}
		));
		loadData();
	}

	private void loadData() {
	}
}
