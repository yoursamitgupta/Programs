package listOfProgram;

public class Pallin {

	public static void main(String[] args) {
		
		
		/*int Sum=0;
		int no =13113;
		int r=0;
		
		int n=no;
		
		while (n>0){
			
		
			r= n%10;  //5 //1 //5   
			n=n/10; //51 //5  //0 ///// quotient
			Sum= Sum*10+r; //5  //51  //515
			
		}*/
		
		
		String word="MOM";
		
		char[] c = word.toCharArray();
		String reverse = "";
		
		
		for (int i=c.length;i>0;i--){
			int j=0;
		reverse= reverse+c[i-1];
			
			
			j++;
			
		}
		System.out.println(reverse);
		
		
	/*	if (no==Sum){
		System.out.println("pallindrom");
		}else{
			System.out.println("not");
		}*/

	}

}
