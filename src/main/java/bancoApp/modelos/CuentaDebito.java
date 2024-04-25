package bancoApp.modelos;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CuentaDebito extends Cuenta{
    // The withdrawal limit from the savings
    private final DoubleProperty withdrawlLimit;

    public CuentaDebito(String owner, String accountNumber, double balance, double withdrawalLimit){
        super(owner, accountNumber, balance);
        this.withdrawlLimit = new SimpleDoubleProperty(this, "Withdrawal Limit", withdrawalLimit);
    }

    public DoubleProperty withdrawLimitProp(){return withdrawlLimit;}
}
