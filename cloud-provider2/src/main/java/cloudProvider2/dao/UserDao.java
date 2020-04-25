package cloudProvider2.dao;

import com.zj.api.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    public User getUser(@Param("id") Long id);
}
