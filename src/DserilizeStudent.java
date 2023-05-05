import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DserilizeStudent {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\shubh\\Desktop\\ser.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// read the object
			Object obj = ois.readObject();
			Student student = (Student) obj;
			// convert object into student
			System.out.println("firstname=" + student.getFirstname());
			System.out.println("lastname=" + student.getLastname());
			System.out.println("city=" + student.getCity());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
