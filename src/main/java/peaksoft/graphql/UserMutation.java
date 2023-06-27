package peaksoft.graphql;

import graphql.annotations.annotationTypes.GraphQLMutation;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.entity.User;
import peaksoft.service.UserService;

@Component
@RequiredArgsConstructor
public class UserMutation implements GraphQLMutationResolver {
    private final UserService userService;
    public User createUser(String name,int age,String email){
        return userService.save(name, age, email);
    }

}
