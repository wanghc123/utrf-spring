package cn.wanghongchun.spring.core.io;

public interface ResourceLoader {
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String var1);

   // @Nullable
    ClassLoader getClassLoader();
}
