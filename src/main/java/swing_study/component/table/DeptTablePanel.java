package swing_study.component.table;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import swing_study.panel.Department;

import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class DeptTablePanel extends JPanel {
	private JTable table;
	
	public DeptTablePanel() {

		initialize();
	}
	private void initialize() {
		setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
			},
			new String[] {
				"부서번호", "부서명", "위치"
			}
		));
		scrollPane.setViewportView(table);
	}
	private DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;
	}
	
	private Object[][] getData() {
		return new Object[][] {{null, null, null},};
	}
	private String[] getColumnNames() {
		return new String[] {"부서번호", "부서명", "위치"};
	}

	public void setList(List<Department> deptList) {
		Object[][] data =new Object[deptList.size()][];
		for(int i=0; i<data.length;i++) {
			data[i] = toArray(deptList.get(i));
		}
		CustomTableModel model = new CustomTableModel(data, getColumnNames());
		table.setModel(model);
		
		//컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER,0, 1, 2);
		//컬럼별 너비 조정
		setTableCellWidth(100, 150, 80);
	}
	private void setTableCellWidth(int... width) {
		TableColumnModel tcm = table.getColumnModel();

		for (int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
	}
	
	private void setTableCellAlign(int align, int...idx) {
		TableColumnModel tcm = table.getColumnModel();
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		for(int i=0; i<idx.length;i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}
	private Object[] toArray(Department department) {
		Object[] row = new Object[] {
				department.getDeptNo(),
				department.getDeptName(),
				department.getFloor()
		};
		return row;
	}


	private class CustomTableModel extends DefaultTableModel {
		public CustomTableModel(Object[][] data, Object[] columnNames) {
			super(data, columnNames);
			// TODO Auto-generated constructor stub
		}

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}

	}
}
