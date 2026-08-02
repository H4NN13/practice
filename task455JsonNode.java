import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
public class task455JsonNode {
    public static void main(String[] args) throws JsonProcessingException {
        String jsonData = "{\"data\": {\"id\": 2, \"email\": \"a@b.com\"}, " +
                        "\"support\": {\"url\": \"https://...\", \"text\": \"To keep...\"}}";

        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(jsonData);
        int id = rootNode.get("data").get("id").asInt();
        String email = rootNode.get("data").get("email").asText();
        String url = rootNode.get("support").get("url").asText();
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("URL: " + url);
    }
}
