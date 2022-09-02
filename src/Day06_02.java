
public class Day06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,0,0,30,45,0,0,60,0,0,0,0,56,0,0,0,45};
//		배열에서 0은 빈 땅이다. 이곳에 건물을 지으려고 한다.
//		0이 연속된 만큼을 땅의 크기라고 가정하자.
//		예를 들어 0이 3개 연속이라면 땅 크기는 3이다
//		땅의 크기가 3이상인 곳의 배열의 시작 인덱스를 출력하시오.

		int b=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				b++;
				if(b==3) {
					System.out.println(i-2);
				}
			}else {
				b=0;
			}
		}
		
		
		
		
	}

}
