package java8.deitel;

public class AutoPolicy {

    private int accountNumber; // número da conta da apólice
    private String makeAndModel; // carro ao qual a apólice é aplicada
    private String state; // abreviatura do estado com duas letras

    public AutoPolicy(int accountNumber, String makeAndModel, String state) {
        this.state = state;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;

    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;

    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // método predicado é retornado se o estado tem seguros “sem culpa”
    public boolean isNoFaultState() {
        boolean noFaultState;
        // determina se o estado tem seguros de automóvel “sem culpa”
        switch (getState()) // obtém a abreviatura do estado do objeto AutoPolicy
        {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }

        return noFaultState;
    }
}

