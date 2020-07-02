package Week_12;

import java.util.*;

class Word {
	private String word;// 영어 단어 저장을 위한 필드, private
	private String mean;// 영 단어에 대한 뜻을 저장하는 필드, private

	public Word() {
		this(" ", " ");
	}

	public Word(String word, String mean) {
		this.word = word;
		this.mean = mean;// 생성자 – 매개변수로 받은 값을 필드로 초기화
	}

	public String getWord() {
		return word;
	}

	public String getMean() {
		return mean;
	}
	// 모든 필드에 대한 getter 메소드

	public String toString() {
		return getWord() + ":" + getMean();// 객체 내용을 문자열로 반환하는 toString() 메소드
	}

}

class WordTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Word[] wordnote = new Word[7];// 객체 배열을 선언 & 생성, 배열 크기는 7- 본인작성

		for (int i = 0; i < wordnote.length; i++) {
			System.out.print("영단어와 뜻을 입력하세요>>>>>>");
			String word = scan.next();
			String mean = scan.next();
			wordnote[i] = new Word(word, mean);// 입력한 값으로 배열 초기화 - 본인 작성
		}
		while (true) {
			System.out.println("찾고자 하는 단어를 입력하세요.종료(f)>>");
			String end = scan.next();
			if (end.equals("f")) {
				System.out.print("프로그램 종료");
				break;// getter 메소드를 사용하여 객체 배열에 저장된 영 단어와 입력된 영 단어를 equals() 메소드를 사용하여 검색, 일치하는 영 단어를
						// 찾으면 그에 해당하는 뜻을 출력 - 본인작성
			}
			boolean flag = true;
			for (Word w : wordnote) {
				if (end.equals(w.getWord())) {
					System.out.println(w);
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println("해당 단어가 없습니다");
		}
		scan.close();
	}

}
