package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.MemberDao;
import model.Member;
import util.DbConnection;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		//new MemberDaoImpl().addMember("aa", "yy", "123456789", "台北", "444");
		//Member member=new Member("tttt", "yy", "123456789", "台北", "444");
		
		//new MemberDaoImpl().addMember(member);
		//System.out.println(new MemberDaoImpl().selectAllMember1());
		
		//System.out.println(new MemberDaoImpl().selectMember2());
		
		//new MemberDaoImpl().updateMember("yam", "台中", 8);
		//new MemberDaoImpl().deleteMember(10);
	

	}
	
	Connection conn=DbConnection.getDb();
	
	
	@Override
	public void addMember(String name, String username, String password, String address, String phone) {
		String sql="insert into member(name,username,password,address,phone) "
				+ "values(?,?,?,?,?)";
		
		Member member=new Member(name,username,password,address,phone);
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, member.getName());
			ps.setString(2, member.getUsername());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getAddress());
			ps.setString(5, member.getPhone());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void addMember(Member member) {
		String sql="insert into member(name,username,password,address,phone) "
				+ "values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getUsername());
			ps.setString(3, member.getPassword());
			ps.setString(4, member.getAddress());
			ps.setString(5, member.getPhone());
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

	@Override
	public String selectAllMember1() {
		String sql="select * from member";
		String show="";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				show=show+"<tr><td>id"+rs.getString("id")+
						"<td>名:"+rs.getString("name")+
						"<td>帳號:"+rs.getString("username")+
						"<td>密碼:"+rs.getString("password")+
						"<td>地址:"+rs.getString("address")+
						"<td>電話:"+rs.getString("phone");
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return show;
	}

	@Override
	public List<Member> selectMember2() {
		String sql="select * from member";
		List<Member> l=new ArrayList<>();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Member member=new Member();
				member.setId(rs.getInt("id"));
				member.setName(rs.getString("name"));
				member.setUsername(rs.getString("username"));
				member.setPassword(rs.getString("password"));
				member.setAddress(rs.getString("address"));
				member.setPhone(rs.getString("phone"));
				
				l.add(member);
				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return l;
	}

	@Override
	public void updateMember(String name, String address, int id) {
		String sql="update member set name=?,address=? where id=? ";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setInt(3, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteMember(int id) {
		String sql="delete from member where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
