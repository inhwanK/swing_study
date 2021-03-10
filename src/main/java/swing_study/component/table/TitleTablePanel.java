package swing_study.component.table;

import javax.swing.SwingConstants;

import swing_study.panel.Title;

public class TitleTablePanel extends AbstractCustomTablePanel<Title> {
	public TitleTablePanel() {
	}

	@Override
	protected void setAlignAndWidth() {
		// 컬럼내용 정렬
		setTableCellAlign(SwingConstants.CENTER,0, 1);
		// 컬럼별 너비 조정
		setTableCellWidth(100, 150);

	}

	@Override
	protected String[] getColumnNames() {
		return new String[] { "직책번호", "직책명" };
	}

	@Override
	public Object[] toArray(Title t) {
		Object[] i = { t.getNo(), t.getName() };
		return i;
	}
	
}
