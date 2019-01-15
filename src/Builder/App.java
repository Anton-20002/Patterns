package Builder;

 class App {
   public static void main(String[] args) {
     Creator creator = new Creator(new Ford());
     Car car = creator.createCar();
     System.out.println("Car colour: "+car.getColour()+"\n"+
         "Car speed: "+car.getSpeed());
   }
}
