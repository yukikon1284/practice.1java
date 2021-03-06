import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public interface Case{
	/*try{
		Case.pl("aaa");
		answer = Case.YN();
	}catch(java.util.InputMismatchException e){
		Case.pl(e);
	}*/
	static int YN() throws java.util.InputMismatchException{
		int answer = 0;
		String[] YN = {"はい","いいえ"};
			for (int i=0; i<YN.length; i++) pl(number(i)+YN[i]);
			answer = scanI(2);
		return answer;
	}
	static void time(int time){
		TimeUnit timeUnit = TimeUnit.SECONDS;
		try{
			timeUnit.sleep(time);
		}catch(InterruptedException e){
		}
	}
	static String scanS(){
		p(direction());
		return new Scanner(System.in).nextLine();
	}
	static int scanI() throws java.util.InputMismatchException{
		p(direction());
		return new Scanner(System.in).nextInt();
	}
	static int scanI(int limit) throws java.util.InputMismatchException{
		int answer = scanI();
		if (answer < 0 || answer > limit) throw new java.util.InputMismatchException(correct());
		return answer;
	}
	static int random(int number){
		return new Random().nextInt(number);
	}
	static String correct(){
		return "対応した数字を入れてください。";
	}
	static void seyCorrect(){
		pl(correct());
	}
	static String number(int i){
		return direction()+(i+1)+" ";
	}
	static String direction(){
		return " >";
	}
	static String back(){
		return "戻る";
	}
	static void pl(Object obj){
		System.out.println(obj);
	}
	static void p(Object obj){
		System.out.print(obj);
	}
	static String toString(int[] number){
		return Arrays.toString(number);
	}
	static String toString(String[] str){
		return Arrays.toString(str);
	}
	static String newLine(){
		return System.getProperty("line.separator");
	}
	//初期化設定　(配列数, 初期数値)
	static int[] setIntArr(int number, int setNumber){
		int[] IntArr = new int[number];
		Arrays.fill(IntArr, setNumber);
		return IntArr;
	}
}