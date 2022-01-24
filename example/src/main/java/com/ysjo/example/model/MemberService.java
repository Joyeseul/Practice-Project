package com.ysjo.example.model;

import java.util.List;

public interface MemberService {
    List<Member> findAll();

    Member findOne(long idx);

    Member save(Member member);

    void delete(long idx);
}
