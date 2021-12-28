package com.kylin.auth.service.impl;

import com.kylin.auth.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    /**
     * 实现自定义认证流程
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> authorities = new ArrayList<>();
        GrantedAuthority s = new SimpleGrantedAuthority("ROLE_ROOT");
        authorities.add(s);
        UserDetails userDetails = new User("zhangsan","{noop}123",authorities);
        return userDetails;
    }
}
