package com.mycompany.app.dp.creationalPattern.builderPattern.realWorldExample;


/*Real world example of builder pattern
Let's see the step by step real world example of Builder Design Pattern.

Step 1:Create an interface Item that represents the Pizza and Cold-drink.

File: Item.java*/
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader; 
import java.util.ArrayList;  
import java.util.List; 
interface  Item {  
   public String name();  
    public String size();  
    public float price();  
}// End of the interface Item.  
/*Step 2:Create an abstract class Pizza that will implement to the interface Item.

File: Pizza.java*/
 abstract class Pizza implements Item{  
        @Override  
        public abstract float price();  
}   
/*Step 3:Create an abstract class ColdDrink that will implement to the interface Item.

File: ColdDrink.java*/
 abstract class ColdDrink implements Item{  
 @Override  
 public abstract float price();}  
/*Step 4:Create an abstract class VegPizza that will extend to the abstract class Pizza.

File: VegPizza.java*/
 abstract class VegPizza extends Pizza{  
    @Override  
    public abstract float price();  
    @Override  
    public abstract  String name();  
    @Override  
    public abstract  String size();  
}// End of the abstract class VegPizza.  
/*Step 5:Create an abstract class NonVegPizza that will extend to the abstract class Pizza.

File: NonVegPizza.java*/
    abstract class NonVegPizza extends Pizza{  
    @Override  
    public abstract float price();  
    @Override  
    public abstract String name();  
    @Override  
    public abstract String size();  
}// End of the abstract class NonVegPizza.  
/*Step 6:Now, create concrete sub-classes SmallCheezePizza, MediumCheezePizza, LargeCheezePizza, ExtraLargeCheezePizza that will extend to the abstract class VegPizza.

File: SmallCheezePizza.java*/
    class SmallCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 170.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
       return "Small size";  
    }    
}// End of the SmallCheezePizza class.  
//File: MediumCheezePizza.java
 class MediumCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
       return  220.f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
     return "Medium Size";  
 }  
}// End of the MediumCheezePizza class.  
/*</textaera></div>  
  
<div id="filename">File: LargeCheezePizza.java</div>  
<div class="codeblock"><textarea  name="code" class="java">  */
 class LargeCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 260.0f;  
    }  
    @Override  
    public String name() {  
        return "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
}// End of the LargeCheezePizza class.  
//File: ExtraLargeCheezePizza.java
 class ExtraLargeCheezePizza extends VegPizza{  
    @Override  
    public float price() {  
        return 300.f;  
    }  
    @Override  
    public String name() {  
        return  "Cheeze Pizza";  
    }  
    @Override  
    public String size() {  
        return "Extra-Large Size";  
    }  
}// End of the ExtraLargeCheezePizza class.  
//Step 7:Now, similarly create concrete sub-classes SmallOnionPizza, MediumOnionPizza, LargeOnionPizza, ExtraLargeOnionPizza that will extend to the abstract class VegPizza.

//File: SmallOnionPizza.java
 class SmallOnionPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 120.0f;  
    }  
    @Override  
    public String name() {  
        return  "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Small Size";  
    }    
}// End of the SmallOnionPizza class.  
//File: MediumOnionPizza.java
 class MediumOnionPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 150.0f;  
    }  
   @Override  
    public String name() {  
        return  "Onion Pizza";  
    }  
   @Override  
    public String size() {  
       return  "Medium Size";  
    }    
}// End of the MediumOnionPizza class.  
//File: LargeOnionPizza.java
 class LargeOnionPizza extends  VegPizza{  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
    @Override  
    public String name() {  
         return "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Large size";  
    }  
}// End of the LargeOnionPizza class.  
//File: ExtraLargeOnionPizza.java
 class ExtraLargeOnionPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 200.0f;  
    }  
    @Override  
    public String name() {  
         return  "Onion Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Extra-Large Size";  
    }  
}// End of the ExtraLargeOnionPizza class  
//Step 8:Now, similarly create concrete sub-classes SmallMasalaPizza, MediumMasalaPizza, LargeMasalaPizza, ExtraLargeMasalaPizza that will extend to the abstract class VegPizza.

