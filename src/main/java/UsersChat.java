import javax.persistence.*;

    @Entity
    @Table(name = "Chats")
    public class UsersChat {
        public UsersChat(){}
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "Messages")
        private String Message;

//        //@ManyToOne
//        private SaveUsers user;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getMessage() {
            return Message;
        }

        public void setMessage(String message) {
            Message = message;
        }

//        public SaveUsers getUser() {
//            return user;
//        }
//
//        public void setUser(SaveUsers user) {
//            this.user = user;
//        }





    }
