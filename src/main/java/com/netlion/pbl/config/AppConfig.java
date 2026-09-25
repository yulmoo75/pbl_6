package com.netlion.pbl.config;

import com.netlion.pbl.member.MemberRepository;
import com.netlion.pbl.member.MemberService;
import com.netlion.pbl.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
public class AppConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
}
