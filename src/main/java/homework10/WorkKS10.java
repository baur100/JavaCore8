package homework10;


public class WorkKS10 {
    public static void main(String[] args) {
        System.out.println("Hello!");
        Colors[] color = {Colors.BLACK, Colors.GREY, Colors.WHITE};
        String[] CPUmake = {"Techno", "Bacic", "SCore"};
        double CPU1 = 2.7;
        double CPU2 = 3.5;
        String[] CPUmodel = {"Hiend", "Edition", "Start"};
        int[] Cores = {2, 4, 8, 16};
        Cash[] cash = {Cash.BIG, Cash.MEDIUM};
        int[] hddsize = {128, 256, 512};
        String[] hddmake = {"Atlantic", "Digitex", "TechnoS"};
        String[] monitorbrand = {"LGG", "SONYS"};
        int[] monitorsize = {22, 34, 27};
        String[] mbmake = {"CreateR", "SimilarD"};


        Keyboard aa1 = new Keyboard(color, ConnectionTypeMouse.WIRELESS);
        Keyboard aa2 = new Keyboard(ConnectionTypeMouse.WIRELESS_USB, color);
        System.out.println(aa1.toString());
        System.out.println(aa2.toString1());

        Motherboard m1 = new Motherboard(mbmake);
        System.out.println(m1.toString());

        Monitore screen = new Monitore(color, 22, monitorbrand);
        System.out.println(screen.toString());
        Monitore screen1 = new Monitore(color, 34, monitorbrand);
        System.out.println(screen1.toString());

        Mouse moueY = new Mouse("SysM", "EW-SU", ConnectionTypeMouse.WIRED);
        System.out.println(moueY.toString());
        Mouse MMq = new Mouse("OO11", "77", ConnectionTypeMouse.WIRELESS_USB);
        System.out.println(MMq.toString());

        HDD sys = new HDD(hddsize, hddmake);
        System.out.println(sys.toString());

        CPU micpu=new CPU(CPUmake,CPU1,CPUmodel,8,cash);
        System.out.println(micpu.toString());
        CPU mycpu1=new CPU(CPUmake,CPU2,CPUmodel,16,cash);
        System.out.println(mycpu1.toString());

        SystemBlock gamer=new SystemBlock(sys,micpu,m1);
        System.out.println(gamer.toString());
        SystemBlock ngame=new SystemBlock(sys,mycpu1,m1);
        System.out.println(ngame.toString());

        Computer middle=new Computer(aa1,MMq,screen,gamer);
        System.out.println(middle.toString());
        Computer bnr=new Computer(aa2,moueY,screen1,ngame);
        System.out.println(bnr.toString());
    }
}
