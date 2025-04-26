import java.util.ArrayList;

public class PropertyOwner {
    private User user;
    private ArrayList<Property> properties;

    public PropertyOwner(User user) {
        this.user = user;
        this.properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        if (!properties.contains(property)) {
            properties.add(property);
            System.out.println("Property added.");
        }
    }

    public void removeProperty(Property property) {
        if (properties.remove(property)) {
            System.out.println("Property removed.");
        } else {
            System.out.println("Property not found.");
        }
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public User getUser() {
        return user;
    }
}
