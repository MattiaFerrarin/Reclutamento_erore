import org.example.EroeNonIdoneo;
import org.example.Reclutatore;
import org.yaml.snakeyaml.util.Tuple;

import static java.lang.IO.println;

void main(){
    int missionLvl = 75;
    Reclutatore reclutator = new Reclutatore();
    for (int i = 0; i < 5; i++) {
        try {
            Tuple<String,Integer> hero = reclutator.GenerateRandomHero();
            if(hero._2() < 75){
                throw new EroeNonIdoneo("Checca", hero._1(), hero._2());
            }else{
                println("Questo non è una checca e ha gasato");
                break;
            }
        } catch (EroeNonIdoneo e) {
            println(e.getMessage() + ": livello="+e.LivelloEroe);
        } finally {
            println(" Passing onto next >");
        }
    }
}