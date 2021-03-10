package swing_study.component.table;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import swing_study.panel.Department;
import swing_study.panel.DeptPanel;
import swing_study.panel.Employee;
import swing_study.panel.Title;

public class JTableEx extends JFrame {

	private JPanel contentPane;
	private JTable table1;

	private List<Student> stdList = new ArrayList<>();
	private List<Department> deptList = new ArrayList<>();
	private List<Title> titleList = new ArrayList<>();
	private List<Employee> empList = new ArrayList<>();

	public JTableEx() {
		stdList.add(new Student(1, "김인환", 50, 60, 60));
		stdList.add(new Student(2, "이태훈", 70, 71, 70));
		stdList.add(new Student(3, "김상건", 100, 92, 100));
		stdList.add(new Student(4, "전수린", 60, 60, 62));

		deptList.add(new Department(1, "기획", 8));
		deptList.add(new Department(2, "영업", 18));
		deptList.add(new Department(3, "총무", 28));

		titleList.add(new Title(1, "사장"));
		titleList.add(new Title(2, "부장"));
		titleList.add(new Title(3, "차장"));

		empList.add(new Employee(1, "김상건", titleList.get(0), new Employee(1, "김상건"), 1500000, deptList.get(0)));
		empList.add(new Employee(2, "이성래", titleList.get(1), new Employee(1, "김상건"), 1500000, deptList.get(0)));
		empList.add(new Employee(3, "이태훈", titleList.get(2), new Employee(1, "김상건"), 1500000, deptList.get(0)));
		initialize();
	}

	private void initialize() {
		setTitle("");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 549, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 2, 10, 10));

		JPanel pTable1 = new JPanel();
		contentPane.add(pTable1);
		pTable1.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		pTable1.add(scrollPane, BorderLayout.CENTER);

		table1 = new JTable();
		table1.setModel(getModel());
		scrollPane.setViewportView(table1);

		JPanel pTable2 = new JPanel();
		contentPane.add(pTable2);
		pTable2.setLayout(new BorderLayout(0, 0));

		Mytablepanel pCustomtable = new Mytablepanel();
		pCustomtable.setList(stdList);
		pTable2.add(pCustomtable, BorderLayout.CENTER);

		JPanel pTable3 = new JPanel();
		contentPane.add(pTable3);
		pTable3.setLayout(new BorderLayout(0, 0));

		DeptTablePanel panel = new DeptTablePanel();
		panel.setList(deptList);
		pTable3.add(panel, BorderLayout.CENTER);

		JPanel pTable4 = new JPanel();
		contentPane.add(pTable4);
		pTable4.setLayout(new BorderLayout(0, 0));
		
		TitleTablePanel panel_1 = new TitleTablePanel();
		panel_1.setList(titleList);
		pTable4.add(panel_1, BorderLayout.CENTER);

		JPanel pTable5 = new JPanel();
		contentPane.add(pTable5);
		pTable5.setLayout(new BorderLayout(0, 0));

		EmpTablePanel pEmpTable = new EmpTablePanel();
		pEmpTable.setList(empList);
		pTable5.add(pEmpTable, BorderLayout.CENTER);

		JPanel pTable6 = new JPanel();
		contentPane.add(pTable6);
		pTable6.setLayout(new BorderLayout(0, 0));
	}

	private DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;
	}

	private Object[][] getData() {
		return new Object[][] { { 1, "박유진", 10, "여자" }, { 2, "이태훈", 11, "남자" }, };
	}

	private String[] getColumnNames() {
		return new String[] { "학생번호", "학생명", "나이", "성별" };
	}

	class CustomTableModel extends DefaultTableModel {

		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);

		}

		@Override
		public boolean isCellEditable(int row, int column) {

			return false;
		}

	}

}
