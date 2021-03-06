package sx.ex.controller;

import org.springframework.web.servlet.ModelAndView;

import junit.framework.TestCase;

public class HelloControllerTests extends TestCase
{
	public void testHandleRequestView() throws Exception
	{
		HelloController controller=new HelloController();
		ModelAndView modelAndView=controller.handleRequest(null,null);
		assertEquals("WEB-INF/jsp/hello.jsp", modelAndView.getViewName());
		assertNotNull(modelAndView.getModel());
		String nowValue=(String) modelAndView.getModel().get("now");
		assertNotNull(nowValue);
	}
}
