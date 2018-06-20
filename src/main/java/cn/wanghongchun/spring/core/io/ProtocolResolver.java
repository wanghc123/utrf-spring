package cn.wanghongchun.spring.core.io;

/**
 * 自定义协议解析，比如spring就有一个 “classpath:”开头的特定协议
 */
public interface ProtocolResolver {
    Resource resolve(String var1, ResourceLoader var2);
}
