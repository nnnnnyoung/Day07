
public class Day06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,10,0,30,45,0,0,60,60,0,0,0,56,56,56,0,45};
//		���ڴ� �ǹ��� ��ȣ�̰�, 0�� ���̴�.
//		�ǹ��� ��ȣ�� ���� ���� �ǹ��� ũ�Ⱑ 1���� ũ�ٴ� ���̴�.
//		���� 10�� ���� 2�� �ִٸ� �ǹ��� ũ�Ⱑ 2��� �ǹ��̴�.
//		����� 2�̻��� �ǹ��� ��ȣ�� ũ�⸦ ��� ����Ͻÿ�
		int b=1;
		for (int i=0; i<a.length-1; i++) {
			
			if(a[i]==a[i+1]&&a[i]!=0){
				b++;				
			} else {
				if(b>=2) {
					System.out.println("�ǹ���ȣ"+a[i]+"ũ��"+b);
				}
				b=1;
			}
		
		}
	}

}
