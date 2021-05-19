package week4.day2.person;

/*
Write a Person.java class which `
has private fields firstName, lastName, passportId, age, sex(String), nationality.
add all argument constructor, and no argument constructor.
add public  getters and setters.
has a display() method which will give all information about the person. Example`  firstName is Armen
                                              lastName is Meliqyan            etc…
 */
/*
Add in Person class validations with getters and setters with following options
firstName must be in range 3 to 15
lastName must be in range 6 to 20
age must be in range 18 - 99
sex must be male or female(compareToIgnoreCase())
passportId must start with “AN” and contain 6 digits with length 8
 */
public class Person {
    private String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String gender;
    private String nationality;

    public Person() {

    }

    public void display(Person person) {
        System.out.println("firstName is " + person.firstName + " lastName is " + person.lastName + " passport Id " + person.passportId
                + " age " + person.age + " gender " + person.gender + " nationality " + nationality);
    }

    public String getFirstName() {
       return firstName;
    }

        public void setFirstName (String firstName){
            if (firstName.length() >= 3 && firstName.length() <= 15) {
                this.firstName=firstName;
            }else {
                System.out.println("Not valid name");
            }
        }

        public String getLastName () {
           return lastName;
        }

        public void setLastName (String lastName) {
            if (lastName.length() >= 6 && lastName.length() <= 20) {
                this.lastName = lastName;
            }else
                System.out.println("Not valid lastname");
        }

        public String getPassportId () {
            return passportId;
        }

        public void setPassportId (String passportId) {
            int count = 0;
            if (passportId.charAt(0) == 'A' && passportId.charAt(1) == 'N' && passportId.length() >= 8) {
                for (int i = 2; i < passportId.length(); i++) {
                    if (passportId.charAt(i) >= '0' && passportId.charAt(i) <= '9') {
                        count++;
                    } else {
                        System.out.println("Not valid passport Id");
                    }
                }

            }
            if (count >= passportId.length() - 3) {
                this.passportId = passportId;
            }
        }

        public int getAge () {
            return age;
        }

        public void setAge ( int age) {
            if (age >= 18 && age <= 99) {
                this.age = age;
            } else {
                System.out.println("Not valid age");
            }
        }

        public String getGender () {
            return gender;
        }

        public void setGender (String gender) {
            if (gender.compareToIgnoreCase("Male") == 0 || gender.compareToIgnoreCase("Female") == 0) {
                this.gender = gender;
            } else {
                System.out.println("Not valid gender");
            }
        }

        public String getNationality () {
            return nationality;
        }

        public void setNationality (String nationality){
            this.nationality = nationality;
        }

    public Person(String firstName, String lastName, String passportId, int age, String gender, String nationality){
            this.firstName = firstName;
            this.lastName = lastName;
            this.passportId = passportId;
            this.age = age;
            this.gender = gender;
            this.nationality = nationality;
        }
    }
