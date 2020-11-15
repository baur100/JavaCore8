package homework9;

public class Schedule {
    private String meeting;
    private String businessTrip;
    private String activity;
    private String[] name;

    public Schedule(String meeting, String businessTrip, String activity, String[] name) {
        this.meeting = meeting;
        this.businessTrip = businessTrip;
        this.activity = activity;
        this.name = name;
    }

    public Schedule() {

    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String getMeeting() {
        return meeting;
    }

    public void setMeeting(String meeting) {
        this.meeting = meeting;
    }

    public String getBusinessTrip() {
        return businessTrip;
    }

    public void setBusinessTrip(String businessTrip) {
        this.businessTrip = businessTrip;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void printClass() {
        System.out.println(meeting + "," + " " + businessTrip + "," + " " + activity);
    }


}


//Сделать 3 класса - в каждом классе по краней мере 3 fields
//Каждый field имеет setter и getter
//Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
//создайте в каждом классе метод printClass() - для вывода всех полей на экран

//По крайней мере один атрибут в одном классе должен быть array
//Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
//Выведите на экран эти объекты функцией printClass()