package hwp;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Simple Hello servlet.
 */
public final class Hello extends HttpServlet {

  /**
   * Respond to a GET request for the content produced by
   * this servlet.
   *
   * @param request The servlet request we are processing
   * @param response The servlet response we are producing
   *
   * @exception IOException if an input/output error occurs
   * @exception ServletException if a servlet error occurs
   */
  public void doGet(HttpServletRequest request,
      HttpServletResponse response)
    throws IOException, ServletException {
    response.setContentType("text/plain");
    PrintWriter writer = response.getWriter();
    writer.println("Hello World!");
  }
}

