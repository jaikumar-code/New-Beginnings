

class HelloWorld {
    public static void main(String[] args) {
        int[] Input = {7,2,5,3,6};
        int[] sum = {9};
        
        int i=0;
        for(i = 0; i<Input.length-1; i++){
            int expSum = Input[i]+ Input[i+1];
            if (expSum == sum[0]){
                System.out.println("The numbers are "+ i + "and " + (i+1));
            }
        }
    }
}