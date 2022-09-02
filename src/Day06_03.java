
public class Day06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,0,0,30,45,0,0,60,0,0,0,0,56,0,0,0,45};
//		0은 빈땅이다. 가장큰 빈땅의 크기와 시작인덱스를 출력하시오.
		
		int b=0; //현재 위치한 인덱스의 땅 크기
		int c=0; // 가장 큰 빈땅의 크기
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				b++;
				if(b>c) {
					c=b;
				
				}
			}else {
				b=0;
			}	
		} 
		System.out.println("가장 큰 빈 땅의 크기: "+c+"");
		


	      int presentSize = 0; // 현재 위치한 인덱스의 땅 크기
	      int maxSize = 0; // 가장 큰 빈땅의 크기

	      int tempIndex = 0;// 임시위치
	      int index = 0;// 제일큰땅위치

	      for (int i = 0; i < a.length; i++) {
	         if (a[i] == 0) {
	            presentSize++;
	            if (presentSize == 1) {
	               tempIndex = i;
	            }
	            if (presentSize > maxSize) {
	               maxSize = presentSize;
	               index = tempIndex;
	            }
	         } else {
	            presentSize = 0;
	            tempIndex = 0;
	         }
	      }
	      System.out.println("가장 큰 빈 땅의 위치: " + index + "");
	      System.out.println("가장 큰 빈 땅의 크기: " + maxSize + "");
	   
	}

}
