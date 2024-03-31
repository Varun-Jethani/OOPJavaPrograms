package unit_1;
import java.util.Objects;
public class EV {
    private String name;
    private int range;
    private int battery_size;
    public EV() {
        this.name = "Ather 450S";
        this.range=90;
        this.battery_size = 3;
    }
    public EV(String name, int range, int battery_size) {
        this.name = name;
        this.range = range;
        this.battery_size = battery_size;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRange() {
        return range;
    }
    public void setRange(int range) {
        this.range = range;
    }
    public int getBattery_size() {
        return battery_size;
    }
    public void setBattery_size(int battery_size) {
        this.battery_size = battery_size;
    }

    @Override
    public String toString() {
        return "EV{" +
                "name=" + name +
                ", range=" + range +
                ", battery_size=" + battery_size +
                '}';
    }
    public boolean equals(EV ev) {
        if (this == ev) return true;
        return this.name.equals(ev.name);
    }
    public int compareTo(EV ev){
        if (this.battery_size < ev.battery_size && this.range>= ev.range){
            return 1;
        }
        else if (this.battery_size > ev.battery_size && this.range<= ev.range){
            return -1;
        }
        else
            return 0;
    }
    public void calculateEfficiency(){
        double eff = (double)range/battery_size;
        System.out.println("Efficiency is "+eff);
    }
    @Override
    public void finalize() throws Throwable{
        System.out.println("EV Object "+this.toString()+" Garbage Collected");
    }

    public static void main(String[] args) {
        EV nexon = new EV("Tata Nexon",300,45);
        EV ev6 = new EV();
        ev6.setName("MG EV6");
        ev6.setRange(300);
        ev6.setBattery_size(50);
        System.out.println(ev6.getName()+" is Equal to "+nexon.getName()+" is "+ev6.equals(nexon));
        System.out.println(ev6.getName()+" compared to "+nexon.getName()+" is "+ev6.compareTo(nexon));
        ev6=null;
        System.gc();
        System.out.println(nexon);
        System.out.println("The Car "+nexon.getName()+
                "with Range: "+nexon.getRange()+
                "and Battery Size: "+nexon.getBattery_size());
        nexon.calculateEfficiency();

    }
}
