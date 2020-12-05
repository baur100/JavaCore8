package lesson11Homework;

public class Network {
    private String operator;
    private NetworkType networkType;

    public Network(String operator, NetworkType networkType) {
        this.operator = operator;
        this.networkType = networkType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public NetworkType getNetworkType() {
        return networkType;
    }

    public void setNetworkType(NetworkType networkType) {
        this.networkType = networkType;
    }
}
