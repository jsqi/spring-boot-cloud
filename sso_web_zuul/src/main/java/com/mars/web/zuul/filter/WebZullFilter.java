package com.mars.web.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class WebZullFilter extends ZuulFilter {

    // 指定当前过滤器在请求之前执行还是之后执行

    @Override
    public String filterType() {
        return "pre";
    }
    // 数字越小越优先
    @Override
    public int filterOrder() {
        return 0;
    }

    // 设置过滤器是否起作用
    @Override
    public boolean shouldFilter() {
        return true;
    }

    // 过滤器的内容
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        String header = requestContext.getRequest().getHeader("Authorization");
        if(null != header && !"".equals(header)){
            requestContext.addZuulRequestHeader("Authorization",header);
        }
        return null;
    }
}
