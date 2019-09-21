package zuoye;

import java.util.ArrayList;

public class GraphTest {

    private ArrayList vertexList;
    private int[][] edgs;
    private int numsOfEdgs;
    public GraphTest(int n ){
        edgs = new int[n][n];
        vertexList = new ArrayList(n);
        numsOfEdgs = 0;
    }

//    顶点数目
    public int getNumsOfVertex(){
        return vertexList.size();
    }

    public int getNumsOfEdgs(){
        return numsOfEdgs;
    }


    public Object getValueOfVertexIndex(int i ){
        return vertexList.get(i);

    }
//    插入一条边
    public void insertEdge(Object vertex){
        vertexList.add(vertexList.size(),vertex);

    }
    //    插入一个顶点
    public void insertVertex(int v1, int v2, int weight){
        edgs [v1][v2] = weight;
        numsOfEdgs++;
    }

    public int getWeight(int v1, int v2){
        return edgs[v1][v2];
    }

    public int getFirstNeighber(int index){
        for(int j = 0;j<vertexList.size();j++){
            if(edgs[index][j]>0){
                return j;
            }

        }
        return -1;

    }

    public int getNextNeighber(int v1, int v2){
        for(int j=v2+1;j<vertexList.size();j++){
            if(edgs[v1][j]>0){
                return j;
            }
        }
        return -1;
    }

    public void depthSearch(boolean[] isVisited,int i){
        System.out.println(getValueOfVertexIndex(i)+" ");
        isVisited[i]=true;
        int w = getFirstNeighber(i);



    }

}
