
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author doanxuanquyet
 */
public class DemoEvent implements ServletContextListener, HttpSessionListener,HttpSessionAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("web bat dau chay");
        sce.getServletContext().setAttribute("cnt", "0");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("web ket thuc");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("co client moi,tao session");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("co session bi huy");
    }

    //su kien cua attribute
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
    }
}
