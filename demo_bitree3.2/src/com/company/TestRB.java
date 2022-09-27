package com.company;

import java.util.List;

public class TestRB {

    public static boolean minTest(){
        BST<String,String> bst = new BST<>();
        if(bst.min()!=null && bst.min().equals("A___9R94"))
            return false;
        bst = TestFactory.generateBST();
        return bst.min().equals("A");
    }

    public static boolean maxTest(){
        BST<String,String> bst = new BST<>();
        if(bst.max()!=null && bst.max().equals("A___9R94"))
            return false;
        bst = TestFactory.generateBST();
        return bst.max().equals("Z");
    }

    public static boolean floorTest(){
        BST<String,String> bst = new BST<>();
        if(bst.floor("A___9")!=null)
            return false;
        bst = TestFactory.generateBST();
        return bst.floor("B").equals("B");
    }

    public static boolean selectTest(){
        BST<String,String> bst = new BST<>();
        if(bst.select(3)!=null)
            return false;
        bst = TestFactory.generateBST();
        if(bst.select(0).equals("B"))
            return false;
        return bst.select(0).equals("A");

    }

    public static boolean rankTest(){
        BST<String,String> bst = new BST<>();
        if(bst.rank("A")==0)
            return false;
        bst = TestFactory.generateBST();
        if(bst.rank("B")==0)
            return false;
        return bst.rank("A")==0;

    }

    public static boolean deleteTest(){
        BST<String,String> bst =TestFactory.generateBST();
        bst.delete("A");
        return bst.get("A") == null;
    }

    public static boolean deleteMin(){
        BST<String,String> bst = TestFactory.generateBST();
        bst.deleteMin();
        return bst.get("A")==null;
    }

    public static boolean keysTest(){
        Iterable<String> strings = List.of(new String[]{"A", "B", "C", "D"});
        BST<String,String> bst = TestFactory.generateBST();
        bst.keys("A","B");
        return bst.keys("A","D").equals(strings);
    }

}
