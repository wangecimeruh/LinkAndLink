import javax.persistence.*;

@Entity
@Table(name = "users")
public class SaveUsers {
    public SaveUsers(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Name")
    private String Name;

    @Column(name = "PhoneNumber" , columnDefinition = "Int")
    private int PhoneNumber;

    @Column(name = "Age", columnDefinition = "Int")
    private int Age;

    @Column(name = "Email" )
    private String Email;

    @Column(name = "Location" )
    private String Location;

    @Column(name = "password" )
    private String password;

    @Enumerated(EnumType.STRING)
   private Gender Gender;

    @Enumerated(EnumType.STRING)
    private Sexuality Sexuality;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }


    public Gender getGender() {
        return Gender;
    }
    public void setGender(Gender gender) {
        Gender = gender;
    }
    public Sexuality getSexuality() {
        return Sexuality;
    }

    public void setSexuality(Sexuality sexuality) {
        Sexuality = sexuality;
    }
    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }






}



