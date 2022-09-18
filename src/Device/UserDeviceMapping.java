package Device;

import java.util.List;

public class UserDeviceMapping {
    User user;
    List<Device> deviceList; //List of devices

    public UserDeviceMapping( User user, Device device ){
        this.user = user;
        this.deviceList.add(device);
    }

    public List<Device> getAllDevices(User user){
        List<Device> deviceList = null;
        //db.read( user );
        return deviceList;
    }

}
