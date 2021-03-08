package swing_study.panel;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class TitlePanel extends JPanel {
	private JTextField tftNo;
	private JTextField tftName;

	public TitlePanel() {

		initialize();
	}
	private void initialize() {
		setBorder(new TitledBorder(null, "\uC9C1\uCC45 \uC815\uBCF4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel pNorth = new JPanel();
		pNorth.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(pNorth);
		pNorth.setLayout(new GridLayout(0, 2, 20, 0));
		
		JLabel lbltNo = new JLabel("직책 코드");
		lbltNo.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lbltNo);
		
		tftNo = new JTextField();
		pNorth.add(tftNo);
		tftNo.setColumns(10);
		
		JPanel pSouth = new JPanel();
		pSouth.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(pSouth);
		pSouth.setLayout(new GridLayout(0, 2, 20, 0));
		
		JLabel lbltName = new JLabel("직책");
		lbltName.setHorizontalAlignment(SwingConstants.RIGHT);
		pSouth.add(lbltName);
		
		tftName = new JTextField();
		pSouth.add(tftName);
		tftName.setColumns(10);
	}

	public void setTitle(Title title) {
		tftNo.setText(title.getNo()+"");
		tftName.setText(title.getName());
	}

	public Title getTitle() {
		int tNo = Integer.parseInt(tftNo.getText().trim());
		String tName = tftName.getText().trim();
		
		return new Title(tNo, tName);
	}
	
	public void clearTf() {
		tftNo.setText("");
		tftName.setText("");
	}
	
}
