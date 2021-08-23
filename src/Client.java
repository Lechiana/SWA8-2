
public class Client {
	public static void main(String[] args) {
		IUser iuser = new EmployeeUser();
		UserManger user = new UserManger(iuser);
		System.out.println(" "+user.getName());
	}
}
