package week9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class ItemManager {

  private List<Item> items;

  public ItemManager(){

    try {
      FileInputStream file = new FileInputStream("items.ser");
      ObjectInputStream in = new ObjectInputStream(file);

      items =  (ArrayList<Item>) in.readObject();

      in.close();
      file.close();

    } catch (FileNotFoundException e) {
      items = new ArrayList<>();
    } catch (IOException e) {
      items = new ArrayList<>();
    } catch (ClassNotFoundException e) {
      items = new ArrayList<>();
    }



  }


  public void addItem(Item i){
    items.add(i);

    // Serialization
    try {
      FileOutputStream file = new FileOutputStream("items.ser");
      ObjectOutputStream out = new ObjectOutputStream(file);
      out.writeObject(items);
      System.out.println("Items saved");

      file.close();
      out.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  public void printItems(){
    for(Item i:items){
      System.out.println(i.getName());
    }
  }

  public static void main(String[] args) {
    ItemManager im = new ItemManager();
    im.printItems();


  }
}
