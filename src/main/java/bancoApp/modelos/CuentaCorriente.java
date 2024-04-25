package bancoApp.modelos;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class CuentaCorriente extends Cuenta{
    //The number of transactions a client is allowed to do per day
    private final IntegerProperty transactionLimit;

    public CuentaCorriente(String owner, String accountNumber, double balance, int Limit){
        super(owner, accountNumber, balance);
        this.transactionLimit = new SimpleIntegerProperty(this,"Limite de Transacción", tLimit);
    }

    public IntegerProperty transactionLimitProp(){return transactionLimit;}

}
