package com.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Member;

/**
 * 비밀번호 변경
 * Servlet implementation class MyPwdupdateController
 */
@WebServlet("/mypwdup.me")
public class MyPwdupdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyPwdupdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String memberId = request.getParameter("memberId");
		String memberPwd = request.getParameter("memberPwd");
		String updatePwd = request.getParameter("updatePwd");
		
		Member updateMem = new MemberService().myupdatePwd(memberId,memberPwd,updatePwd);
		
		HttpSession session = request.getSession();
		
		if(updateMem == null) {
			session.setAttribute("alertMsg", "비밀번호 변경에 실패했습니다.");
		}else {
			session.setAttribute("loginMember", updateMem);
			session.setAttribute("alertMsg", "성공적으로 비밀번호가 변경되었습니다.");
		}
		response.sendRedirect(request.getContextPath() + "/mypageform.me");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
