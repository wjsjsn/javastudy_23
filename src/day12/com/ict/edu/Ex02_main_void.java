package day12.com.ict.edu;

public class Ex02_main_void {
	public static void main(String[] args) {     
		Ex02_method_void t1 = new Ex02_method_void();
	    
		System.out.println("=== 메서드 실행 전 ===");
		System.out.println("총점 : "+t1.sum);
		System.out.println("평균 : "+t1.avg);
		System.out.println("학점 : "+t1.hak);
		
		
		System.out.println("=== 메서드 실행 ===");
		t1.getSum();
		t1.getAvg();
		t1.getHak();		
		
		System.out.println("총점 : "+t1.sum);
		System.out.println("평균 : "+t1.avg);
		System.out.println("학점 : "+t1.hak);
		
		
	}
}
