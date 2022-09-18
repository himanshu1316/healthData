package Device;

import Device.Device;

import java.util.List;

public class User {
    public String username;
    final String password;
    public String name;
    public String mobile;
    public String email;

    public User( String username, String password ){
        this.username = username;
        this.password = password;
        this.name = null;
        this.mobile = null;
        this.email = null;
    }

    public void addUserDetails(String name , String mobile, String email) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

}
