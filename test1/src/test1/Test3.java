package test1;

import java.util.Arrays;

//�������
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		for(int i = 0;i <= 9;i++)
		{
			a[i] = i;
		}
		for(int element : a) //ѭ��a��ÿһ��Ԫ��
		{
			System.out.println(element);
		}
		System.out.println(Arrays.toString(a)); //�������
		int[] b = {5,3,1,7,2};
		Arrays.sort(b); //���򷽷�
		System.out.println(Arrays.toString(b));
		int[][] c = {{1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7}};
		for(int[] row : c)
		{
			for(int element : row)
			{
				System.out.printf("%d ",element);
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(c));
	}

}