//File: SmallMasalaPizza.java
 class SmallMasalaPizza extends VegPizza{  
    @Override  
    public float price() {  
        return 100.0f;  
    }  
    @Override  
    public String name() {  
        return  "Masala Pizza";  
    }  
    @Override  
    public String size() {  
       return  "Samll Size";  
    }  
}// End of the SmallMasalaPizza class  
//File: MediumMasalaPizza.java
 class MediumMasalaPizza extends VegPizza {  
      
    @Override  
    public float price() {  
        return 120.0f;  
    }  
  
    @Override  
    public String name() {  
      
        return  "Masala Pizza";  
      
    }  
  
    @Override  
    public String size() {  
       return  "Medium Size";  
    }  
}
//File: LargeMasalaPizza.java
 class LargeMasalaPizza extends  VegPizza{  
    @Override  
    public float price() {  
        return 150.0f;  
    }  
  
    @Override  
    public String name() {  
      
        return  "Masala Pizza";  
      
    }  
  
    @Override  
    public String size() {  
       return  "Large Size";  
    }  
} //End of the LargeMasalaPizza class  
//File: ExtraLargeMasalaPizza.java
 class ExtraLargeMasalaPizza extends VegPizza {  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
  
    @Override  
    public String name() {  
      
        return  "Masala Pizza";  
      
    }  
  
    @Override  
    public String size() {  
       return  "Extra-Large Size";  
    }  
}// End of the ExtraLargeMasalaPizza class   
//Step 9:Now, create concrete sub-classes SmallNonVegPizza, MediumNonVegPizza, LargeNonVegPizza, ExtraLargeNonVegPizza that will extend to the abstract class NonVegPizza.

