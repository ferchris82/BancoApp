package bancoApp.modelos;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

public class Cliente {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty payeeAddress;
    private final ObjectProperty<Cuenta> checkingAccount;
    private final ObjectProperty<Cuenta> savingsAccount;
    private final ObjectProperty<LocalDate> dateCreated;

    public Cliente(String fName, String lName, String pAddress, Cuenta cAccount, Cuenta sAccount, LocalDate date){
        this.firstName = new SimpleStringProperty(this, "Nombre", fName);
        this.lastName = new SimpleStringProperty(this, "Apellido", lName);
        this.payeeAddress = new SimpleStringProperty(this, "Direccion", pAddress);
        this.checkingAccount = new SimpleObjectProperty<>(this, "Cuenta Corriente", cAccount);
        this.savingsAccount = new SimpleObjectProperty<>(this, "Cuenta Debito", sAccount);
        this.dateCreated = new SimpleObjectProperty<>(this, "Fecha Creacion", date);
    }

    public StringProperty firstNameProperty(){return firstName;}

    public StringProperty lastNameProperty(){return lastName;}

    public StringProperty pAddressProperty(){return payeeAddress;}

    public ObjectProperty<Cuenta> checkingAccountProperty(){return checkingAccount;}

    public ObjectProperty<Cuenta> savingsAccountProperty(){return savingsAccount;}

    public ObjectProperty<LocalDate> dateProperty(){return dateCreated;}
}
