package SFP;

import java.util.Scanner;

public class HotelBooking {
    public static void main(String ar[]){
        HotelBookingSystem crioHotel=new HotelBookingSystem();
        crioHotel.populateRoom();

        Scanner sc=new Scanner(System.in);
//        System.out.println("How many rooms want to book?");
//        int numberOfRooms=sc.nextInt();
//        for(int i=0;i<numberOfRooms;i++){
//            System.out.print("Enter the Floor Number:");
//            String floor=sc.next();
//            System.out.print("Enter the Room Name between A-Z:");
//            String room=sc.next();
//            System.out.println("Enter the name of Customer");
//            String name=sc.next();
//            crioHotel.BookRoom(floor+room,name);
//        }

        while(true){
            int n=0;
            System.out.println("Please enter the number to proceed with:");
            System.out.println("1.Display All Rooms");
            System.out.println("2.Book a Room");
            System.out.println("3.Display total Booked Rooms");
            System.out.println("4.Display All Rooms and customer names");
            System.out.println("5.Checkout room By Customer Name");
            System.out.println("6.Checkout room By roomId");
            System.out.println("7.Display total coins");
            System.out.println("8.Display Customer name by RoomId");
            System.out.println("9.Display  RoomId by Customer name");
            n=sc.nextInt();
            switch(n){
                case 1:{
                    crioHotel.displayHotelRooms();
                    break;
                }
                case 2:{
                    System.out.print("Enter the Floor Number:");
                    String floor=sc.next();
                    System.out.print("Enter the Room Name between A-Z:");
                    String room=sc.next();
                    System.out.println("Enter the name of Customer");
                    String name=sc.next();
                    crioHotel.BookRoom(floor+room,name);
                    break;
                }
                case 3:{
                    System.out.println("Total Booked rooms:"+crioHotel.activeBooking());
                    break;
                }
                case 4:{
                    crioHotel.displayBookedRooms();
                    break;
                }
                case 5:{
                    System.out.println("Enter customer Name to checkout:");
                    String customerName=sc.next();
                    crioHotel.checkOutByCustomerName(customerName);
                    break;
                }
                case 6:{
                    System.out.println("Enter customer name to get room number:");
                    String roomId=sc.next();
                    crioHotel.checkOutByRoomId(roomId);
                    break;
                }
                case 7:{
                    System.out.println(crioHotel.getCoinsCollected());
                    break;
                }
                case 8:{
                    System.out.println("Enter customer name to get room number:");
                    String customerName=sc.next();
                    System.out.println(crioHotel.searchRoomNumberByName(customerName));
                    break;
                }

                case 9:{
                    System.out.println("Enter roomId to get customer Name");
                    String roomId=sc.next();
                    System.out.println(crioHotel.searchCustomerByroomId(roomId));
                    break;
                }
                default:{
                    System.out.println("Enter valid number from given 0-9");
                }
            }
        }
    }
}
