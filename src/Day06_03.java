
public class Day06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {10,0,0,30,45,0,0,60,0,0,0,0,56,0,0,0,45};
//		0�� ���̴�. ����ū ���� ũ��� �����ε����� ����Ͻÿ�.
		
		int b=0; //���� ��ġ�� �ε����� �� ũ��
		int c=0; // ���� ū ���� ũ��
		
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
		System.out.println("���� ū �� ���� ũ��: "+c+"");
		


	      int presentSize = 0; // ���� ��ġ�� �ε����� �� ũ��
	      int maxSize = 0; // ���� ū ���� ũ��

	      int tempIndex = 0;// �ӽ���ġ
	      int index = 0;// ����ū����ġ

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
	      System.out.println("���� ū �� ���� ��ġ: " + index + "");
	      System.out.println("���� ū �� ���� ũ��: " + maxSize + "");
	   
	}

}
