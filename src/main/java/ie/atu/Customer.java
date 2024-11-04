package ie.atu;

import java.util.ArrayList;

public class Customer {
    String name;
    String id;
    String Email;
    String phone;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }


    public void setType(String) {
        this.Email = email;
    }
    public String getType() {
        return phone;
    }
    public void setType(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public StringToString(){
        return"customer{" +
                "name='"+name + '\" +
                '}' ;
    }
    ArrayList<String> tasks = new ArrayList<>();

    tasks.add("CystomerId");
    tasks.add("name of customer");
    tasks.add("email address of customer");
    tasks.add("contact number of the customer");

    System.out.println("task list:");
    for (int i = 0; i< tasks.size(); i++){
        System.out.println((i + 1) + ". " + tasks.get(i));
    }
 }
