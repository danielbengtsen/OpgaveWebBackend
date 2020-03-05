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
        String password = request.getParameter("password");
        UserMapper.changePassword(email, password);

        HttpSession session = request.getSession();

        session.setAttribute("besked", "Brugeren med Email: "+ email +" har fået ændret password.");
        return "employeepage";
    }
}
