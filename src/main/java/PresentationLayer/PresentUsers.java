package PresentationLayer;

import DBAccess.UserMapper;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import FunctionLayer.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

public class PresentUsers extends Command {
    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        ArrayList<User> listen = UserMapper.getUsers();

        HttpSession session = request.getSession();

        session.setAttribute("oversigt", listen);

        return "oversigt" + "page";
    }
}
