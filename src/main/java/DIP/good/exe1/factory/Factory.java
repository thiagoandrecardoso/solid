package DIP.good.exe1.factory;

import DIP.good.exe1.model.Cliente;
import DIP.good.exe1.model.Email;
import DIP.good.exe1.model.SMS;

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
