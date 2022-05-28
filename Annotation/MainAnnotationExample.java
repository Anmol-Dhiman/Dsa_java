package Annotation;

import java.lang.reflect.Method;

public class MainAnnotationExample {

    // the target audince of this annotation is method so it can only be apply on
    // methods
    @CustomAnnotation(value = 10)
    public void helloWorld() {

    }

    public static void main(String[] args) throws Exception {

        MainAnnotationExample temp = new MainAnnotationExample();

        // this val has the refernce to the helloWorld()
        Method val = temp.getClass().getMethod("helloWorld", null);

        // form here we get the refernce to the annotation 
        // it give the any Annotation applied on the Method
        CustomAnnotation annotation = val.getAnnotation(CustomAnnotation.class);
        System.out.println(annotation.value());

    }
}
