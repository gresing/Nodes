package test;

import main.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class NodesTest {
    @Test
    public void createNodeTest() {
        Node rootNode = new Node(true, null, 0);
        Node childNodeBranch1Level1 = new Node(false, rootNode, 0);
        Node childNodeBranch2Level1 = new Node(false, rootNode, 0);
        Node childNodeBranch3Level1 = new Node(false, rootNode, 0);
        Node childNodeBranch4Level1 = new Node(false, rootNode, 0);


        Node childNode1Branch1Level2 = new Node(false, childNodeBranch1Level1, 0);
        Node childNode2Branch1Level2 = new Node(false, childNodeBranch1Level1, 1);
        Node childNode3Branch1Level2 = new Node(false, childNodeBranch1Level1, 2);
        Node childNode4Branch1Level2 = new Node(false, childNodeBranch1Level1, 3);

        Node childNode1Branch2Level2 = new Node(false, childNodeBranch2Level1, 0);
        Node childNode2Branch2Level2 = new Node(false, childNodeBranch2Level1, 1);
        Node childNode3Branch2Level2 = new Node(false, childNodeBranch2Level1, 2);
        Node childNode4Branch2Level2 = new Node(false, childNodeBranch2Level1, 3);

        Node childNode1Branch3Level2 = new Node(false, childNodeBranch3Level1, -1);
        Node childNode2Branch3Level2 = new Node(false, childNodeBranch3Level1, 1);
        Node childNode3Branch3Level2 = new Node(false, childNodeBranch3Level1, 2);
        Node childNode4Branch3Level2 = new Node(false, childNodeBranch3Level1, 3);

        Node childNode1Branch4Level2 = new Node(false, childNodeBranch4Level1, 0);
        Node childNode2Branch4Level2 = new Node(false, childNodeBranch4Level1, 1);
        Node childNode3Branch4Level2 = new Node(false, childNodeBranch4Level1, 2);
        Node childNode4Branch4Level2 = new Node(false, childNodeBranch4Level1, 3);

        Node childNodeBranch4Level3 = new Node(false, childNode1Branch4Level2, 0);

        Assert.assertEquals(childNodeBranch2Level1.hashCode(), childNodeBranch1Level1.hashCode());
        Assert.assertNotEquals(childNodeBranch1Level1.hashCode(), childNodeBranch3Level1.hashCode());
        Assert.assertTrue(childNodeBranch2Level1.equals(childNodeBranch1Level1));
        Assert.assertFalse(childNodeBranch3Level1.equals(childNodeBranch2Level1));
        Assert.assertFalse(childNodeBranch4Level1.equals(childNodeBranch1Level1));
        Assert.assertTrue(childNode3Branch2Level2.equals(childNode3Branch3Level2));
        Assert.assertFalse(childNode1Branch2Level2.equals(childNode1Branch3Level2));


    }
}
