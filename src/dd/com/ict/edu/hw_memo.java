package dd.com.ict.edu;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class hw_memo extends JFrame{
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu m_file, m_form, font_form, m_help;
	JMenuItem i_newfile, i_openfile, i_savefile, i_exitfile, i_item1, i_item2, i_item3, i_help, i_info;
	public hw_memo() {
	super("간단메모장");
	
	jta = new JTextArea();
	jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
			ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	jta.setLineWrap(true);

	jmb = new JMenuBar();

	m_file = new JMenu("  파  일  ");
	m_form = new JMenu("  서  식  ");
	font_form = new JMenu("글자서식");
	m_help = new JMenu("  도 움 말  ");

	i_newfile = new JMenuItem("  새파일  ");
	i_openfile = new JMenuItem("  열 기 ...  ");
	i_savefile = new JMenuItem("  저 장 ...  ");
	i_exitfile = new JMenuItem("  종  료  ");
	i_item1 = new JMenuItem("  돋움, 기울기, 30  ");
	i_item2 = new JMenuItem("  궁서, 굵게, 40  ");
	i_item3 = new JMenuItem("  굴림, 기본, 20  ");
	i_help = new JMenuItem("  도 움 말  ");
	i_info = new JMenuItem("  메모장 정보  ");

	// 메뉴아이템을 메뉴에 붙이기
	m_file.add(i_newfile);
	m_file.add(i_openfile);
	m_file.addSeparator();
	m_file.add(i_savefile);
	m_file.addSeparator();
	m_file.add(i_exitfile);

	m_form.add(font_form);

	font_form.add(i_item1);
	font_form.add(i_item2);
	font_form.add(i_item3);

	m_help.add(i_help);
	m_help.add(i_info);

	// 메뉴를 메뉴바에 붙이기
	jmb.add(m_file);
	jmb.add(m_form);
	jmb.add(m_help);

	// 메뉴바에 프레임 붙이기
	setJMenuBar(jmb);
	add(jsp);

	setSize(600, 600);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);

	// 새파일
	i_newfile.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 메모장 안에 글자 존재여부 판단
			int size = jta.getText().length();
			if (size == 0) {
				jta.setText("");
			} else {
				int res = JOptionPane.showOptionDialog(getParent(), "변경 내용을 제목 없음에 저장하시겠습니까?", "간단 메모장",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
				if (res == 0) {
					// 실제 저장하는 코드
				} else if (res == 1) {
					jta.setText("");
				} else if (res == 2) {
					return;
				}
			}
		}
	});

	// 열기
	i_openfile.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 파일 열기 다이얼로그
			FileDialog fd = new FileDialog((JFrame) getParent(), "불러오기", FileDialog.LOAD);
			fd.setVisible(true);
			// 실제 불러오는 코딩(I/O)
			String pathname = fd.getDirectory() + fd.getFile();
			if(pathname.length()>0){
				File file = new File(pathname);
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				try {
					fis = new FileInputStream(file);
					bis = new BufferedInputStream(fis);
					byte[] b = new byte[(int) file.length()]; 
					bis.read(b);
					String msg = new String(b).trim();
					jta.setText(msg);
				}catch (Exception e1) {
				} finally {
					try {
						bis.close();
						fis.close();
					} catch (Exception e2) {
					}
				}
			}
			}
	});

	// 저장
	i_savefile.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 파일 저장 다이얼로그
			FileDialog fd = new FileDialog((JFrame) getParent(), "저장하기", FileDialog.SAVE);
			fd.setVisible(true);
			// 실제 저장하는 코딩(I/O)
			String pathname = fd.getDirectory() + fd.getFile();
			if (pathname.length() > 0) {
				File file = new File(pathname);
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				try {
					fos = new FileOutputStream(file);
					bos = new BufferedOutputStream(fos);

					String str = jta.getText().trim();
					byte[] arr = str.getBytes();
					bos.write(arr);
					bos.flush();

				} catch (Exception e1) {
				} finally {
					try {
						bos.close();
						fos.close();
					} catch (Exception e2) {
					}
				}
			}
			jta.setText("");
		}
	});

	// 종료
	i_exitfile.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
			// 원래는 내용이 변경되면 저장할지 물어보고
			// 내용이 변경되지 않으면 그냥 종료
		}
	});

	// 서식
	i_item1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 돋움, 기울기, 30
			// Font font = new Font(글꼴, 스타일, 사이즈);
			Font font = new Font("돋움", Font.ITALIC, 30);
			jta.setFont(font);
		}
	});

	i_item2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 궁서, 굵게, 40
			Font font = new Font("궁서", Font.BOLD, 40);
			jta.setFont(font);
		}
	});

	i_item3.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 굴림, 기본, 20
			Font font = new Font("굴림", Font.PLAIN, 20);
			jta.setFont(font);
		}
	});

	i_help.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 메시지창 호출
			JOptionPane.showMessageDialog(getParent(), "도움말");
		}
	});

	i_info.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			// 메시지창 호출
			JOptionPane.showMessageDialog(getParent(), "간단 메모장 정보");
		}
	});
}
public static void main(String[] args) {
	new hw_memo();
}
}
