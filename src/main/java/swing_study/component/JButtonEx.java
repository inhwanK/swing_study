package swing_study.component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JButtonEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private String imgPath = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
	private JToggleButton tglbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JButtonEx frame = new JButtonEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JButtonEx() {
		initialize();
	}
	private void initialize() {
		setTitle("JButton && JToggleButton 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JPanel pLeft = new JPanel();
		contentPane.add(pLeft);
		pLeft.setLayout(new BoxLayout(pLeft, BoxLayout.Y_AXIS));
		
		JButton btn01 = new JButton("Call~");
		btn01.setIcon(new ImageIcon(imgPath  + "KakaoTalk_20210303_140819965.gif"));
		btn01.setRolloverIcon(new ImageIcon(imgPath + "KakaoTalk_20210303_140820194.gif"));
		btn01.setPressedIcon(new ImageIcon(imgPath + "KakaoTalk_20210303_140820088.gif"));
		pLeft.add(btn01);
		
		tglbtn = new JToggleButton("눌러보든가말든가");
		tglbtn.addActionListener(this);
		pLeft.add(tglbtn);
		
		JPanel pRight = new JPanel();
		contentPane.add(pRight);
		pRight.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pTop = new JPanel();
		pTop.setBorder(new TitledBorder(null, "수평 정렬", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pTop);
		pTop.setLayout(new GridLayout(0, 1, 0, 0));
		
		Mybutton btn02 = new Mybutton();
		btn02.setText("left");
		btn02.setHorizontalAlignment(SwingConstants.LEFT);
		pTop.add(btn02);
		
		Mybutton btn03 = new Mybutton();
		btn03.setText("center");
		pTop.add(btn03);
		
		Mybutton btn04 = new Mybutton();
		btn04.setText("right");
		btn04.setHorizontalAlignment(SwingConstants.RIGHT);
		pTop.add(btn04);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		pTop.add(tglbtnNewToggleButton);
		
		JPanel pBottom = new JPanel();
		pBottom.setBorder(new TitledBorder(null, "\uC218\uC9C1 \uC815\uB82C", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pRight.add(pBottom);
		pBottom.setLayout(new GridLayout(1, 0, 0, 0));
		
		Mybutton btn05 = new Mybutton();
		btn05.setVerticalAlignment(SwingConstants.TOP);
		btn05.setText("top");
		pBottom.add(btn05);
		
		Mybutton btn06 = new Mybutton();
		btn06.setText("center");
		pBottom.add(btn06);
		
		Mybutton btn07 = new Mybutton();
		btn07.setVerticalAlignment(SwingConstants.BOTTOM);
		btn07.setText("bottom");
		pBottom.add(btn07);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == tglbtn) {
			actionPerformedTglbtn(e);
		}
	}
	protected void actionPerformedTglbtn(ActionEvent e) {
		if(tglbtn.isSelected()) {
			tglbtn.setText("눌렀네...");
		}else {
			tglbtn.setText("눌러보든가");
			
		}
	}
}
