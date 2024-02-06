package com.wcs.dto.mapper;

import com.wcs.dto.dto.UserDTO;
import com.wcs.dto.entity.User;

public class UserMapper {
    public static UserDTO toDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setPokemons(PokemonMapper.toDTOList(user.getPokemons()));
        return userDTO;
    }
}