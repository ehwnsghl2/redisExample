package com.brandjunhoe.redisexample.person.application.dto;

import com.brandjunhoe.redisexample.person.domain.Address;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


@Getter
@Setter
public class PersonDto {

    private String firstname;
    private String lastname;
    private Address address;

}

