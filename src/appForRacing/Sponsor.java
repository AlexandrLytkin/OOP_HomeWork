package appForRacing;

public class Sponsor <S extends Transport> extends Mechanic{

    private String company;
    private int sponsorMoney;

    public Sponsor() {

    }

    public Sponsor(String company,int sponsorMoney) {
        super();
        this.company = company;
        this.sponsorMoney = sponsorMoney;
    }

    public void sponsor(S transport) {
        System.out.println("спонсор "+ getCompany()+
                ", транспорт "+ transport.getBrand()+" "+transport.getModel()+
                ", сумма спонсирования "+ getSponsorMoney());
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "company='" + company + '\'' +
                ", sponsorMoney=" + sponsorMoney +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSponsorMoney() {
        return sponsorMoney;
    }

    public void setSponsorMoney(int sponsorMoney) {
        this.sponsorMoney = sponsorMoney;
    }
}
