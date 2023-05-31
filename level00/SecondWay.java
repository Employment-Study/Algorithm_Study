package step0;
class SecondWay {
	   public static void main(String[] args) {
		   String numbers ="onetwothreefourfivesixseveneightnine";
           String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

           for (int i = 0; i < numbers_arr.length; i++) {
               numbers = numbers.replaceAll(numbers_arr[i], i+"");
           }

           long answer = Long.parseLong(numbers);
           System.out.println("answer:"+answer);
	}    	
}