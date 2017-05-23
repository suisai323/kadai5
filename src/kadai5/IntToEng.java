package kadai5;
import java.util.Scanner;

public class IntToEng {
	// メインメソッド
    public static void main(String[] args) {

    	for(int i=0; i<5; i++){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));
    	}
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	int x1000 = n / 1000;
    	int x100 = n / 100;
    	int x10 = n / 10;
    	int x1 = n % 10;
    	if (x10 >=10) x10 %= 10;
    	if (x100 >= 10) x100 %= 10;
    	String answer1 = "";
    	String answer10 = "";
    	String answer100 = "";
    	String answer1000 = "";
    	
    	if (n == 0) {
    		answer1 = "zero";
    	}
    	
    	if (n>0 && n<=10){
    		answer1 = digit1(x1, answer1);
    	}
    	
    	answer1 = teen(n, answer1); 
    	
    	if (n>=20) {
    		answer10 = digit10(x10, answer10);
    		answer1 = digit1(x1, answer1);
    	}
    	
    	answer100 = digit100(x100, answer100);

    	answer1000 = digit1000(x1000, answer1000);

    	if (n == 10000) answer1 = "ten thousand";
    	
    	if (n > 10000 || n < 0) answer1 = "表示できません";
    	
        return   answer1000 + answer100 + answer10 + answer1;
    }

	private static String teen(int n, String answer) {
		if (n ==11) {
    		answer = "eleven";
    	} else if (n == 12) {
    		answer = "twelve";
    	} else if (n == 13) {
    		answer = "thirteen";
    	} else if (n == 14) {
    		answer = "fourteen";
    	} else if (n == 15) {
    		answer = "fifteen";
    	} else if (n == 16) {
    		answer = "sixteen";
    	} else if (n == 17) {
    		answer = "seventeen";
    	} else if (n == 18) {
    		answer = "eighteen";
    	} else if (n == 19) {
    		answer = "nineteen";
    	}
		return answer;
	}

	private static String digit1000(int x1000, String answer4) {
		if(x1000 == 1) {
			answer4 = "one thousand ";
		} else if (x1000 == 2) {
			answer4 = "two thousand ";
		} else if (x1000 == 3) {
			answer4 = "three thousand ";
		} else if (x1000 == 4) {
			answer4 = "four thousand ";
		} else if (x1000 == 5) {
			answer4 = "five thousand ";
		} else if (x1000 == 6) {
			answer4 = "six thousand ";
		} else if (x1000 == 7) {
			answer4 = "seven thousand ";
		} else if (x1000 == 8) {
			answer4 = "eight thousand ";
		} else if (x1000 == 9) {
			answer4 = "nine thousand ";
		}
		return answer4;
	}

	private static String digit100(int x100, String answer3) {
		if (x100 == 1) {
    		answer3 = "one hundred ";
    	} else if (x100 == 2) {
    		answer3 = "two hundred ";
    	}else if (x100 == 3) {
    		answer3 = "three hundred ";
    	}else if (x100 == 4) {
    		answer3 = "four hundred ";
    	}else if (x100 == 5) {
    		answer3 = "five hundred ";
    	}else if (x100 == 6) {
    		answer3 = "six hundred ";
    	}else if (x100 == 7) {
    		answer3 = "seven hundred ";
    	}else if (x100 == 8) {
    		answer3 = "eight hundred ";
    	}else if (x100 == 9) {
    		answer3 = "nine hundred ";
    	}
		return answer3;
	}

	private static String digit10(int x10, String answer2) {
		if (x10 == 2) {
    		answer2 = "twenty ";
    	} else if (x10 == 3) {
    		answer2 = "thirty ";
    	} else if (x10 == 4) {
    		answer2 = "forty ";
    	} else if (x10 == 5) {
    		answer2 = "fifty ";
    	}else if (x10 == 6) {
    		answer2 = "sixty ";
    	}else if (x10 == 7) {
    		answer2 = "seventy ";
    	}else if (x10 == 8) {
    		answer2 = "eighty ";
    	}else if (x10 == 9) {
    		answer2 = "ninety ";
    	}
		return answer2;
	}

	private static String digit1(int x1, String answer) {
		if (x1 == 1) {
    		answer = "one";
    	} else if (x1 == 2) {
    		answer = "two";
    	} else if (x1 == 3) {
    		answer = "three";
    	} else if (x1 == 4) {
    		answer = "four";
    	} else if (x1 == 5) {
    		answer = "five";
    	} else if (x1 == 6) {
    		answer = "six";
    	} else if (x1 == 7) {
    		answer = "seven";
    	} else if (x1 == 8) {
    		answer = "eight";
    	} else if (x1 == 9) {
    		answer = "nine";
    	}
		return answer;
	}
}
