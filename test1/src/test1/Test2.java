package test1;
//×Ö·û´®²âÊÔ
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String e = ""; //¿Õ´®
		String greeting = "hello";
		String s = greeting.substring(0,3); //×Ó´®
        String name = " duanshuai";
        String message = greeting + name; //Æ´½Ó
        String all =String.join("/", "S","M","L"); //¾²Ì¬join
        boolean result = s.equals(greeting);
        System.out.println(e);
        System.out.println(s);
        System.out.println(message);
        System.out.println(all);
        System.out.println(result);
	}

}
