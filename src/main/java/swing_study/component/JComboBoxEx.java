package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JComboBoxEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> cmb1;
	private JComboBox<String> cmb2;
	private JComboBox<String> cmb3;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;

	public JComboBoxEx() {
		initialize();
		addDataCmb1();
		addDataCmb2();
		addDataCmb3();

	}

	private void addDataCmb1() {
		String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };

		for (String f : fruits) {
			cmb1.addItem(f);
		}
	}

	private void addDataCmb2() {
		String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };

		DefaultComboBoxModel<String> cbm = (DefaultComboBoxModel<String>) cmb2.getModel();

		for (String f : fruits) {
			cbm.addElement(f);
		}

	}

	private void addDataCmb3() {
		List<String> fruits = Arrays.asList( "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry");

		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>(new Vector<>(fruits));
		cmb3.setModel(model);
	}

	private void initialize() {
		setTitle("JCombobox 기본 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));

		JPanel pCmb1 = new JPanel();
		contentPane.add(pCmb1);

		cmb1 = new JComboBox<>();
		pCmb1.add(cmb1);
		
		tf1 = new JTextField();
		tf1.addActionListener(this);
		pCmb1.add(tf1);
		tf1.setColumns(10);

		JPanel pCmd2 = new JPanel();
		contentPane.add(pCmd2);

		cmb2 = new JComboBox<>();
		pCmd2.add(cmb2);
		
		tf2 = new JTextField();
		tf2.addActionListener(this);
		pCmd2.add(tf2);
		tf2.setColumns(10);

		JPanel pCmb3 = new JPanel();
		contentPane.add(pCmb3);

		cmb3 = new JComboBox<>();
		pCmb3.add(cmb3);
		
		tf3 = new JTextField();
		tf3.addActionListener(this);
		pCmb3.add(tf3);
		tf3.setColumns(10);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tf1) {
			actionPerformedTf1(e);
		}
		if (e.getSource() == tf2) {
			actionPerformedTf2(e);
		}
		if (e.getSource() == tf3) {
			actionPerformedTf3(e);
		}
	}
	protected void actionPerformedTf1(ActionEvent e) {
//		JOptionPane.showMessageDialog(null, "되냐?");
		String item = tf1.getText().trim();
		cmb1.addItem(item);
		tf1.setText("");
	}
	protected void actionPerformedTf2(ActionEvent e) {
//		JOptionPane.showMessageDialog(null, "되냐고");
		String item = tf2.getText().trim();
		cmb2.addItem(item);
		tf2.setText("");
	}
	protected void actionPerformedTf3(ActionEvent e) {
//		JOptionPane.showMessageDialog(null, "되냐고~");
		String item = tf3.getText().trim();
		cmb3.addItem(item);
		tf3.setText("");
	}
}
