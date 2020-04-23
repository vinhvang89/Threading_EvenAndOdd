public  class OddThread extends Thread {

    public void run(){
        int count = 0;
        int number = 0;
        try{
            while (count < 10){
                number++;
                if ( number % 2 == 1 ) {
                    System.out.println(number);
                    count++;
                }
            }
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Error");
        }

    }

}
