public class Account {
    public String password;
    public String getPassword(){
        setPassword("ABCD");
        return this.password;
    }
    private void setPassword(String pass){
        this.password = pass;
    }
}
