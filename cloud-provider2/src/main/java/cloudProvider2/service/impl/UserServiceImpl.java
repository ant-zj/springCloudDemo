package cloudProvider2.service.impl;

import cloudProvider2.dao.UserDao;
import cloudProvider2.service.UserService;
import com.zj.api.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User getUser(Long id) {
        return new User(2L,"lisi",18);
    }
}
