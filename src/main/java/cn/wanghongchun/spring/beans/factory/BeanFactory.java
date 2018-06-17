package cn.wanghongchun.spring.beans.factory;

public interface BeanFactory {
    String FACTORY_BEAN_PREFIX = "&";

    Object getBean(String name) throws Exception;
    <T> T getBean(String name, Class<T> requiredType) throws Exception;
    <T> T getBean(Class<T> requiredType) throws Exception;
    Object getBean(String name, Object... args) throws Exception;
    boolean containsBean(String name);
    boolean isSingleton(String name) throws Exception;
    boolean isPrototype(String name) throws Exception;
    boolean isTypeMatch(String name, Class<?> targetType) throws Exception;
    Class<?> getType(String name) throws Exception;
    String[] getAliases(String name);
}
