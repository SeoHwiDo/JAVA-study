package week11_11_Lec02;

class Person {
	private String[] name= {"��ȭ��","������"};
	private int[] year= {2000,2012};// �ʵ� ���� : �̸��� �¾ �⵵�� ����, private
	private String day;
	private int index;
	public Person() {
	}
	public Person(String[] name, int[] year) {
		this.name = name;
		this.year = year;// ������ : �Ű������� �ʵ� �ʱ�ȭ, public
	}

	public String getName() {
		return name[index];// �̸� �ʵ忡 ���� getter & setter �޼ҵ� ����, public
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
	}// �¾ �⵵�� ��ȯ�ϴ� getter �޼ҵ� ����, public

	public String Day(String day) {
		return day;
	}

	public String checkMask() {
		this.day = day;
		switch (getYear() % 10) {
		case 1:
		case 6:
			day = "������";
			break;
		case 2:
		case 7:
			day = "ȭ����";
			break;
		case 3:
		case 8:
			day = "������";
			break;
		case 4:
		case 9:
			day = "�����";
			break;
		case 5:
		case 0:
			day = "�ݿ���";
			break;
		default:
			break;
		}
		return day;
	}

	// ����ũ ���� ������ ������ ��ȯ�ϴ� checkMask() ����, �Ű����� ����, ����Ʈ ���
}
	
