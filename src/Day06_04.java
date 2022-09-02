
public class Day06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,10,0,30,45,0,0,60,60,0,0,0,56,56,56,0,45};
//		숫자는 건물의 번호이고, 0은 빈땅이다.
//		건물의 번호가 같은 것은 건물의 크기가 1보다 크다는 것이다.
//		만약 10이 연속 2개 있다면 건물의 크기가 2라는 의미이다.
//		사이즈가 2이상인 건물의 번호와 크기를 모두 출력하시오
		int b=1;
		for (int i=0; i<a.length-1; i++) {
			
			if(a[i]==a[i+1]&&a[i]!=0){
				b++;				
			} else {
				if(b>=2) {
					System.out.println("건물번호"+a[i]+"크기"+b);
				}
				b=1;
			}
		
		}
	}

}
