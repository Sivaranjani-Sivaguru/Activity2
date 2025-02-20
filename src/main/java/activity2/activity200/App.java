package activity2.activity200;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.model.Item;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	try {
        	EntityManager em=Persistence.createEntityManagerFactory("ItemPU").createEntityManager();
        	Item obj=new Item();
        	em.getTransaction().begin();
        	obj.setItemId("Item 1");
        	obj.setItemName("Laptop");
        	obj.setBatched(true);
        	obj.setDateOfManufacturing("2025-02-12");
        	em.persist(obj);
        	em.getTransaction().commit();
        }
        catch(Exception e) {
        	System.out.println(e);
        	e.printStackTrace();
        }
    }
}
