class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}

class Altimeter {
    @Override
    public String toString() {
        return "Measure height";
    } 
}
class AirGauge {
    @Override
    public String toString() {
        return "Measure air pressure";
        } 
    }
class ControlPanel {
    private Altimeter altimeter = new Altimeter();
    private AirGauge airGauge = new AirGauge();
    
    public Altimeter getAltimeter(){
        return altimeter ;
    }
    public Altimeter setAltimetr(Altimeter altimeter){
        return altimeter;
    }
    public AirGauge getAirGauge(){
        return airGauge ;
    }
    public AirGauge airGauge(AirGauge airGauge){
        return airGauge;
    }

    public void control(){
        System.out.println(altimeter);
        System.out.println(airGauge);
     }

}
