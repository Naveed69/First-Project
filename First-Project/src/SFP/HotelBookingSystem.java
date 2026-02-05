package SFP;

import java.util.HashMap;

public class HotelBookingSystem {
    private HashMap<String,String> records;
    String roomNumber[][]=new String[10][26];
    int coin;
    public HotelBookingSystem(){
        records=new HashMap<>();
        coin=0;
    }

    public void populateRoom(){
        for(int i=0;i<10;i++){
            for(int j=0;j<26;j++){
                roomNumber[i][j]=i + ""+((char)(j+65));
            }
        }
    }

    public void displayHotelRooms(){
        for(int i=0;i<roomNumber.length;i++){
            for(int j=0;j<roomNumber[0].length;j++){
                System.out.print(roomNumber[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void BookRoom(String roomNumber,String customerName){
        records.put(roomNumber,customerName);
        coin++;
    }

    public String getCoinsCollected(){
        return "Total collected coins:"+coin;
    }

    public int activeBooking(){
        return records.size();
    }

    public void displayBookedRooms(){
        System.out.println("Booked room are below:");
        for(String roomId:records.keySet()){
            String cname=records.get(roomId);
            System.out.println("Room Number:"+roomId +" "+ "Customer Name:"+cname);
        }
        if(records.isEmpty()){
            System.out.println("No booking found");
        }
    }

    public void checkOutByRoomId(String roomId){
        records.remove(roomId);
    }

    public void checkOutByCustomerName(String name){
        for(String roomId:records.keySet()){
            if(records.get(roomId).equals(name)){
                records.remove(roomId);
                System.out.println("Succussfully checkout");
                break;
            }
        }
    }

    public String searchRoomNumberByName(String name){
        for(String roomId:records.keySet()){
            if(records.get(roomId).equals(name)){
                return "Room number: "+roomId;
            }
        }
        return "Room Not Found for customer:"+name;
    }

    public String searchCustomerByroomId(String roomId){
        if(records.containsKey(roomId)){
            return "Customer name: "+records.get(roomId);
        }
        return "No Customer for given room Number:"+roomId;
    }

}
