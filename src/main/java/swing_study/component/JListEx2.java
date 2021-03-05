package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class JListEx2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfValue;
	private JList<String> nameList1;
	private ArrayList<String> stdList= new ArrayList<>();
	private JList nameList2;
	

	public JListEx2() {
		stdList.add("김인환");
		stdList.add("이태훈");
		stdList.add("김상건");
		stdList.add("전수린");
		initialize();
	}
	private void initialize() {
		setTitle("실시간 추가");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("이름 입력 후 <Enter> 키");
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		panel.add(lblNewLabel);
		
		tfValue = new JTextField();
		tfValue.addActionListener(this);
		panel.add(tfValue);
		tfValue.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 100, 0, 100));
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2, 10, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel_1.add(scrollPane);
		
		nameList1 = new JList();
		nameList1.setListData(new Vector<String>(stdList));
		nameList1.setFixedCellWidth(100);
		nameList1.setVisibleRowCount(5);
		scrollPane.setViewportView(nameList1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);
		
		nameList2 = new JList();
		nameList2.setModel(getModel(stdList));
		scrollPane_1.setViewportView(nameList2);
	}

	private ListModel<String> getModel(ArrayList<String> stdList2) {
		DefaultListModel<String> model = new DefaultListModel<String>();
		for(String e : stdList) {
			model.addElement(e);
		}
		return model;
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tfValue) {
			actionPerformedTextField(e);
		}
	}
	protected void actionPerformedTextField(ActionEvent e) {
		String value = tfValue.getText().trim();
		JOptionPane.showMessageDialog(null, value);
		
		stdList.add(value);
		nameList1.setListData(new Vector<String>(stdList));
		tfValue.setText("");
		tfValue.requestFocus();
		
		DefaultListModel<String> model = (DefaultListModel<String>) nameList2.getModel();
		model.addElement(value);
	}
}
