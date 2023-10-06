package SOC_ASS5_package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nehal
 */
import javax.jws.WebService;

@WebService(endpointInterface="package1.FindPerson")

public class FindPersonImpl {
    
    public Person getPerson(String name)
    {
        Person p = new Person();
        p.setPname("Nehal");
        p.setCity("Addanki");
        return p;
    }
}
