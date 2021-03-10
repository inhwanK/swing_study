package swing_study.component.table;

import javax.swing.SwingConstants;

import swing_study.panel.Employee;

@SuppressWarnings("serial")
public class EmpTablePanel extends AbstractCustomTablePanel<Employee> {
	public EmpTablePanel() {
	}

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER, 0, 1, 2, 3, 5);
		setTableCellAlign(SwingConstants.RIGHT, 4);
		// 컬럼별 너비 조정
		setTableCellWidth(100, 150, 80, 80, 80, 100);

	}

	@Override
	protected Object[] toArray(Employee t) {

		return new Object[] { 
				t.getEmpno(), 
				t.getEmpname(),
				String.format("%s[%d]", t.getTitle().getName(),t.getTitle().getNo()),
				t.getManager() == null ? "" : t.getManager().getEmpname(),
				String.format("%,d", t.getSalary()),
				String.format("%s(%d)", t.getDept().getDeptName(), t.getDept().getDeptNo()) 
		};
	}

	@Override
	protected String[] getColumnNames() {
		
		return new String[] { "사원", "사원명", "직책", "직속상사", "급여", "부서" };
	}

}
