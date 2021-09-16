package dat3.jpademo.entities;

import dat3.jpademo.entities.Address;
import dat3.jpademo.entities.Fee;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2021-09-04T19:53:36")
@StaticMetamodel(Person.class)
public class Person_ { 

    public static volatile ListAttribute<Person, Fee> fees;
    public static volatile SingularAttribute<Person, Address> address;
    public static volatile SingularAttribute<Person, Integer> year;
    public static volatile SingularAttribute<Person, String> name;
    public static volatile SingularAttribute<Person, Long> p_id;

}