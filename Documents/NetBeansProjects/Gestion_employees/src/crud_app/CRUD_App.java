
package crud_app;


import com.Login.LoginFrame;
import com.databaseCon.DB;


public class CRUD_App {

    
    public static void main(String[] args) {
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
        DB.loadConnection();
    }
    
}
