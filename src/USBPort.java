public class USBPort {
    private String portType;
    private Long IDPort;

    public USBPort(String portType, Long IDPort) {
        this.portType = portType;
        this.IDPort = IDPort;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public Long getIDPort() {
        return IDPort;
    }

    public void setIDPort(Long IDPort) {
        this.IDPort = IDPort;
    }
    public String getInfo(){
        return "Port type: " + portType + "\n" +
                "ID port: " + IDPort;

    }
}
