public class Main {
    public static void main(String[] args) {
        Cars lada = new Cars("Лада", "Гранта", 1.6);
        Cars bmw = new Cars("БМВ", "3-я серия", 2.5);
        Cars audi = new Cars("Ауди", "А5", 3.2);
        Cars hyundai = new Cars("Hyundai", "Avante", 1.8);

        Trucks kamaz = new Trucks("Камаз", "5511", 11.95);
        Trucks maz = new Trucks("Маз", "5340", 6.9);
        Trucks man = new Trucks("Man", "TGA-18-410", 11.9);
        Trucks renault = new Trucks("Renault", "Magnum", 12.9);

        Buses nefaz = new Buses("Nefaz", "5299", 6.7);
        Buses busMaz = new Buses("Маз", "103", 6.4);
        Buses paz = new Buses("Паз", "4234", 4.4);
        Buses gazelle = new Buses("Газель", "Next", 2.7);

        hyundai.pitStop();
        kamaz.pitStop();
        nefaz.pitStop();

        DriverCatLicenseB vasily = new DriverCatLicenseB("Василий",
                "Васильевич",
                "Васильев",
                "права категории В",
                "3 года опыта",
                bmw);
        vasily.reFuel();
        vasily.startMove();
        System.out.println(vasily.toString());

        DriverCatLicenseC petr = new DriverCatLicenseC("Петр",
                "Петрович",
                "Петров",
                "права категории С",
                "7 лет опыта",
                kamaz);
        petr.reFuel();
        petr.startMove();
        System.out.println(petr.toString());

        DriverCatLicenseD alex = new DriverCatLicenseD("Алексей",
                "Алексеевич",
                "Алексеев",
                "права категории Д",
                "12 лет опыта",
                nefaz);
        alex.reFuel();
        alex.startMove();
        System.out.println(alex.toString());
        alex.stopMove();
        

    }
}