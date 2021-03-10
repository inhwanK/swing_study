package swing_study.component.table;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;

import javax.swing.JScrollPane;

public class Mytablepanel extends JPanel {
	private JTable table;


	public Mytablepanel() {

		initialize();
	}

	private void initialize() {
		setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(getModel());
		scrollPane.setViewportView(table);

		setTableCellAlign(SwingConstants.CENTER, 0, 1);
		setTableCellAlign(SwingConstants.RIGHT, 2, 3, 4, 5, 6);

		setTableCellWidth(100, 150, 80, 80, 80, 100, 100);
		// 조건에 맞는 셀 색조절(총점이 180미만은 빨강)
		setTableCellCondition(0, 1, 2, 3, 4, 5, 6);

	}

	private void setTableCellCondition(int... idx) {
		ConditionTableCellRenderer ctcr = new ConditionTableCellRenderer();
		TableColumnModel tcm = table.getColumnModel();
		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(ctcr);
		}

	}

	private void setTableCellWidth(int... width) {
		TableColumnModel tcm = table.getColumnModel();

		for (int i = 0; i < width.length; i++) {
			tcm.getColumn(i).setPreferredWidth(width[i]);
		}
	}

	public void setTableCellAlign(int align, int... idx) {
		TableColumnModel tcm = table.getColumnModel();
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(align);
		
		for (int i = 0; i < idx.length; i++) {
			tcm.getColumn(idx[i]).setCellRenderer(dtcr);
		}
	}

	private DefaultTableModel getModel() {
		CustomTableModel model = new CustomTableModel(getData(), getColumnNames());
		return model;

	}

	private Object[][] getData() {
		Object[][] datas = new Object[1][7];
		datas[0] = new Object[] { null, null, null, null, null, null, null };
		return datas;
	}

	private String[] getColumnNames() {
		return new String[] { "학생 번호", "학생명", "국어", "영어", "수학", "총점", "평균" };
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

	public void setList(List<Student> stdList) {
		Object[][] datas = new Object[stdList.size()][];
		for (int i = 0; i < datas.length; i++) {
			datas[i] = toArray(stdList.get(i));
		}
		CustomTableModel model = new CustomTableModel(datas, getColumnNames());
		table.setModel(model);
		
		setTableCellAlign(SwingConstants.CENTER, 0, 1);
		setTableCellAlign(SwingConstants.RIGHT, 2, 3, 4, 5, 6);

		setTableCellWidth(100, 150, 80, 80, 80, 100, 100);
		// 조건에 맞는 셀 색조절(총점이 180미만은 빨강)
		setTableCellCondition(0, 1, 2, 3, 4, 5, 6);
		
	}

	private Object[] toArray(Student std) {
		Object[] data = new Object[] {
				std.getStdNo(),
				std.getStdName(),
				std.getKor(),
				std.getEng(),
				std.getMath(),
				std.getTotal(), std.getAvg(), String.format("%.2f", std.getAvg()) };
		return data;
	}

	private class ConditionTableCellRenderer extends JLabel implements TableCellRenderer {

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			setText(value == null ? "" : value.toString());
			setOpaque(true);
			int total = (int) table.getValueAt(row, 5);
			if (total < 200) {
				setBackground(Color.ORANGE);
			} else {
				setBackground(Color.WHITE);
			}
			setHorizontalAlignment(SwingConstants.RIGHT);
			return this;
		}

	}
}
