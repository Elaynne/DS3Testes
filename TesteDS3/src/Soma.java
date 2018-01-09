public class Soma {
		public static int sum(int maxInt, int n ){
		int result = 0;
		int i = 0;
		if(n < 0)
			n = -n;		
		while((i < n) && (result <= maxInt)){
			i++;
			result = result + i;
		}
		if(result <= maxInt){
			System.out.println(Integer.toString(result));
			return result;
		}
		else{
			System.out.println("Too Large");
			return -1;
		}
	}	
}
