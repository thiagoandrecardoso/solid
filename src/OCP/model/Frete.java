package OCP.model;

public class Frete {
    public double para(String cidade) {
        if ("SAO PAULO".equalsIgnoreCase(cidade)) {
            return 15;
        } else {
            return 30;
        }
    }
}
