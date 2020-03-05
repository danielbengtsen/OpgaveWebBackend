package PresentationLayer;

import FunctionLayer.LoginSampleException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Logout extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        request.getSession().invalidate();
        try {
            response.getWriter().println("Du kom igennem");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "../index";
    }
}
