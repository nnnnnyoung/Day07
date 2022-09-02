
public class Day06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		int[] point= {20,32,12,34,24,23};
		String[] name={"kim","lee","part","chol","choo","ryu"};
		// 가장 높은 점수를 획득한 사람의 점수와 이름을 출력하시오

		int maxPoint=0; //가장 높은 점수의 인덱스
		
		for(int i=0; i<point.length; i++){
			if(point[maxPoint]<point[i]) {
					maxPoint=i;
			}
			
		}
		
		System.out.println("가장 높은 점수 :"+point[maxPoint]+" 1등 "+name[maxPoint]);
		
		
//		위 문제에서
//		점수가 높으면 1등이다
//		1등부터 3등까지의 점수와 이름을 출력하시오.
		int a=1;
		for(int j=0; j<3; j++) {
			
			for(int i=0; i<point.length; i++){
				if(point[maxPoint]<point[i]) {
					maxPoint=i;
				}	
			} 	
			System.out.println(a+"등 점수 "+point[maxPoint]+" 이름 "+name[maxPoint]);
			point[maxPoint]=0;
			a++;
		}
	}

}
