package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class JListex3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private DeptPanel pLeftcenter;
	private JButton btnAdd;
	private JList<Department> deptList;
	private DefaultListModel<Department> model;
	private JButton btnConfirm;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JPanel pRight;

	public JListex3() {
		initialize();

		model.addElement(new Department(1, "기획", 8));
		model.addElement(new Department(2, "영업", 18));
		model.addElement(new Department(3, "개발", 28));
	}

	private void initialize() {
		setTitle("JList 응용 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 775, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BorderLayout(0, 0));

		JPanel pLeftnorth = new JPanel();
		pLeft.add(pLeftnorth, BorderLayout.NORTH);

		JPanel pLeftsouth = new JPanel();
		pLeft.add(pLeftsouth, BorderLayout.SOUTH);

		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pLeftsouth.add(btnAdd);

		pLeftcenter = new DeptPanel();
		pLeft.add(pLeftcenter, BorderLayout.CENTER);

		pRight = new JPanel();
		contentPane.add(pRight);

		deptList = new JList<>();
		model = new DefaultListModel<Department>();
		pRight.setLayout(new BorderLayout(0, 0));
		deptList.setModel(model);
		pRight.add(deptList);

		JLabel lblNewLabel = new JLabel("부서 목록");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		pRight.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		pRight.add(panel, BorderLayout.SOUTH);

		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);

		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(this);
		panel.add(btnUpdate);

		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(this);
		panel.add(btnDelete);
	}

	private ListModel<Department> getDeptModel() {

		return model;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnDelete) {
			actionPerformedBtnDelete(e);
		}
		if (e.getSource() == btnUpdate) {
			actionPerformedBtnUpdate(e);
		}
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
		if (e.getSource() == btnAdd) {
			actionPerformedBtnAdd(e);
		}
	}

	protected void actionPerformedBtnAdd(ActionEvent e) {

		if (btnAdd.getText().equals("수정")) {
			Department updateDept = pLeftcenter.getDepartment();
			model.setElementAt(updateDept, deptList.getSelectedIndex());
			pLeftcenter.ClearTf();
			JOptionPane.showMessageDialog(null, "수정 되었습니다.");
			btnAdd.setText("추가");
		} else {
			Department dept = pLeftcenter.getDepartment();
			pLeftcenter.ClearTf();
			model.addElement(dept);
			JOptionPane.showMessageDialog(null, "추가 되었습니다.");
		}
	}

	protected void actionPerformedBtnConfirm(ActionEvent e) {
//		int idx = deptList.getSelectedIndex();
//		Department selDept = model.get(idx);
//		String message1 = String.format("%d %s %d", selDept.getDeptNo(), selDept.getDeptName(), selDept.getFloor());
//		

		Department dept = deptList.getSelectedValue();
		String message = String.format("%d %s %d", dept.getDeptNo(), dept.getDeptName(), dept.getFloor());
		JOptionPane.showMessageDialog(null, message);

	}

	protected void actionPerformedBtnUpdate(ActionEvent e) {
		Department dept = deptList.getSelectedValue();
		pLeftcenter.setDepartment(dept);
		if (btnAdd.getText().equals("추가")) {
			btnAdd.setText("수정");
		}
	}

	protected void actionPerformedBtnDelete(ActionEvent e) {
		model.remove(deptList.getSelectedIndex());
		JOptionPane.showMessageDialog(null, "삭제 되었습니다.");
	}
}
