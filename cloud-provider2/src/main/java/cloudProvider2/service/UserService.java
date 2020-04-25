package cloudProvider2.service;


import com.zj.api.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    public User getUser(@Param("id") Long id);
}
