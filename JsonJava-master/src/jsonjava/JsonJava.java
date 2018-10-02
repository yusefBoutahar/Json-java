package jsonjava;

import java.util.Arrays;
import java.util.List;
import com.google.gson.Gson;
import jsonjava.Agenda.PhoneNumbers;

 public class JsonJava {
    public static void main(String[] args) {
        String jsonString = 
                "{ "
                +   "\"firstName\": \"Albert\", "
                 +   "\"lastName\": \"Einstein\", "
                 +   "\"age\": 139, "
                 +   "\"streetAddress\": \"1 EMC2 Drive\", "
                 +   "\"city\": \"Princeton\","
                 +   "\"state\": \"New Jersey\", "
                 +   "\"postalCode\": \"12345\", "
                 +   "\"phoneNumbers\": [ "
                 +   "   { \"mobile\": 666123456},"
                +   "   { \"home\": 928001122 } "
                +   " ] "
                + "}";

        Gson gson = new Gson();
        Agenda agenda = gson.fromJson(jsonString, Agenda.class);
        long age = agenda.getAge();
        System.out.println("La edad es: " + age);
        
        
        PhoneNumbers[] P_num = agenda.getPhoneNumbers();
        for(PhoneNumbers n: P_num) {
        	System.out.println("El numero de telefono es: " + n.getMobile());
        	break;//solo queremnos el numero de tlf
        }
        
        
        /**-----------------------------------toJson----------------------------------------------*/
        
        
        List<Agenda> arrayAgenda = Arrays.asList(
        		new Agenda("Paco" ,"Leon" ,23 ,"calle colon" ,"Las Palmas" ,"Spain" ,"36120",Arrays.asList("111222333","999888777")),
        		new Agenda("Maria" ,"Vega" ,23 ,"calle sorolla" ,"Las Palmas" ,"Spain" ,"36121",Arrays.asList("111222333","999888777"))
        		);
        
        String json = new Gson().toJson(arrayAgenda);
        System.out.println(json);
    }
 }