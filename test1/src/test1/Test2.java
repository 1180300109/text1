package test1;
//�ַ�������
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String e = ""; //�մ�
		String greeting = "hello";
		String s = greeting.substring(0,3); //�Ӵ�
        String name = " duanshuai";
        String message = greeting + name; //ƴ��
        String all =String.join("/", "S","M","L"); //��̬join
        boolean result = s.equals(greeting);
        System.out.println(e);
        System.out.println(s);
        System.out.println(message);
        System.out.println(all);
        System.out.println(result);
	}

}
