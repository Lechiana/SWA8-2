
public class UserManger {
	private IUser user;
	public UserManger(IUser user) {
		this.user = user;
	}
	public String getName() {
		return this.user.getName();
	}
}
