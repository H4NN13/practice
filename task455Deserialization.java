import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class task455Deserialization {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonFromServer = "{\"id\": 2, \"name\": \"faye\", \"email\": {\"email\": \"faye@reqres.in\"}}";
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        User faye = mapper.readValue(jsonFromServer, User.class);
            if (faye.getId() == 2){
                System.out.println("welcome");
            } else {
                System.out.println("error");
            }
            if ("faye".equals(faye.getName())){
                System.out.println("welcome, Faye");
            } else {
                System.out.println("error");
            }

    }
    public static class User{
        @JsonProperty
        private String name;

        @JsonProperty
        private EmailContainer email;

        @JsonProperty
        private int id;
        public User(){}

        public String getName() {
            return name;
        }

        public EmailContainer getEmail() {
            return email;
        }

        public int getId() {
            return id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setEmail(EmailContainer email) {
            this.email = email;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
    public static class EmailContainer{
        private String email;
        public EmailContainer(){}
        public String getEmail(){
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
    }
}


