package PresentationLayer;

import DBAccess.UserMapper;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DeleteUser extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter("email");
        UserMapper.deleteUser(email);
        HttpSession session = request.getSession();

        session.setAttribute("besked", "Brugeren med Email: "+ email +" er blevet slettet.");
        return "employeepage";
    }
}
