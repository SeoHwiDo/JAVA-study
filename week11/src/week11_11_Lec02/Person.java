package week11_11_Lec02;

class Person {
	private String[] name= {"김화수","한유남"};
	private int[] year= {2000,2012};// 필드 선언 : 이름과 태어난 년도를 저장, private
	private String day;
	private int index;
	public Person() {
	}
	public Person(String[] name, int[] year) {
		this.name = name;
		this.year = year;// 생성자 : 매개변수로 필드 초기화, public
	}

	public String getName() {
		return name[index];// 이름 필드에 대한 getter & setter 메소드 선언, public
	}

	public void setName(String name) {
		for(int i=0;;i++) {
		if(this.name[i].equals(name)) {
			this.index =i;
			break;
		}else
			continue;
		
	}
	}
	public int getYear() {
		return year[index];
	}// 태어난 년도를 반환하는 getter 메소드 선언, public

	public String Day(String day) {
		return day;
	}

	public String checkMask() {
		this.day = day;
		switch (getYear() % 10) {
		case 1:
		case 6:
			day = "월요일";
			break;
		case 2:
		case 7:
			day = "화요일";
			break;
		case 3:
		case 8:
			day = "수요일";
			break;
		case 4:
		case 9:
			day = "목요일";
			break;
		case 5:
		case 0:
			day = "금요일";
			break;
		default:
			break;
		}
		return day;
	}

	// 마스크 구매 가능한 요일을 반환하는 checkMask() 선언, 매개변수 없음, 디폴트 멤버
}
	
