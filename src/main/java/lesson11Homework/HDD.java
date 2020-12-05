package lesson11Homework;

public class HDD {
    private String HDDName;
    private HDDType HDDType;

    public HDD(String HDDName, HDDType HDDType){
        this.HDDName = HDDName;
        this.HDDType = HDDType;

    }

    public String getHDDName() {
        return HDDName;
    }

    public void setHDDName(String HDDName) {
        this.HDDName = HDDName;
    }

    public lesson11Homework.HDDType getHDDType() {
        return HDDType;
    }

    public void setHDDType(lesson11Homework.HDDType HDDType) {
        this.HDDType = HDDType;
    }
}
