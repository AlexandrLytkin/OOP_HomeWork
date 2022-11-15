package appForRacing;

public class Mechanic<M extends Transport> {
    private String name;
    private String company;

    public Mechanic() {

    }

    public Mechanic(String name, String company) {
        super();
        this.name = name;
        this.company = company;
    }

    public void maintenance(M transport) {
        System.out.println("механик "+ getName()+
                ", транспорт "+ transport.getBrand()+" "+transport.getModel()+
                ", провожу ТО");
    }

    public boolean fixTransport() {
        return Math.random() < 0.7;
    }


    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
