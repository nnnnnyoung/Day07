
public class Day06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		int[] point= {20,32,12,34,24,23};
		String[] name={"kim","lee","part","chol","choo","ryu"};
		// ���� ���� ������ ȹ���� ����� ������ �̸��� ����Ͻÿ�

		int maxPoint=0; //���� ���� ������ �ε���
		
		for(int i=0; i<point.length; i++){
			if(point[maxPoint]<point[i]) {
					maxPoint=i;
			}
			
		}
		
		System.out.println("���� ���� ���� :"+point[maxPoint]+" 1�� "+name[maxPoint]);
		
		
//		�� ��������
//		������ ������ 1���̴�
//		1����� 3������� ������ �̸��� ����Ͻÿ�.
		int a=1;
		for(int j=0; j<3; j++) {
			
			for(int i=0; i<point.length; i++){
				if(point[maxPoint]<point[i]) {
					maxPoint=i;
				}	
			} 	
			System.out.println(a+"�� ���� "+point[maxPoint]+" �̸� "+name[maxPoint]);
			point[maxPoint]=0;
			a++;
		}
	}

}
