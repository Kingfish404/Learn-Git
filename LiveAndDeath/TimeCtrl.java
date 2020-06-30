package LiveAndDeath;
public class TimeCtrl {
    UI ui = new UI();
    Map map;
    Logic logic = new Logic();
    TimeCtrl(){
        map = new Map(0.5);
    }
    TimeCtrl(double probability){
        map = new Map(probability);
    }
    public void run() {
        ui.init(map);
        try {
            while(true){
                ui.show(map);
                logic.update(map);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("运行结束");
        }
    }
}