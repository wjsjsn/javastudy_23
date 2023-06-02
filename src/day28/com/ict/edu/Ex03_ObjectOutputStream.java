package day28.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//ObjectOutputStream : 객체 출력 스트림
//writeObject : 객체 직렬화
public class Ex03_ObjectOutputStream {
	public static void main(String[] args) {
		// 1.객체 만들기(직렬화하는과정)
		// gender boolen형 기본은 false(여성)
		Ex03_VO vo1 = new Ex03_VO("고길동", 26, "서울 마포구", true, 179.5);
		Ex03_VO vo2 = new Ex03_VO("이길동", 22, "서울 강동구", true, 170.4);
		Ex03_VO vo3 = new Ex03_VO("삼길동", 23, "서울 강서구", false, 230.3);
		Ex03_VO vo4 = new Ex03_VO("사길동", 24, "서울 강남구", true, 215.2);
		Ex03_VO vo5 = new Ex03_VO("오길동", 25, "서울 강북구", false, 190.1);

		// 2.만들어진 객체를 컬렉션으로 모으자
		ArrayList<Ex03_VO> list = new ArrayList<>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);

		// 3.모은 객체들을 직렬화를 한 후에 파일에 저장
		// 직렬화가 된 정보는 볼 수 없음
		// 읽을 때 역질렬화를 해야 볼 수 있음
		String pathname = "D:/pcl/object01.ser"; // 보통확장자는 ser로 함?
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			// 4.객체 직렬화
			// 한개만 들어갈 수도 있고 여러개면 list로 보냄
			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}
}