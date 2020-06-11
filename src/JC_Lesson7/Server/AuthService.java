package JC_Lesson7.Server;

public interface AuthService {
    String getNicknameByLoginAndPassword(String login, String password);
    boolean registration(String login, String password, String nickname);
}
