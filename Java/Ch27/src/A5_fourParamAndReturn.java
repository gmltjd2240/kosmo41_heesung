interface HowLong{
	int len(String s);
}
public class A5_fourParamAndReturn {

	public static void main(String[] args) {
		HowLong h1 = s->s.length();
		System.out.println(h1.len("I am so happy"));

	}

}
