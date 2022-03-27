package DIP.good.factory;

import DIP.good.model.Cliente;
import DIP.good.model.Email;
import DIP.good.model.SMS;

public class Factory {
    public static Cliente getCliente(){
        return new Cliente();
    }

    public static Email getEmail(){
        return new Email();
    }

    public static SMS getMensageiroCelular(){
        return new SMS();
    }
}
