import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class TestRailConnector {
    private static final String TESTRAIL_USERNAME = "your_username";
    private static final String TESTRAIL_PASSWORD = "your_password";
    private static final String TESTRAIL_URL = "https://your_testrail_instance.testrail.io";

    public static void main(String[] args) {
        getTestCase("your_test_case_id");
    }

    public static void getTestCase(String testCaseId) {
        try {
            HttpResponse<String> response = Unirest.get(TESTRAIL_URL + "/index.php?/api/v2/get_case/" + testCaseId)
                    .basicAuth(TESTRAIL_USERNAME, TESTRAIL_PASSWORD)
                    .asString();

            System.out.println(response.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }

    public static void addResultForTest(String testId, int statusId, String comment) {
        try {
            HttpResponse<String> response = Unirest.post(TESTRAIL_URL + "/index.php?/api/v2/add_result/" + testId)
                    .basicAuth(TESTRAIL_USERNAME, TESTRAIL_PASSWORD)
                    .header("Content-Type", "application/json")
                    .body("{\"status_id\":" + statusId + ", \"comment\":\"" + comment + "\"}")
                    .asString();

            System.out.println(response.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}