package PresentationLayer;

import DBAccess.UserMapper;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ChangePassword extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");

        if(password1.equals(password2)) {
            UserMapper.changePassword(email, password1);
            HttpSession session = request.getSession();

            session.setAttribute("besked", "Brugeren med Email: "+ email +" har fået ændret password.");
            return "employeepage";
        } else {
            throw new LoginSampleException("The two passwords did not match");
        }


    }
}
