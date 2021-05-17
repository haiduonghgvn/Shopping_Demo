package com.demo.shopping.entity;


import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;

public class AuditorImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {
        String name = "SYSTEM";
        if (SecurityContextHolder.getContext().getAuthentication().isAuthenticated()){
             name=SecurityContextHolder.getContext().getAuthentication().getName();
        }
        return Optional.ofNullable(name);
    }
}
