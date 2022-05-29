package entities;

public class VipTicket extends Ticket{

    private double vipTicket;

    public VipTicket(double price, double vipTicket) {
        super(price);
        this.vipTicket = vipTicket;
    }

    public double calcVipTicket(){
        return (getPrice() * vipTicket / 100) + getPrice();
    }

    public double calcDifference(){
        return  calcVipTicket() - getPrice();

    }
}
