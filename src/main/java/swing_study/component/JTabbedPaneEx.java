package swing_study.component;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import swing_study.panel.Title;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import swing_study.panel.TitlePanel;

public class JTabbedPaneEx extends JFrame implements ActionListener {

	
	
	private JPanel contentPane;
	private JButton btnConfirm;
	private JTabbedPane tabbedPane;
	private DeptPanel pDept;
	private TitlePanel pTitle;
	private JPanel pEmp;
	
	public JTabbedPaneEx() {
		initialize();
	}
	private void initialize() {
		setTitle("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		pDept = new DeptPanel();
		tabbedPane.addTab("부서", null, pDept, null);
		
		pTitle = new TitlePanel();
		tabbedPane.addTab("직책", null, pTitle, null);
		
		pEmp = new JPanel();
		tabbedPane.addTab("사원", null, pEmp, null);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnConfirm = new JButton("확인");
		btnConfirm.addActionListener(this);
		panel.add(btnConfirm);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnConfirm) {
			actionPerformedBtnConfirm(e);
		}
	}
	protected void actionPerformedBtnConfirm(ActionEvent e) {
		
		Component comp = tabbedPane.getSelectedComponent();
		System.out.println(comp);
		
		if (comp == pDept) {
			DeptPanel deptPanel = (DeptPanel) comp;
			Department department = deptPanel.getDepartment();
			JOptionPane.showMessageDialog(null, department);
		}else if(comp == pTitle) {
			TitlePanel titlePanel = (TitlePanel) comp;
			Title title = titlePanel.getTitle();
			JOptionPane.showMessageDialog(null, title);
		}//else if (comp == ptEmp)
		
		
		}
}
