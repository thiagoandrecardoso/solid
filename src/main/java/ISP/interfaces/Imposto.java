package ISP.interfaces;

import ISP.model.NotaFiscal;

/*
A solução para o problema é análoga ao que tomamos quando discutimos
classes coesas. Se uma classe não é coesa, dividimo-la em duas ou mais classes;
seuma interface não é coesa, também a dividimos em duas ou mais interfaces

Foi dividida nas interfaces ICalculadorDeImposto e IGeradorDeNotas
 */
public interface Imposto {
    NotaFiscal geraNota();
    double imposto(double valorCheio);
}
