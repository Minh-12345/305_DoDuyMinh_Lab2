import java.util.ArrayList;
import java.util.List;

public class Tenant {
    User user;
    List<RentalContract> listOfContracts = new ArrayList<>();

    public Tenant(User user) {
        this.user = user;
    }

    public void requestCreateRentalContract(RentalContract contract) {
        listOfContracts.add(contract);
    }

    public void requestTerminateRentalContract(RentalContract contract) {
        listOfContracts.remove(contract);
        contract.terminateContract();
    }
}
