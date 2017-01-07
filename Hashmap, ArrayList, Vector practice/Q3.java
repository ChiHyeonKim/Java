import java.util.*;

public class Q3 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		String name;
		int point;
		
		System.out.println("** 포인트 관리 프로그램입니다  **");
		while(true){
			System.out.print("이름과 포인터 입력>>");
			name = scanner.next();
			point = scanner.nextInt();
			
			if(map.containsKey(name))
				map.put(name, map.get(name)+point);
			else
				map.put(name, point);
		
			Set<String> keys = map.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()){
				String key = it.next();
				int value = map.get(key);
				System.out.print("("+key+","+value+")");
			}
			
			System.out.println();
		}
	}

}
