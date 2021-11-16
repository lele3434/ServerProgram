package dao;

public class MemberDAO {

	private static MemberDAO memberDAO;
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		if (memberDAO == null) {
			memberDAO = new MemberDAO();
		}
		return memberDAO;
	}
	
}