//File: SmallNonVegPizza.java
 class SmallNonVegPizza extends NonVegPizza {  
  
    @Override  
    public float price() {  
        return 180.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Samll Size";  
    }  
      
}// End of the SmallNonVegPizza class  
//File: MediumNonVegPizza.java
 class MediumNonVegPizza extends NonVegPizza{  
      
    @Override  
    public float price() {  
        return 200.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Medium Size";  
    }  
}
//File: LargeNonVegPizza.java
 class LargeNonVegPizza extends NonVegPizza{  
      
    @Override  
    public float price() {  
        return 220.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
      
}// End of the LargeNonVegPizza class  
//File: ExtraLargeNonVegPizza.java
 class ExtraLargeNonVegPizza extends NonVegPizza {  
    @Override  
    public float price() {  
        return 250.0f;  
    }  
  
    @Override  
    public String name() {  
       return "Non-Veg Pizza";  
    }  
  
    @Override  
    public String size() {  
        return "Extra-Large Size";  
    }  
      
}  
  
 // End of the ExtraLargeNonVegPizza class  
//Step 10:Now, create two abstract classes Pepsi and Coke that will extend abstract class ColdDrink.

//File: Pepsi.java
 abstract class Pepsi extends ColdDrink {  
  
    @Override  
    public abstract  String name();  
  
    @Override  
    public abstract  String size();  
      
    @Override  
    public abstract  float price();   
      
}// End of the Pepsi class  
//File: Coke.java
 abstract class Coke  extends ColdDrink {  
  
    @Override  
    public abstract  String name();  
  
    @Override  
    public abstract  String size();  
      
    @Override  
    public abstract  float price();   
      
}// End of the Coke class  
  
//</textaea></div>  
  
/*<p>Step 11:<b>Now, create concrete sub-classes SmallPepsi, MediumPepsi, LargePepsi that will extend to the abstract class Pepsi.</b></p>  
<div id="filename">File: SmallPepsi.java</div>  
<div class="codeblock"><textarea  name="code" class="java">  */
 class SmallPepsi  extends Pepsi{  
  
    @Override  
    public String name() {  
       return "300 ml Pepsi";  
    }  
  
    @Override  
    public float price() {  
        return 25.0f;  
    }  
  
    @Override  
    public String size() {  
        return "Small Size";  
    }     
}// End of the SmallPepsi class  
//File: MediumPepsi.java
 class MediumPepsi extends Pepsi {  
      
    @Override  
    public String name() {  
       return "500 ml Pepsi";  
    }  
  
    @Override  
    public String size() {  
        return "Medium Size";  
    }  
  
    @Override  
    public float price() {  
        return 35.0f;  
    }      
}// End of the MediumPepsi class  
//File: LargePepsi.java
 class LargePepsi extends Pepsi{  
    @Override  
    public String name() {  
       return "750 ml Pepsi";  
    }  
  
    @Override  
    public String size() {  
        return "Large Size";  
    }  
  
    @Override  
    public float price() {  
        return 50.0f;  
    }  
}// End of the LargePepsi class  
//Step 12:Now, create concrete sub-classes SmallCoke, MediumCoke, LargeCoke that will extend to the abstract class Coke.

//File: SmallCoke.java
 class SmallCoke extends Coke{  
     
    @Override  
    public String name() {  
         return "300 ml Coke";    
    }  
  
    @Override  
    public String size() {  
         
        return "Small Size";  
    }  
  
    @Override  
    public float price() {  
      
        return  25.0f;  
    }  
 }// End of the SmallCoke class  
//File: MediumCoke.java
 class MediumCoke extends Coke{  
      
    @Override  
    public String name() {  
         return "500 ml Coke";    
    }  
  
    @Override  
    public String size() {  
         
        return "Medium Size";  
    }  
  
    @Override  
    public float price() {  
      
        return  35.0f;  
   }  
}// End of the MediumCoke class  
//File: LargeCoke.java
 class LargeCoke extends Coke {  
     @Override  
    public String name() {  
         return "750 ml Coke";    
    }  
  
    @Override  
    public String size() {  
         
        return "Large Size";  
    }  
  
    @Override  
    public float price() {  
      
        return  50.0f;  
    }      
}// End of the LargeCoke class  
  
/*</textrea></div>  
  
<p>Step 13:<b>Create an OrderedItems class that are having Item objects defined above.</b></p>  
<div id="filename">File: OrderedItems.java</div>  
<div class="codeblock"><textarea  name="code" class="java">  */
 
 class OrderedItems {  
     
    List<Item> items=new ArrayList<Item>();  
      
    public void addItems(Item item){  
          
        items.add(item);  
    }  
    public float getCost(){  
          
        float cost=0.0f;  
            for (Item item : items) {  
                cost+=item.price();  
             }  
        return cost;  
    }  
    public void showItems(){  
          
        for (Item item : items) {  
            System.out.println("Item is:" +item.name());  
            System.out.println("Size is:" +item.size());  
            System.out.println("Price is: " +item.price());  
              
        }  
    }  
     
}// End of the OrderedItems class  
//Step 14:Create an OrderBuilder class that will be responsible to create the objects of OrderedItems class.



 class OrderBuilder {
    
    public OrderedItems preparePizza() throws IOException{
        
        OrderedItems itemsOrder=new OrderedItems();
         
         
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        
         
        System.out.println(" Enter the choice of Pizza ");
        System.out.println("============================");
        System.out.println("        1. Veg-Pizza       ");
        System.out.println("        2. Non-Veg Pizza   ");
        System.out.println("        3. Exit            ");
        System.out.println("============================");
        
        int pizzaandcolddrinkchoice=Integer.parseInt(br.readLine());
        switch(pizzaandcolddrinkchoice)
        {
            
            case 1:{
                     
                     System.out.println("You ordered Veg Pizza");
                     System.out.println("\n\n");
                     
                     System.out.println(" Enter the types of Veg-Pizza ");
                     System.out.println("------------------------------");
                     System.out.println("        1.Cheeze Pizza        ");
                     System.out.println("        2.Onion Pizza        ");
                     System.out.println("        3.Masala Pizza        ");
                     System.out.println("        4.Exit            ");
                     System.out.println("------------------------------");
                 
                     int vegpizzachoice=Integer.parseInt(br.readLine());
                     
                     switch(vegpizzachoice)
                     {
                         
                         case 1:
                                {
                                    System.out.println("You ordered Cheeze Pizza");
                                    
                                    System.out.println("Enter the cheeze pizza size");
                                    System.out.println("------------------------------------");
                                    System.out.println("    1. Small Cheeze Pizza ");
                                    System.out.println("    2. Medium Cheeze Pizza ");
                                    System.out.println("    3. Large Cheeze Pizza ");
                                    System.out.println("    4. Extra-Large Cheeze Pizza ");
                                    System.out.println("------------------------------------");
                                    int cheezepizzasize=Integer.parseInt(br.readLine());
                                    switch(cheezepizzasize)
                                              {
                                                  case 1:
                                                   itemsOrder.addItems(new SmallCheezePizza());
                                                   break;
                                                    
                                                  case 2:
                                                   itemsOrder.addItems(new MediumCheezePizza());
                                                   break;  
                                                   
                                                  case 3:
                                                   itemsOrder.addItems(new LargeCheezePizza());
                                                   break;  
                                                      
                                                  case 4:
                                                   itemsOrder.addItems(new ExtraLargeCheezePizza());
                                                   break;      
                                                      
                                               }
                                    
                                }  
                                break;
                         case 2:
                                {
                                  
                                    System.out.println("You ordered Onion Pizza");
                                    
                                    System.out.println("Enter the Onion pizza size");
                                    System.out.println("----------------------------------");
                                    System.out.println("    1. Small Onion Pizza ");
                                    System.out.println("    2. Medium Onion Pizza ");
                                    System.out.println("    3. Large Onion Pizza ");
                                    System.out.println("    4. Extra-Large Onion Pizza ");
                                    System.out.println("----------------------------------");
                                    int onionpizzasize=Integer.parseInt(br.readLine());
                                    switch(onionpizzasize)
                                              {
                                                  case 1:
                                                   itemsOrder.addItems(new SmallOnionPizza());
                                                   break;
                                                    
                                                  case 2:
                                                   itemsOrder.addItems(new MediumOnionPizza());
                                                   break;  
                                                   
                                                  case 3:
                                                   itemsOrder.addItems(new LargeOnionPizza());
                                                   break;  
                                                      
                                                  case 4:
                                                   itemsOrder.addItems(new ExtraLargeOnionPizza());
                                                   break;      
                                                      
                                              }     
                                 
                                }
                                break;
                         
                             
                          case 3:
                                {
                                    
                                  System.out.println("You ordered Masala Pizza");
                                    
                                    System.out.println("Enter the Masala pizza size");
                                    System.out.println("------------------------------------");
                                    System.out.println("    1. Small Masala Pizza ");
                                    System.out.println("    2. Medium Masala Pizza ");
                                    System.out.println("    3. Large Masala Pizza ");
                                    System.out.println("    4. Extra-Large Masala Pizza ");
                                    System.out.println("------------------------------------");
                                    
                                    int masalapizzasize=Integer.parseInt(br.readLine());
                                        switch(masalapizzasize)
                                              {
                                                  case 1:
                                                   itemsOrder.addItems(new SmallMasalaPizza());
                                                   break;
                                                    
                                                  case 2:
                                                   itemsOrder.addItems(new MediumMasalaPizza());
                                                   break;  
                                                   
                                                  case 3:
                                                   itemsOrder.addItems(new LargeMasalaPizza());
                                                   break;  
                                                      
                                                  case 4:
                                                   itemsOrder.addItems(new ExtraLargeMasalaPizza());
                                                   break;      
                                                      
                                              }     
                                 
                                }
                                break;    
                         
                     }    
                
                   }
                   break;// Veg- pizza choice completed.
                
                
                
            case 2:
                   {
                       System.out.println("You ordered Non-Veg Pizza");
                       System.out.println("\n\n");
                       
                                    System.out.println("Enter the Non-Veg pizza size");
                                    System.out.println("------------------------------------");
                                    System.out.println("    1. Small Non-Veg  Pizza ");
                                    System.out.println("    2. Medium Non-Veg  Pizza ");
                                    System.out.println("    3. Large Non-Veg  Pizza ");
                                    System.out.println("    4. Extra-Large Non-Veg  Pizza ");
                                    System.out.println("------------------------------------");
                                    
                       
                       int nonvegpizzasize=Integer.parseInt(br.readLine()); 
                      
                        switch(nonvegpizzasize)
                             {
                               
                                  case 1:
                                      itemsOrder.addItems(new SmallNonVegPizza());
                                      break;
                                                    
                                  case 2:
                                      itemsOrder.addItems(new MediumNonVegPizza());
                                      break;  
                                                   
                                  case 3:
                                      itemsOrder.addItems(new LargeNonVegPizza());
                                      break;  
                                                      
                                  case 4:
                                      itemsOrder.addItems(new ExtraLargeNonVegPizza());
                                      break;      
                                                      
                              }
                                    
                       }  
                        break;
            default:
            {
                  break;
                
            }
                
                
      }//end of main Switch
        
        
        System.out.println(" Enter the choice of ColdDrink ");
        System.out.println("============================");
        System.out.println("        1. Pepsi            ");
        System.out.println("        2. Coke             ");
        System.out.println("        3. Exit             ");
        System.out.println("============================");  
        
        int coldDrink=Integer.parseInt(br.readLine());
        
        
        switch (coldDrink) 
            {
               case 1:
                                {
                                    System.out.println("You ordered Pepsi ");
                                    
                                    System.out.println("Enter the  Pepsi Size ");
                                    System.out.println("------------------------");
                                    System.out.println("    1. Small Pepsi ");
                                    System.out.println("    2. Medium Pepsi ");
                                    System.out.println("    3. Large Pepsi ");
                                    System.out.println("------------------------");
                                    
                                    
                                    int pepsisize=Integer.parseInt(br.readLine());
                                    switch(pepsisize)
                                              {
                                                  case 1:
                                                   itemsOrder.addItems(new SmallPepsi());
                                                   break;
                                                    
                                                  case 2:
                                                   itemsOrder.addItems(new MediumPepsi());
                                                   break;  
                                                   
                                                  case 3:
                                                   itemsOrder.addItems(new LargePepsi());
                                                   break;  
                                                      
                                                  
                                               }
                                    
                                }  
                                break;
                         case 2:
                                {
                                  
                                    System.out.println("You ordered Coke");
                                    
                                    System.out.println("Enter the Coke Size");
                                    System.out.println("------------------------");
                                    System.out.println("    1. Small Coke ");
                                    System.out.println("    2. Medium Coke  ");
                                    System.out.println("    3. Large Coke  ");
                                    System.out.println("    4. Extra-Large Coke ");
                                    System.out.println("------------------------");
                                    
                                    int cokesize=Integer.parseInt(br.readLine());
                                    switch(cokesize)
                                              {
                                                  case 1:
                                                   itemsOrder.addItems(new SmallCoke());
                                                   break;
                                                    
                                                  case 2:
                                                   itemsOrder.addItems(new MediumCoke());
                                                   break;  
                                                   
                                                  case 3:
                                                   itemsOrder.addItems(new LargeCoke());
                                                   break;  
                                                      
                                                  
                                              }     
                                 
                                }
                                break;
                             
                           default:
                                      {
                                                   break;
                
                                      }        
                         
                             
                             
                           }//End of the Cold-Drink switch
        
                  return itemsOrder;
    

        } //End of the preparePizza() method 
       
    
 }//End of the OrderBuilder class.     
        
        
        
       
        
        
                
        
       
public class BuilderDemo {  
  
    public static void main(String[] args) throws IOException {  
        // TODO code application logic here  
          
        OrderBuilder builder=new OrderBuilder();  
          
        OrderedItems orderedItems=builder.preparePizza();  
          
        orderedItems.showItems();  
          
        System.out.println("\n");  
        System.out.println("Total Cost : "+ orderedItems.getCost());  
          
    }  
}// End of the BuilderDemo class  
//download this Builder Pattern Example
//Output
//builderDesign Pattern output 1 builder Design Pattern output 1
