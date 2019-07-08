package com.mars.sso.aouth.server.config.model;

import org.springframework.security.core.GrantedAuthority;

public class SysGrantedAuthority implements GrantedAuthority {

    /**
     * 权限
     */
    private String authority;

    /**
     * 权限
     * @param authority 权限
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
