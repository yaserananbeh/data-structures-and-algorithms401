package trees;

public class Ktree {
    public Knode root = new Knode("root");

    public Ktree(int kArity)
    {
        Knode.maxNrOfChildren=kArity;
        root.parent=null;
    }

    public void traverseKtree(Knode rootKnode)//depth first
    {
        System.out.println(rootKnode.name);
        if(rootKnode.children.size()!=0)
            for(Knode ch : rootKnode.children)
                traverseKtree(ch);
    }



}
