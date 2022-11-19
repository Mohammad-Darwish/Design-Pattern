package creational.iOfcontrol;

import java.util.List;

public class Research {
    public Research(RelationshipBrowser relationships) {
        List<Person> children = relationships.findAllChildrenOf("John");
        for (Person child : children) {
            System.out.println("John has a chiled called: " + child.name);
        }
    }
}
