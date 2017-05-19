package kadai5;
import java.util.Scanner;

public class IntToEng {
	// メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	int x100 = n / 100;
    	int x10 = n / 10;
    	int x1 = n % 10;
    	if (x10 >=10) x10 %= 10;
    	String answer = "";
    	String answer2 = "";
    	String answer3 = "";
    	
    	if (n>=0 && n<=10){
    	if (n == 0) {
    		answer = "zero";
    	} else if (x1 == 1) {
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
    	} else if (n == 10) {
    		answer = "ten";
    	} 
    	}
    	
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
    	
    	/*else if (n == 20) {
    		answer = "twenty";
    	} else if (n == 30) {
    		answer = "thirty";
    	} else if (n == 40) {
    		answer = "forty";
    	} else if (n == 50) {
    		answer = "fifty";
    	} else if (n == 60) {
    		answer = "sixty";
    	} else if (n == 70) {
    		answer = "seventy";
    	} else if (n == 80) {
    		answer = "eighty";
    	} else if (n == 90) {
    		answer = "ninety";
    	}*/
    	
    	
    	if (n>=20) {
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
    	}
    	
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
    	
    	if (n == 1000) answer = "one thousand";
    	
        return  answer3 + answer2 + answer;
    }
}
