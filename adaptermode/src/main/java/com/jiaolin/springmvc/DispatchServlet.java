package com.jiaolin.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author johnny
 * @Classname DispatchServlet
 * @Description 处理器
 * @Date 2022/11/6 13:18
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapters.add(new HandlerAdapter.SimpleHandlerAdapter());
        handlerAdapters.add(new HandlerAdapter.HttpHandlerAdapter());
        handlerAdapters.add(new HandlerAdapter.AnnotationHandlerAdapter());
    }

    public void doServlet() {
        // Controller.SimpleController controller = new Controller.SimpleController();
        // Controller.HttpController  controller=new Controller.HttpController();
        Controller.AnnotationController controller=new Controller.AnnotationController();
        HandlerAdapter adapter = getHandler(controller);
        adapter.handle(controller);
    }

    private HandlerAdapter getHandler(Controller controller) {
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.supports(controller)) {
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doServlet();
    }
}
