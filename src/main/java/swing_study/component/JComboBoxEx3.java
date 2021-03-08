package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swing_study.panel.Department;
import java.awt.GridLayout;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import swing_study.panel.DeptPanel;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class JComboBoxEx3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private List<Department> deptList = new ArrayList<>();
	private JButton btnAdd;
	private DeptPanel pDept;
	private JPanel pRight;
	private JPanel pAdd;
	private JComboBox<Department> cmb;
	private JButton btnConfirm;
	
	public JComboBoxEx3() {
		deptList.add(new Department(1,"기획",8));
		deptList.add(new Department(2,"영업",18));
		deptList.add(new Department(3,"개발",28));
		
		initialize();
	}
	private void initialize() {
		
		
		
		setTitle("JCombobox 기본 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));
		
		pDept = new DeptPanel();
		pLeft.add(pDept, BorderLayout.CENTER);
		
		pAdd = new JPanel();
		pLeft.add(pAdd, BorderLayout.SOUTH);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pAdd.add(btnAdd);
		
		pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		cmb = new JComboBox<Department>(new Vector<>(deptList));
		pRight.add(cmb);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		pRight.add(btnConfirm);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}
	protected void actionPerformedBtnAdd(ActionEvent e) {
		Department dept = pDept.getDepartment();
		cmb.addItem(dept);
		pDept.ClearTf();
		if(deptList.contains(dept)) {
			//중복되었습니다.
		}
		
		//모델 사용.
		JOptionPane.showMessageDialog(null, "추가 되었습니다.");
	}
	protected void actionPerformedBtnConfirm(ActionEvent e) {
//		Department selDept = (Department) cmb.getSelectedItem();
		JOptionPane.showMessageDialog(null, cmb.getSelectedItem());
//		System.out.println(selDept);
//		DeptFrame frame = new DeptFrame(new Department(selDept));
		
//		frame.setVisible(true);
	}
}
