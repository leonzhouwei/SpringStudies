package org.sky.ssi.login.action;

import org.apache.struts.actions.DispatchAction;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sky.ssi.service.LoginService;
import org.sky.ssi.student.form.StudentForm;
import org.sky.ssi.util.Constants;
import org.sky.ssi.util.session.UserSessionInfo;
import org.springframework.stereotype.Controller;

@Controller("/login")
public class LoginAction extends DispatchAction {
	protected final Log logger = LogFactory.getLog(getClass());

	@Resource
	LoginService loginService;

	public ActionForward submit(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String loginId = "";
		String loginPwd = "";
		HttpSession session = request.getSession();
		try {
			loginId = (String) request.getParameter("loginId");
			loginPwd = (String) request.getParameter("loginPwd");
			if (loginService.login(loginId, loginPwd)) {
				UserSessionInfo uinfo = new UserSessionInfo();
				uinfo.setLoginId(loginId);
				session.setAttribute(Constants.USER_SESSION, uinfo);
				return new ActionForward("/index.do", true);
			} else {
				request.setAttribute("loginCode", "101");
				return new ActionForward("/jsp/login/login.jsp", false);
			}
		} catch (Exception e) {
			logger.error("UserLogin Exception:" + e.getMessage(), e);
			return mapping.findForward("error");
		}

	}

	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			StudentForm stdForm = new StudentForm();
			request.setAttribute("stdForm", stdForm);
		} catch (Exception e) {
			logger.error("UserLogin Exception:" + e.getMessage(), e);
			return mapping.findForward("error");
		}
		return null;
	}
}
