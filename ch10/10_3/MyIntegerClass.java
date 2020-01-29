public class MyInteger {
	int value;

	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue(){
		return this.value;
	}
	public Boolean isEven(){
		if(this.value % 2 == 0){
		return true;
		}
		return false;
	}
	public Boolean isOdd(){
		if(this.value % 2 == 1){
			return true;
		}
	return false;
	}
	public Boolean isPrime(){
		for (int divisor = 2; divisor <= this.value / 2; divisor++){
			if (this.value % divisor == 0){
				return false;
				
			}
		}
		return true;
	}
	public static Boolean isEven(int myint){
		if(myint % 2 == 0){
			return true;
		}
		return false;
	}
	public static Boolean isOdd(int myint){
		if (myint % 2 == 1){
			return true;
		}
		return false;
	}
	public static Boolean isPrime(int myint){
		for (int divisor = 2; divisor <= myint / 2; divisor++){
			if (myint % divisor == 0){
				return false;
			}
		}
		return true;
	}

	public static Boolean isEven(MyInteger myint){
		if(myint.getValue() % 2 == 0){
			return true;
		}
			return false; 
	}
	public static Boolean isOdd(MyInteger myint){
		if(myint.getValue() % 2 == 1){
			return true;
		}
		return false;
	}

	public static Boolean isPrime(MyInteger myint){
		for (int divisor = 2; divisor <= myint.getValue() / 2; divisor++){
			if(myint.getValue() % divisor == 0){
				return false;
			}
		}
		return true;
	}
	public  Boolean equals(int i){
		if(this.value == i){
			return true;
		}
		return false;
	}
	public Boolean isEqual(MyInteger myint){
		if (myint.getValue() == this.value){
			return true;
		}
		return false;
	}
	public static int parseInt(char[] chars){
		int x = 0;
		for(int i = 0; i <chars.length; i++){
			int temp = (int)chars[i] - 48;
			x = (x * 10) + temp;
		
		}
		return x;
	}
	public static int parseInt(String stest){
		char[] ch = stest.toCharArray();
		int i = parseInt(ch);
		
		return i;
	}
}
