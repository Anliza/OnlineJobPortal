package com.ann.app.action;
// Anything that needs to be reused in all action classes can be implemented in this class
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import javax.servlet.http.HttpServlet;
import org.apache.commons.beanutils.BeanUtils;

public class BaseAction extends HttpServlet {

    public void serializeForm(Object bean, Map<String, ? extends Object> requestMap){
        try {
            BeanUtils.populate(bean, requestMap);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }// implements the bean utils to serialize form parameters to an object
    
}
