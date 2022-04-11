class Solution {
    Map<Node, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node copy = new Node(node.val, new ArrayList<>());
        map.put(node, copy);
        for(Node neighbor : node.neighbors){
            if(map.containsKey(neighbor)){
                copy.neighbors.add(map.get(neighbor));
            }else{
                copy.neighbors.add(cloneGraph(neighbor));
            }
        }
        return copy;
    }
}

