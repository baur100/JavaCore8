package homework11;

public class App {
    public static void main(String[] args) {
        Name ninasCompanyName = new Name("Nina");
        Address ninasCompanyAddress = new Address (" 15 Molly St.", "Buffalo Grove","" +
                "IL", 60089);
        Company ninasCompany = new Company(ninasCompanyName, 1999,ninasCompanyAddress, Field.MARKETING);


        Address ninasOwnerAddress = new Address("31 Brandon pl","Green Rd", "CA",
                61290);
        Owner ninaOwner = new Owner( ninasCompanyName,1978,ninasOwnerAddress, Field.OWNER, 20);


        Address petersWorkerAddress = new Address(" 3 Toll Rd", "Palatine", "TX",
                80052);
        Name peterWorkersName = new Name( "Peter");
        Worker peterWorker = new Worker(peterWorkersName, 1989,petersWorkerAddress, Field.SELLING, "Osborn",
                "Sale manager");

        System.out.print(ninasCompany);
        System.out.print(ninaOwner);
        System.out.print(peterWorker);

        System.out.println(ninasCompany.getName().getPersonName());






    }
}
