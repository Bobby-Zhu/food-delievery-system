package com.sky.mapper;

import com.sky.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where openid = #{openid}")
    public User getByOpenId(String openid);


    public void insert(User user);

    @Select("select * from user where id = #{id}")
    public User getById(Long id);
}
