package kniznica.objects;

public class Person  {
      public static int person_id;
      public static String person_name;
      public static String person_lastName;
      public static int identity_card;

          
            public Person(int person_id, String person_name, String person_lastName, int identity_card) {
                        Person.person_id = person_id;
                        Person.person_name = person_name;
                        Person.person_lastName = person_lastName;
                        Person.identity_card = identity_card;
                  }
            public  Person(String person_name,String person_lastName,int identity_card){
                  Person.person_name = person_name;
                  Person.person_lastName = person_lastName;
                  Person.identity_card = identity_card;
            }


            public void getPerson(){
                  System.out.println(person_id+" "+person_name+" "+person_lastName+" "+identity_card+".");
            }


            ////////////////////////////// GETER AND SETER Person int string ..............><
      /**
       * @return the personid
       */
      public int getPersonid() {
            return person_id;
      }

      /**
       * @param add_id the personid to set
       */
      public void setPersonid(Integer person_id) {
            Person.person_id = person_id;
      }

      /**
       * @return the person_name
       */
      public String getPerson_name() {
            return person_name;
      }

      /**
       * @param person_name the person_name to set
       */
      public void setPerson_name(String person_name) {
            Person.person_name = person_name;
      }

      /**
       * @return the person_lastName
       */
      public String getPerson_lastName() {
            return person_lastName;
      }

      /**
       * @param person_lastName the person_lastName to set
       */
      public void setPerson_lastName(String person_lastName) {
            Person.person_lastName = person_lastName;
      }

      /**
       * @return the identity_card
       */
      public int getidentity_card() {
            return identity_card;
      }

      /**
       * @param identity_card the identity_card to set
       */
      public void setidentity_card(int identity_card) {
            Person.identity_card = identity_card;
      }


}
