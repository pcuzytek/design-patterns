package builder;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        final String PUDGE_DESCRIPTION = "Każdy dokładnie wymierzony rzut charakterystycznego haka Pudge'a zasiewa " +
                "strach w sercach wrogów. Przyciągając swych przeciwników, by krajać ich swoimi nożami, dostaje " +
                "dodatkowe zdrowie i obrażenia za każde zabójstwo, co pozwala mu szybko zostać niepowstrzymanym mordercą";

        final String PUDGE_BIOGRAPHY = "Na Polach Bezkresnej Rzezi, daleko na południe od Quoidge, całymi nocami " +
                "niestrudzenie pracuje korpulentna postać - rozczłonkowuje, patroszy, segreguje kończyny i wnętrzności " +
                "upadłych tak, aby pole walki jeszcze przed świtem było oczyszczone. W tej przeklętej krainie nic nie " +
                "ulega zepsuciu i nie rozkłada się - żaden z trupów nie może powrócić do ziemi, z której powsta, nieważne " +
                "jak głęboki byłby grób. Zawsze otoczony padlinożernymi ptakami, które potrzebują go, żeby pociął mięso " +
                "na kawałki mieszczące się do ich dziobów, Pudge zwany Rzeźnikiem doskonali swoje umiejętności narzędziami, " +
                "które są tym ostrzejsze, im dłużej ich używa. Szast, prast, stuk. Mięso odpada od kości, ścięgna i więzadła " +
                "odchodzą jak mokry papier. Pomimo, że Pudge zawsze miał upodobanie do rzeźniczego fachu, to przez " +
                "wszystkie lata wyrobił sobie również smak do jego produktów ubocznych. Zaczęło się od kęsa mięśni tu, " +
                "łyka krwi tam... Zanim się obejrzał, wbijał zęby w najtwardsze torsy niczym pies obgryzający kości. " +
                "Nawet Ci, którzy nie mają już strachu przed Żniwiarzem, wciąż boją się Rzeźnika.";

        Map<Role, Integer> pudgeRoles = new HashMap<>(4);
        pudgeRoles.put(Role.Nuker, 1);
        pudgeRoles.put(Role.Disabler, 2);
        pudgeRoles.put(Role.Durable, 2);
        pudgeRoles.put(Role.Initiator, 2);


        Character character = new Character.Builder()
                .name("Pudge")
                .health(762)
                .healthRegen(3.1)
                .mana(243)
                .manaRegen(0.7)
                .attributeType(AttributeType.Strength)
                .description(PUDGE_DESCRIPTION)
                .biography(PUDGE_BIOGRAPHY)
                .attackType(AttackType.Mele)
                .attackSpeed(1.7)
                .damageRange(new DamageRange(59, 65))
                .attackRange(150)
                .physicalArmour(0.2)
                .magicArmour(0.25)
                .speed(280)
                .rotationSpeed(0.7)
                .sightRange(new SightRange(1800, 800))
                .roles(pudgeRoles)
                .build();

        System.out.println(character);
    }
}
