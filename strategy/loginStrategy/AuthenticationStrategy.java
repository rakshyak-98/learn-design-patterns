package loginStrategy;

public interface AuthenticationStrategy {
   boolean authenticate (String username, String password); 
}

class UsernamePasswordAuthentication implements AuthenticationStrategy{

    @Override
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password".equals(password);
    }

}

class FingerPrintAuthentication implements AuthenticationStrategy{

    @Override
    public boolean authenticate(String username, String password) {
        return true;
    }

}

class TwoFactorAuthentication implements AuthenticationStrategy{

    @Override
    public boolean authenticate(String username, String password) {
        return isValidToken() && isValidBiometric();
    }

    private boolean isValidToken(){
        return true;
    }

    private boolean isValidBiometric(){
        return true;
    }

}

class AuthenticationContext {
    private AuthenticationStrategy authenticationStrategy;

    public void setAuthenticationStrategy(AuthenticationStrategy authenticationStrategy){
        this.authenticationStrategy = authenticationStrategy;
    }

    public boolean authenticateUser(String username, String password){
        if(authenticationStrategy != null){
            return authenticationStrategy.authenticate(username, password);
        }
        return false;
    }
}