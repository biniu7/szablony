package pl.biniu.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-04-23T15:55:25")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Boolean> enabled;
    public static volatile SingularAttribute<User, String> name;
    public static volatile SingularAttribute<User, Short> attempts;
    public static volatile SingularAttribute<User, Integer> userId;
    public static volatile SingularAttribute<User, String> surname;
    public static volatile SingularAttribute<User, String> role;
    public static volatile SingularAttribute<User, String> login;
    public static volatile SingularAttribute<User, String> local;
    public static volatile SingularAttribute<User, String> password;

}