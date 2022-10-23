package com.bestrookie.framework.protocol.http;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author bestrookie
 * @version 1.0
 * @date 2022/10/23 13:15
 */
public class DispatcherServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            new HttpServerHandler().handle(request, response);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
