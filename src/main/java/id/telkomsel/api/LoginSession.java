package id.telkomsel.api;

/**
 * Created by luthfi on 07/12/15.
 */
public class LoginSession {
    private String phoneNumber;
    private String token;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
