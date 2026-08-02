import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class task455Serialization {
    public static void main(String[] args) throws JsonProcessingException {
        String result = buildRequestBody("Anna", "QA Engineer");
        System.out.println(result);

    }
    public static String buildRequestBody (String name, String job) throws JsonProcessingException{
        CreateUserRequest request = new CreateUserRequest();
        request.setName(name);
        request.setJob(job);
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(request);

        return json;
    }


    public static class CreateUserRequest {
        private String name;
        private String job;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getJob() {
            return job;
        }
        public void setJob(String job) {
            this.job = job;
        }
        public CreateUserRequest(){}
    }

}
