package sk.itsovy.ganoczi.projectthread;

import java.util.ArrayList;

public class Users extends Thread {

    ArrayList<String> users=new ArrayList<String>();
    String tempUser=null;

    public Users(){
        System.out.println("Thread was created");
    }

    public void createUser(String user) throws InterruptedException{

        synchronized (this){
            tempUser=user;
            System.out.println("User: "+user+" - successfully created");
            saveUser();

        }

    }

    public void saveUser(){

        users.add(tempUser);
        //System.out.println("User:"+tempUser+ " succesfully saved ");
    }

    public void readUsers() throws InterruptedException {




            for (int i = 0; i < users.size(); i++) {
                System.out.println(users.get(i));

        }
    }

}
