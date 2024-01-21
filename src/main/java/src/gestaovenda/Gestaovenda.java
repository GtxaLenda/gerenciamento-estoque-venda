/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package src.gestaovenda;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author Delta
 */
public class Gestaovenda {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    public class PasswordEncoderTest {
 
    public static void main(String[] args) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("2204");
         
        System.out.println(encodedPassword);
 
    }
 
}
}


