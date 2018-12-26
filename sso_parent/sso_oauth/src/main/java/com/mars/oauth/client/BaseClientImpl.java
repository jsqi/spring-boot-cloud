package com.mars.oauth.client;

import com.mars.domain.eneity.Resault;
import org.springframework.stereotype.Component;

@Component
public class BaseClientImpl implements BaseClient {
    @Override
    public Resault getByToken(String adminId) {
        return new Resault("BASE服务暂时无法使用",20000,null);
    }
}
