
public class Day06_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {10,0,0,30,45,0,0,60,0,0,0,0,56,0,0,0,45};
//		�迭���� 0�� �� ���̴�. �̰��� �ǹ��� �������� �Ѵ�.
//		0�� ���ӵ� ��ŭ�� ���� ũ���� ��������.
//		���� ��� 0�� 3�� �����̶�� �� ũ��� 3�̴�
//		���� ũ�Ⱑ 3�̻��� ���� �迭�� ���� �ε����� ����Ͻÿ�.

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
