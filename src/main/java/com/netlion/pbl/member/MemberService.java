package com.netlion.pbl.member;

import com.netlion.pbl.role.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository memberRepository;

    // @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public boolean register(Role role) {
        if (memberRepository.existsByName(role.getName())) {
            return false;
        }
        memberRepository.save(role);
        return true;
    }

    public Role findByName(String name) {
        return memberRepository.findByName(name);
    }

    public List<Role> findAll() {
        return memberRepository.findAll();
    }
}