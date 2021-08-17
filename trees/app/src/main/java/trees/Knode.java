package trees;

import java.util.*;

public class Knode {

    public Knode parent;
    public List<Knode> children = new ArrayList<>();
    public String name;

    public static int maxNrOfChildren;

    public Knode (String nodeName)
    {
        name=nodeName;
    }
    public void addChild(Knode childNode)
    {
        if(this.children.size()>=maxNrOfChildren)
        {
        }
        else
        {
            childNode.parent=this;
            this.children.add(childNode);
        }
    }
}