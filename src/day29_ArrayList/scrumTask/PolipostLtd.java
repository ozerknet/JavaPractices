package day29_ArrayList.scrumTask;

public class PolipostLtd {
    public static void main(String[] args) {
        String company = "Polipost Ltd";

        ProductOwner po = new ProductOwner("Ozer", 10, 'M', 125, 52000, company);
        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, company);
        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);

        Tester tester1=new Tester("Ozer",38,'M',"Tester",145,145000,company);
        Tester[] testers={tester1};

        Developer developer1=new Developer("Evelyn", 30, 'F', "JS Developer", 788, 160000, company);
        Developer[] developers={developer1};

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println("scrumTeam = " + scrumTeam);

        System.out.println("------------------------------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester);
        }


    }
}
