package com.example.shiro.mapper;
import com.example.shiro.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {

    User findByUsername(@Param("username") String username);

}
