package org.springcore.ci;

public class Addition {
        private int value1;
        private int value2;
        public  Addition(double val1,double val2){
        this.value1=(int)val1;
        this.value2=(int)val2;
        System.out.println("Constructor:double,double");
        }

        public Addition(int val1,int val2){
            this.value1=val1;
            this.value2=val2;
            System.out.println("Constructor:int,int");
        }



        public Addition(String val1,String val2){
            this.value1= Integer.parseInt(val1);
            this.value2=Integer.parseInt(val2);
            System.out.println("Constructor:String,String");
        }

        public void doSum(){
            System.out.println("Sum is:"+(value2+value1));
        }


}
