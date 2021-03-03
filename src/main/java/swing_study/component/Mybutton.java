package swing_study.component;

import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Mybutton extends JButton {

	private String imgPath = System.getProperty("user.dir") + File.separator + "Images"+File.separator;
	public Mybutton() {
		setIcon(new ImageIcon(imgPath + "KakaoTalk_20210303_140819965.gif"));
		setRolloverIcon(new ImageIcon(imgPath + "KakaoTalk_20210303_140820194.gif"));
		setPressedIcon(new ImageIcon(imgPath + "KakaoTalk_20210303_140820088.gif"));
	}

}
