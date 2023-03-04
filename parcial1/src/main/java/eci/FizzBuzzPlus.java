package eci;
public class FizzBuzzPlus{
	public String validate(int num){
		String ans = "";
		ans += multipleOfThree(num);
		ans += multipleOfFive(num);
		if (!isFizzBuzz(ans)){
			ans = finishString(ans, num);
			if (ans.equals("")){
				ans = containsThree(num);
			}
			return ans;
		}
		
		return ans;
	}
	
	private String finishString(String word, int num){
		String ans = word + containsFive(num);
		return (ans.equals("FizzBuzz")) ? ans : word;
	}
	
	private String containsThree(int value){
		String flag = "";
		int div = value;
		while (div != 0){
			if (div % 10 == 3){
				flag = "Fizz";
				break;
			}
			div = div / 10;
		}
		return flag;
	}
	
	private String containsFive(int value){
		String flag = "";
		int div = value;
		while (div != 0){
			if (div % 10 == 5){
				flag = "Buzz";
				break;
			}
			div = div / 10;
		}
		return flag;
	}
	
	private String multipleOfFive(int value){
		String buzz = "Buzz";
	    String empty = "";
		return (value % 5 == 0) ? buzz : empty;
	}
	
	private String multipleOfThree(int value){
		String fizz = "Fizz";
	    String empty = "";
		return (value % 3 == 0) ? fizz : empty;
	}
	
	private boolean isFizzBuzz(String word){
		return word.contains("FizzBuzz");
	}
}