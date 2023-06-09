package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex08_JTextComponent extends JFrame{
public Ex08_JTextComponent() {
	super("JTextComponent");
	
	JPanel jp = new JPanel();
	
	// JLabel : 글자를 표시(수정 불가)
	JLabel jLabel1 = new JLabel();
	jLabel1.setText( "I D : ");
	
	JLabel jLabel2 = new JLabel("P W : ");
	JLabel jLabel3 = new JLabel("자기소개서");
	
	// 한 줄 글자 입력 : JTextField
	JTextField jtf1 = new JTextField();
	jtf1.setText("아이디 입력");
	jtf1.setColumns(20);  // 보이는 글자 길이
	
	// JTextField jtf2 = new JTextField("비번 입력", 20);
	// 입력된 글자가 *로 표시되게 하기 위해서 
	//JPasswordField 사용
	JPasswordField jtf2 = new JPasswordField("비번 입력", 10);
	
	
	// 메모장과 같이 여러 줄 글자 입력 : JTextArea(행, 열);
	JTextArea jta = new JTextArea(5, 20);
	
	// JTextArea는 두 가지 옵션을 생각해야함
	// 1. 줄바꿈
	jta.setLineWrap(true);
	
	// 2. 스크롤바
	JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS// 세로 스크롤바 의미
			, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER  // 가로 스크롤바 의미
			);
	
	jp.add(jLabel1);
	jp.add(jtf1);
	jp.add(jLabel2);
	jp.add(jtf2);
	jp.add(jLabel3);
	jp.add(jsp);
	
	add(jp);
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-500, ds.height/2-200, 1000, 400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
}
	
public static void main(String[] args) {
	new Ex08_JTextComponent();
}
}
