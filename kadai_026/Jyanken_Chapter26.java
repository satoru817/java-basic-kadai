package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	HashMap<String,String> jyankenMap;
	
	Jyanken_Chapter26(){
		this.jyankenMap = new HashMap<String,String>();
		jyankenMap.put("r","グー");
		jyankenMap.put("s","チョキ");
		jyankenMap.put("p","パー");
	}
	
	public String getMyChoice() {
		System.out.println("自分のじゃんけんの手を入力しましょう"
				+ "\nグーはrockのrを入力しましょう\n"
				+ "チョキはscissorsのsを入力しましょう\n"
				+ "パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String input = scanner.next();
			if(!input.equals("p") && !input.equals("r") && !input.equals("s")) {
				System.out.println("正しい手を入力してください");
				continue;//入力値が不正な場合にwhile文の始めに戻る
			}else {
				scanner.close();
				return this.jyankenMap.get(input);
			}
		}
		

		
	}
	
	public String getRandom() {
		int rand = (int)Math.floor(Math.random()*3);
		String[] hands = {"グー","チョキ","パー"};
		String hand = hands[rand];
		
		return hand;
	}
	
	public void playGame() {
		String pchand = getRandom();
		String myhand = getMyChoice();
		if(pchand.equals(myhand)) {
			System.out.println("あいこです");
		}else if((pchand.equals("グー") && myhand.equals("チョキ"))||(pchand.equals("パー")&& myhand.equals("グー"))||(pchand.equals("チョキ")&&myhand.equals("パー"))) {
			System.out.println("自分の手は" + myhand +",対戦相手の手は"+ pchand);
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の手は" + myhand +",対戦相手の手は"+pchand);
			System.out.println("相手の勝ちです");
		}
		
		
	}

}
