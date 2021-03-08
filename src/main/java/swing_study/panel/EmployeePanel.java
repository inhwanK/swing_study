package swing_study.panel;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeePanel extends JPanel implements ActionListener {
	private JTextField tfNo;
	private JTextField tfName;
	private JComboBox cmbTitle;
	private JComboBox cmbManager;
	private JSpinner spinSalary;
	private JComboBox cmbDept;
	private JPasswordField pfPass1;
	private JTextField pfPass2;
	private JButton btnAddPic;

	public EmployeePanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel pItem = new JPanel();
		add(pItem, BorderLayout.CENTER);
		pItem.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNo = new JLabel("New label");
		pItem.add(lblNo);
		
		tfNo = new JTextField();
		pItem.add(tfNo);
		tfNo.setColumns(10);
		
		JLabel lblName = new JLabel("New label");
		pItem.add(lblName);
		
		tfName = new JTextField();
		pItem.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblTitle = new JLabel("New label");
		pItem.add(lblTitle);
		
		cmbTitle = new JComboBox();
		pItem.add(cmbTitle);
		
		JLabel lblManager = new JLabel("New label");
		pItem.add(lblManager);
		
		cmbManager = new JComboBox();
		pItem.add(cmbManager);
		
		JLabel lblSalary = new JLabel("New label");
		pItem.add(lblSalary);
		
		spinSalary = new JSpinner();
		pItem.add(spinSalary);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		pItem.add(lblNewLabel_5);
		
		cmbDept = new JComboBox();
		pItem.add(cmbDept);
		
		JLabel lblHireDate = new JLabel("New label");
		pItem.add(lblHireDate);
		
		JDateChooser dateHire = new JDateChooser();
		pItem.add(dateHire);
		
		JLabel lblPass1 = new JLabel("New label");
		pItem.add(lblPass1);
		
		pfPass1 = new JPasswordField();
		pItem.add(pfPass1);
		pfPass1.setColumns(10);
		
		JLabel lblPass2 = new JLabel("New label");
		pItem.add(lblPass2);
		
		pfPass2 = new JTextField();
		pItem.add(pfPass2);
		pfPass2.setColumns(10);
		
		JPanel spacePanel = new JPanel();
		pItem.add(spacePanel);
		
		JPanel lblResultPanal = new JPanel();
		pItem.add(lblResultPanal);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblResultPanal.add(lblNewLabel_9);
		
		JPanel pTop = new JPanel();
		add(pTop, BorderLayout.NORTH);
		pTop.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel pPic = new JPanel();
		pTop.add(pPic);
		pPic.setLayout(new BorderLayout(0, 0));
		
		JLabel lblPic = new JLabel("");
		lblPic.setHorizontalAlignment(SwingConstants.CENTER);
		pPic.add(lblPic, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		pPic.add(panel, BorderLayout.SOUTH);
		
		btnAddPic = new JButton("추가");
		btnAddPic.addActionListener(this);
		panel.add(btnAddPic);
	}
	public void setEmployee(Employee emp) {

	}

	public Title getEmployee() {
		return null;
	}
	
	public void clearTf() {
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAddPic) {
			actionPerformedBtnAddPic(e);
		}
	}
	protected void actionPerformedBtnAddPic(ActionEvent e) {
	}
}
