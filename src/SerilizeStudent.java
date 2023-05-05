import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerilizeStudent {
	public static void main(String args[]) throws Exception {

		Student student = new Student();
		student.setLastname("ram");
		student.setLastname("myname");
		student.setCity("pune");
		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\shubh\\Desktop\\ser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			fos.close();
			oos.close();
			System.out.println("Serialization done");

		} catch (Exception e) {
			System.out.println(e);
		} finally {

		}
	}

}
