package passport;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Set<Passport> passportSet = new HashSet<>();
    static  Map<String,Integer> map = new HashMap<>();

    public static void main(String[] args) {

        //Map<Integer,String> map = new HashMap<>();

        Passport ivan = new Passport(830826488,"Ivan","Ivanov","Ivanovich",1965);
        Passport masha = new Passport(730726477,"Masha","Ivanova","Ivanovna",1995);
        Passport katya = new Passport(630626466,"Katya","Ivanova","Ivanovna",2005);
        addPassport(ivan);
        addPassport(masha);
        addPassport(katya);
        System.out.println("map = " + map);
        map.put("MashaIvanovaIvanovna1995", 123456789);
        System.out.println("map = " + map);
        System.out.println("passportSet = " + passportSet.size());
        System.out.println("map.size() = " + map.size());



    }


    public static void addPassport(Passport passport) {
        for (Passport p : passportSet) {
            if (passport.equals(p)) {
                throw new IllegalArgumentException("такой пасспорт уже есть!");
            }
        }
        if (passport.getNumberPassport() == 0) {
            throw new IllegalArgumentException("нет номера!");
        } else {
            passportSet.add(passport);
            map.put((passport.getName()+passport.getSureName()+passport.getPatronymic()+passport.getDateOfBirthday()), passport.getNumberPassport());
        }
    }
}

