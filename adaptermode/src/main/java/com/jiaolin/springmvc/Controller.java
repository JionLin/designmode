package com.jiaolin.springmvc;

/**
 * @author johnny
 * @Classname Controller
 * @Description
 * @Date 2022/11/6 12:57
 */
public interface Controller {

    class SimpleController implements Controller {
        public void doSimpleHandler() {
            System.out.println("simple....");
        }
    }

    class AnnotationController implements Controller {
        public void doAnnotationHandler() {
            System.out.println("annotation....");
        }
    }

    class HttpController implements Controller {
        public void doHttpHandler() {
            System.out.println("http.....");
        }
    }
}
