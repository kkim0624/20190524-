package kr.or.ddit;

public class UserVo {
	
	private String userId;
	private String name;
	
	public UserVo() {

	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", name=" + name + "]";
	}

	public UserVo(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
