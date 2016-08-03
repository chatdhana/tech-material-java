package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class priceincrease_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/WEB-INF/spring.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_hasBindErrors_name;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  public java.util.List getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_hasBindErrors_name = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_spring_bind_path.release();
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_spring_hasBindErrors_name.release();
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("  \r\n");
      out.write("<!-- use spring.tld -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head><title>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</title></head>\r\n");
      out.write("<body>\r\n");
      out.write("<h1>");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</h1>\r\n");
      out.write("<form method=\"post\">\r\n");
      out.write("  <table width=\"95%\" bgcolor=\"f8f8ff\" border=\"0\" cellspacing=\"0\" cellpadding=\"5\">\r\n");
      out.write("    <tr>\r\n");
      out.write("      <td alignment=\"right\" width=\"20%\">Increase (%):</td>\r\n");
      out.write("      \r\n");
      out.write("      <!-- \r\n");
      out.write("      For the  input field, we surround it with a spring:bind tag and specify the \"path\" to the property we are concerned with, in this\r\n");
      out.write("       case priceIncrease.percentage, to refer to the percentageproperty of the model object stored in the request  object under the name command. \r\n");
      out.write("      ie:\r\n");
      out.write("  The  spring:bind tag is used to bind an <input> form element to a command object PriceIncrease.java, \r\n");
      out.write("  that is used together with the form. This command object is later passed in to the validator and if it passes\r\n");
      out.write("   validation it is passed on to the controller. The ");
      out.write("${status.errorMessage}");
      out.write(" and ");
      out.write("${status.value}");
      out.write(" are special\r\n");
      out.write("    variables declared by the framework that can be used to display error messages and the current value\r\n");
      out.write("     of the field.\r\n");
      out.write("  -->\r\n");
      out.write("  \r\n");
      out.write("      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_0.setParent(null);
      _jspx_th_spring_bind_0.setPath("priceIncrease.percentage");
      int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
        if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n");
            out.write("        <td width=\"20%\">\r\n");
            out.write("          <input type=\"text\" name=\"percentage\" value=\"");
            if (_jspx_meth_c_out_0(_jspx_th_spring_bind_0, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
              return;
            out.write("\">\r\n");
            out.write("        </td>\r\n");
            out.write("        <td width=\"60%\">\r\n");
            out.write("          <font color=\"red\">");
            if (_jspx_meth_c_out_1(_jspx_th_spring_bind_0, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
              return;
            out.write("</font>\r\n");
            out.write("        </td>\r\n");
            out.write("      ");
            int evalDoAfterBody = _jspx_th_spring_bind_0.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_0.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_0);
      }
      out.write("\r\n");
      out.write("      \r\n");
      out.write("    </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  <br>\r\n");
      out.write("  \r\n");
      out.write("  ");
      //  spring:hasBindErrors
      org.springframework.web.servlet.tags.BindErrorsTag _jspx_th_spring_hasBindErrors_0 = (org.springframework.web.servlet.tags.BindErrorsTag) _jspx_tagPool_spring_hasBindErrors_name.get(org.springframework.web.servlet.tags.BindErrorsTag.class);
      _jspx_th_spring_hasBindErrors_0.setPageContext(_jspx_page_context);
      _jspx_th_spring_hasBindErrors_0.setParent(null);
      _jspx_th_spring_hasBindErrors_0.setName("priceIncrease");
      int[] _jspx_push_body_count_spring_hasBindErrors_0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_hasBindErrors_0 = _jspx_th_spring_hasBindErrors_0.doStartTag();
        if (_jspx_eval_spring_hasBindErrors_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.validation.Errors errors = null;
          errors = (org.springframework.validation.Errors) _jspx_page_context.findAttribute("errors");
          do {
            out.write("\r\n");
            out.write("    <b>Please fix all errors!</b>\r\n");
            out.write("  ");
            int evalDoAfterBody = _jspx_th_spring_hasBindErrors_0.doAfterBody();
            errors = (org.springframework.validation.Errors) _jspx_page_context.findAttribute("errors");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_hasBindErrors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_hasBindErrors_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_hasBindErrors_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_hasBindErrors_0.doFinally();
        _jspx_tagPool_spring_hasBindErrors_name.reuse(_jspx_th_spring_hasBindErrors_0);
      }
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  <br><br>\r\n");
      out.write("  <input type=\"submit\" alignment=\"center\" value=\"Execute\">\r\n");
      out.write("</form>\r\n");
      out.write("<a href=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">Home</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("title");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.el.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.el.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.el.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("priceincrease.heading");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
    _jspx_th_c_out_0.setValue("${status.value}");
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.el.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.el.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.el.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
    _jspx_th_c_out_1.setValue("${status.errorMessage}");
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.el.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.el.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.el.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("hello.htm");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
      return true;
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
