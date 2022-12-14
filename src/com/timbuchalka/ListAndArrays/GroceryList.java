package com.timbuchalka.ListAndArrays;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item);

    }

    public ArrayList<String> getGroceryList() {

        return groceryList;

    }

    public void printGroceryList() {

        System.out.println("You have " + groceryList.size() + " items in your grocery list");

        for(int i=0; i< groceryList.size(); i++) {

            System.out.println((i+1) + ". " + groceryList.get(i));

        }

    }

    public void modifyGroceryItem(int position, String newItem) {

        groceryList.set(position, newItem);

        System.out.println("Grocery item " + (position+1) + " has been modified.");

    }

    private void modifyGroceryItem(int position, String newItem) {

        groceryList.set(position, newItem);

        System.out.println("Grocery item " + (position+1) + " has been modified.");

    }

    public void removeGroceryItem(int position) {

        String theItem = groceryList.get(position);

        groceryList.remove(position);

    }

    private void removeGroceryItem(int position) {

        groceryList.remove(position);

    }


    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);

        int position = groceryList.indexOf(searchItem);

        if(position >= 0) {

            return groceryList.get(position);

        }

        return null;
    }

    public boolean onFile(String searchItem) {

        int position = findItem(searchItem);

        if(position >= 0) {

            return true;

        }

        return false;
    }
}
