package Device;

public class Device {
    public int device_id;
    public String device_name;
    public DeviceType device_type;

    public Device(DeviceType device_type){
        this.device_type = device_type;
    }

}

