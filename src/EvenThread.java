public  class EvenThread extends Thread {
    public void run(){
        int count = 0;
        int number = 0;
        try{
            while (count < 10){
                number++;
                if ( number % 2 == 0 ) {
                    System.out.println(number);
                    count++;
                }
            }
            Thread.sleep(1500);
        }catch (Exception e){
            System.out.println("Error");
        }

    }
}
