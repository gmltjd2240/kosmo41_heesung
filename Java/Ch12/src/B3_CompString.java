
public class B3_CompString {

	public static void main(String[] args) {
		String st1 = "Apple";
		String st2 = "apple";
		int cmp;

		if (st1.equals(st2))
			System.out.println("�� ���ڿ��� �����ϴ�");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�");
		
		cmp = st1.compareTo(st2);
		
		if(cmp == 0)
			System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		else if (cmp < 0)
		System.out.println("������ �տ� ��ġ�ϴ� ���� : "+st1);
		else 
			System.out.println("������ �տ� ��ġ�ϴ� ����: "+st2);
		
		if(st1.compareToIgnoreCase(st2)==0)
			System.out.println("����");
		else
			System.out.println("�ٸ���");

	}

}