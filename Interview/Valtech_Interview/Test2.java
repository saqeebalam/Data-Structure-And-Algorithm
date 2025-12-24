package Interview;
public class Test2 {
    public static void main(String[] args) {
      /*{ { 0, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 }, 
          { 0, 0, 1, 0, 0 }, 
          { 0, 0, 1, 1, 0 }, 
          { 0, 1, 1, 0, 0 },
          { 0, 0, 0, 0, 0 }, 
          { 1, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 } } */
        int row=10;
        int col=5;
        //
        //int arr [][]=new int [row][col];
        int arr [][]=
        { { 0, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 }, 
          { 0, 0, 1, 0, 0 }, 
          { 0, 0, 1, 1, 0 }, 
          { 0, 1, 1, 0, 0 },
          { 0, 0, 0, 0, 0 }, 
          { 1, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 }, 
          { 0, 0, 0, 0, 0 } };
        //nextGen
        int nextGen [][]=new int [row][col];

        //dir

        int dXasix[]={-1,-1,-1,0,0,1,1,1};
        int dYasix[]={-1,0,1,-1,1,-1,0,1};

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int liveNig=0;
                for(int d=0;d<8;d++){
                    int nibI=i+dXasix[d];
                    int nibJ=j+dYasix[d];
                    if(nibI >=0 && nibI<row && nibJ >=0 && nibJ <col){
                        /*if(arr[nibI][nibJ]==1){
                            liveNig++;
                        }*/
                       liveNig+=arr[nibI][nibJ];
                    }
                }//End oof d loop

                if(arr[i][j]==1){
                    if(liveNig < 2 || liveNig >3){
                        nextGen[i][j]=0;
                    }else{
                        nextGen[i][j]=1;
                    }
                }else{//dead case
                    if(liveNig ==3){
                        nextGen[i][j]=1;
                    }else{
                        nextGen[i][j]=0;
                    }
                }
               // nextGen[i][j]=arr[i][j];


            }
        }

        //print
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(nextGen[i][j]+" ");
            }
            System.out.println();
        }



    }
}
