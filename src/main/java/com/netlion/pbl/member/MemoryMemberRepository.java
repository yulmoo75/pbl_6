package com.netlion.pbl.member;

import com.netlion.pbl.role.Role;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemoryMemberRepository implements MemberRepository {
    private List<Role> members = new ArrayList<>();

    @Override
    public void save(Role role) {
        members.add(role);
    }

    @Override
    public Role findByName(String name) {
        for (Role role : members) {
            if (role.getName().equals(name)) {
                return role;
            }
        }
        return null;
    }

    @Override
    public List<Role> findAll() {
        return members;
    }

    @Override
    public boolean existsByName(String name) {
        return findByName(name) != null;
    }
}
