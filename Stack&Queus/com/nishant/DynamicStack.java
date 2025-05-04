package com.nishant;

public class DynamicStack extends CustomeStack{
    public DynamicStack(){
        super();//it will call custom stack
    }

    public DynamicStack( int size){
        super(size);//it will call custom stack size
    }

    @Override
    public boolean push(int item) {
        // this take care of it being full
        if(this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];
            // copy all the previos items in  new data
            for(int i=0 ; i < data.length;i++){
                temp[i]=data[i];
            }

            data =  temp;

        }
         //at this time we know that array is not full
        // insert item

        return super.push(item);
    }
}
