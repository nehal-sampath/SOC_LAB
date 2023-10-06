/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOC_ASS5_package.test;

/**
 *
 * @author nehal
 */
import package1.client.FindPerson;
import package1.client.FindPersonService;

public class PersonTest {
    
    public static void main(String[] args){
        FindPersonService fpService = new FindPersonService();
        FindPerson findPerson = fpService.getFindPersonPort();
        Person p = findPerson.getPerson("Nehal");
        System.out.println(p.getCity());
        System.out.println(p.getPname());
    }
}
