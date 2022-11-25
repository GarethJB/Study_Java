package object;

public class MemberDTO {
		private String name, id, pw, gender;	
		
		MemberDTO (String name, String id, String pw, String gender) {
			this.name = name;
			this.id = id;
			this.pw = pw;
			this.gender = gender;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public String getId() {
			return id;
		}
		
		public String getPw() {
			return pw;
		}
		
		public String getGender() {
			return gender;
		}
		
		// 모든 클래스는 Object 클래스를 상속받는다
		public String toString() {
			return "이름 : " + name + "\n" + "아이디 : " + id + "\n비밀번호 : " + pw + "\n성별 : " + gender;
		}

}//class
