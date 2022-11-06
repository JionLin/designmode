package com.jiaolin.springmvc;

/**
 * @author johnny
 * @Classname Handler
 * @Description
 * @Date 2022/11/6 13:03
 */
public interface HandlerAdapter {

    // 是否支持 handler
    boolean supports(Object handler);


    /**
     * 处理handler
     * @param handler
     */
    void handle(Object handler);

    class HttpHandlerAdapter implements HandlerAdapter {

        @Override
        public boolean supports(Object handler) {

            return (handler instanceof Controller.HttpController);
        }

        @Override
        public void handle(Object handler) {
            ((Controller.HttpController) handler).doHttpHandler();
        }
    }


    class SimpleHandlerAdapter implements HandlerAdapter {

        @Override
        public boolean supports(Object handler) {
            return (handler instanceof Controller.SimpleController);
        }

        @Override
        public void handle(Object handler) {
            ((Controller.SimpleController) handler).doSimpleHandler();
        }
    }


    class AnnotationHandlerAdapter implements HandlerAdapter {

        @Override
        public boolean supports(Object handler) {
            return (handler instanceof Controller.AnnotationController);
        }

        @Override
        public void handle(Object handler) {
            ((Controller.AnnotationController) handler).doAnnotationHandler();
        }
    }

}
