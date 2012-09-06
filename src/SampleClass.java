import java.util.HashMap;


public class SampleClass {
	public static void main(String[] args){
		
		HashMap map = new HashMap();
		
		map.put("hoge", new Integer(1));
		
		String foo = new String("test");
		Boolean boo = new Boolean(false);
		
		map.put(boo, foo);
		
		SampleClass sc = new SampleClass();
		
		map.put(map, sc);
		
		int i = 1;
		boolean t = true;
		
		map.put(i, t);
//		map.put(new Integer(i), new Boolean(t));
		
		System.out.println(map.get(boo));
		
		Object c = String.class;
		if(c instanceof String){
			System.out.println("String型インスタンスです。");
		}
		if(c instanceof Class){
			System.out.println("Class型インスタンスです。");
		}
		
	}
}
