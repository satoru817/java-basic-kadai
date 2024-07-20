package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> dic;
	
	Dictionary_Chapter21(){
		this.dic = new HashMap<String,String>();
		dic.put("apple","りんご");
		dic.put("peach", "桃");
		dic.put("banana","バナナ");
		dic.put("lemon", "レモン");
		dic.put("pear", "梨");
		dic.put("kiwi", "キウィ");
		dic.put("strawberry", "いちご");
		dic.put("grape", "ぶどう");
		dic.put("muscat", "マスカット");
		dic.put("cherry", "さくらんぼ");
	}


	
	public void search(String[] arr,HashMap<String, String> dic) {
		for(String item: arr) {
			if(dic.get(item)==null) {
				System.out.println(item+"は辞書に存在しません");
			}else {
				System.out.println(item+"の意味は"+dic.get(item));
			}
		}
	}
	


}
