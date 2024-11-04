package ie.atu;

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


    public void setType(String email) {
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
 }
