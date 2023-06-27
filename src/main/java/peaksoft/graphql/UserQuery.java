package peaksoft.graphql;

import graphql.kickstart.tools.GraphQLResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.entity.User;
import peaksoft.service.UserService;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserQuery implements GraphQLResolver {
    private final UserService userService;

    public List<User>getUser(){
        return userService.getAllUser();
    }
    public User getUser(Long id){
        return userService.getById(id);
    }

}
