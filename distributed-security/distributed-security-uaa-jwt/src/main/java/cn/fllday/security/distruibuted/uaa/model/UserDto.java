package cn.fllday.security.distruibuted.uaa.model;

import lombok.Data;

@Data
public class UserDto {

    private String id;

    private String username;

    private String password;

    private String fullname;

    private String mobile;

}
