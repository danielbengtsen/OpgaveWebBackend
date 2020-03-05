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
        ArrayList<User> customerList = UserMapper.getUsers();

        int count = 0;
        for (User u: customerList) {
            count++;
        }

        HttpSession session = request.getSession();

        session.setAttribute("customerOversigt", customerList);
        session.setAttribute("customerCount", count);

        return "oversigt" + "page";
    }
}
