package tree.example1.build;

public class BiTNode {

    private Integer value;
    public BiTNode left;
    public BiTNode right;

    public BiTNode(Integer value) {
        this.value = value;
    }

    //添加二叉树的node
    public void addNode(BiTNode node)
    {
       if(node.value == this.value) return;
       if(node.value > this.value){
          if(this.right == null)
              this.right = node;
          else
              this.right.addNode(node);
       }else{
           if(this.left == null)
               this.left = node;
           else
               this.left.addNode(node);
       }

    }

    //查找二叉树value最大的节点
    public Integer findMax()
    {
        if(this == null)   return null;
        if(this.right == null) return this.value;
        else return this.right.findMax();

    }

    //查找二叉树value最小的节点
    public Integer findMin()
    {
        if(this == null)   return null;
        if(this.left == null) return this.value;
        else return this.left.findMin();

    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
