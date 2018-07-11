import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class D1_StringWriter {

	public static void main(String[] args) {
		String ks = "���ο� �־ ���� �� �ʿ��� ���� �ƴϴ�.";
		String es = "Life is long if you know how to use it.";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("String.txt"))){
			bw.write(ks, 0, ks.length());
			bw.newLine();//�ٹٲ޹��ڻ���
			bw.write(es, 0, es.length());
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}