
import com.app.controller.indexController;
import com.app.model.User;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jhon Baron
 */
public class TestUser {

    public static void main(String[] args) {
        indexController ic = new indexController();
        int no = ic.lookingForUserId(new User(0, "Pedro", "1234", 187954));
        System.out.println("aquiiiiiii" + no);
    }
}
