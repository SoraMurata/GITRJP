import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class RJPServlet extends HttpServlet {
    
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
            
        //文字コード
        req.setCharacterEncoding("utf-8");  
            
        String studentname = req.getParameter("name");
        String nationality = req.getParameter("nation");

        //リクエストにデータを登録する
        req.setAttribute("name", studentname);
        req.setAttribute("nation", nationality);

        //URL指定
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("resultrjp"); 

        //JSPにリクエストを送信する
        dispatcher.forward(req, res);
    }
}