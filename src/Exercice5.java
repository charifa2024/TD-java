public class Exercice5 {
    public static int subArray(int[] array){
        int som=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i != j && array[i]+array[j]>som){
                    som=array[i]+array[j];
                }
            }
        }
        return som;

    }
    public static void main(String[] args){
        int[] array = new int[]{1, 1, -3,4,5};
        int som=subArray(array);
        System.out.println(som);


    }
}
