package nl.remco.techiteasy.models;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Television {

    private final String name;

    //constructor
    public Television(String name) {
        this.name = name;
    }

//        @Id
//    private Long id;

//    public Long getId() {
//        return id;
//    }

    //    @Column
//    private String name;

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
