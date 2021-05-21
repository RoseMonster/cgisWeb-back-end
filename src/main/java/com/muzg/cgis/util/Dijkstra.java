package com.muzg.cgis.util;

public class Dijkstra {
//    public double[][] getMap(int numOfVexs,double edges[][]){
//        for (int i = 0; i < numOfVexs+2; i++)
//            for (int j = i + 1; j < numOfVexs+2; j++) {
//
//            }
//        return edges;
//    }
    public double[] dijkstra(int v,int numOfVexs) {
        double edges[][] = new double[numOfVexs+1][];
        if (v < 0 || v >= numOfVexs)
            throw new ArrayIndexOutOfBoundsException();
        boolean[] st = new boolean[numOfVexs];// 默认初始为false
        double[] distance = new double[numOfVexs];// 存放源点到其他点的矩离

        for (int i = 0; i < numOfVexs; i++)
            for (int j = i + 1; j < numOfVexs; j++) {
                if (edges[i][j] == 0) {
                    edges[i][j] = Double.MAX_VALUE;
                    edges[j][i] = Double.MAX_VALUE;
                }
            }
        for (int i = 0; i < numOfVexs; i++) {
            distance[i] = edges[v][i];
        }
        st[v] = true;
        // 处理从源点到其余顶点的最短路径
        for (int i = 0; i < numOfVexs; ++i) {
            double min = Double.MAX_VALUE;
            int index=-1;
            // 比较从源点到其余顶点的路径长度
            for (int j = 0; j < numOfVexs; ++j) {
                // 从源点到j顶点的最短路径还没有找到
                if (st[j]==false) {
                    // 从源点到j顶点的路径长度最小
                    if (distance[j] < min) {
                        index = j;
                        min = distance[j];
                    }
                }
            }
            //找到源点到索引为index顶点的最短路径长度
            if(index!=-1)
                st[index] = true;
            // 更新当前最短路径及距离
            for (int w = 0; w < numOfVexs; w++)
                if (st[w] == false) {
                    if (edges[index][w] != Double.MAX_VALUE
                            && (min + edges[index][w] < distance[w]))
                        distance[w] = min + edges[index][w];
                }
        }
        return distance;
    }
}
