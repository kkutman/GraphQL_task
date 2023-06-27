package peaksoft.service;

import jakarta.annotation.PostConstruct;
import peaksoft.entity.User;

import java.util.List;

public interface UserService {
    User save(String name,int age,String email);
    List<User>getAllUser();
    User getById(Long id);
}
