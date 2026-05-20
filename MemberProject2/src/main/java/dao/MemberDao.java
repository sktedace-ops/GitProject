package dao;

import java.util.List;

import model.Member;

public interface MemberDao {
	//create
	void addMember(String name,String username,String password,String address,String phone);
	void addMember(Member member);//inject注入
	//read
	String selectAllMember1();
	List<Member> selectMember2();
	
	//update
	void updateMember(String name,String address,int id);
	
	//delete
	void deleteMember(int id);
}
