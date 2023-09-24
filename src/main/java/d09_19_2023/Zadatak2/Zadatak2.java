package d09_19_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
Planina montBlan= new Planina("alpi", "francuska", 4500);

Planina kopaonik= new Planina("kop", "srbija", 1500);

RekreativniPlaninar rekreativni1= new RekreativniPlaninar(10, "pera preric", 5, "zlatiborski", 1600);
        RekreativniPlaninar rekreativni2= new RekreativniPlaninar(11, "joko preric", 10, "uzicki", 1800);
        RekreativniPlaninar rekreativni3= new RekreativniPlaninar(12, "pera rakic", 15, "niski", 2000);

        Alpinista alpinista1= new Alpinista(13, "brus li");
        Alpinista alpinista2= new Alpinista(34, "brus vilis");


        PlaninarskiDom dom = new PlaninarskiDom();
        dom.uclaniPlaninara(rekreativni1);
        dom.uclaniPlaninara(alpinista2);
        dom.uclaniPlaninara(rekreativni2);

        dom.uspesnanUspon(montBlan);
        dom.izbaciPlaninara(alpinista2);

        alpinista2.stampaj();

        dom.mesecniPrihod();
    }
}
