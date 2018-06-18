package cn.wanghongchun.spring.beans.factory;

import java.lang.annotation.Annotation;
import java.util.Map;

public interface ListableBeanFactory extends BeanFactory{
    /**
     * 检查下工厂里是否有给定名字name的定义
     * @param var1
     * @return
     */
    boolean containsBeanDefinition(String var1);

    /**
     * 工厂中的bean的数量
     * @return
     */
    int getBeanDefinitionCount();

    /**
     * 获取工厂中所有的bean的名字
     * @return
     */
    String[] getBeanDefinitionNames();

   // String[] getBeanNamesForType(ResolvableType var1);

   // String[] getBeanNamesForType(@Nullable Class<?> var1);

    //String[] getBeanNamesForType(@Nullable Class<?> var1, boolean var2, boolean var3);

    /**
     * 根据给定的注解找到bean的名字
     * @param var1
     * @return
     */
    String[] getBeanNamesForAnnotation(Class<? extends Annotation> var1);
    /**
     * 根据给定的注解找到类
     * @param var1
     * @return
     */
    Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> var1) throws Exception;

    //@Nullable
    <A extends Annotation> A findAnnotationOnBean(String var1, Class<A> var2) throws Exception;
}
