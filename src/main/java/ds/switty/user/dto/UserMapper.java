package ds.switty.user.dto;

import ds.switty.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "checkPw", ignore = true)
    UserDetail userToDetails(User user);
}
