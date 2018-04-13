/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MavenDocumentacion;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/**
 *
 * @author ggarciaalvarez
 */
public class Metodos {
   
    //Metodo para sacar la ciudad, el pais, y el titulo de la pagina
   
    public static void Titulo(){
        
        try{
            
            Document doc = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
            String title = doc.title();
            System.out.println("Datos extraidos de "+title);
            
        }catch(IOException ex){
            System.out.println("Error al sacar el titulo:");
        }
    }
    
    //Metodo para sacar el tiempo que hay actualmente y la temperatura
    
    public static void Tiempo(){
        
        try{
            
            Document doc=Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").get();
            String tiempo=doc.select(".today_nowcard-phrase").text();
            String grados=doc.select(".today_nowcard-temp").text();
            System.out.println("Hoy esta "+tiempo+" y hace "+grados);
            
        }catch(IOException ex){
            System.out.println("Error al sacar el tiempo:");
        }

}
}