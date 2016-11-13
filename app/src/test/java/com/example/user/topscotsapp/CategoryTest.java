package com.example.user.topscotsapp;

/**
 * Created by user on 13/11/2016.
 */

public class CategoryTest {

        Category category;

        public CategoryTest(Category category) {
            this.category = category;
        }

        public void structureTests() {
            switch (category) {
                case HEIGHT:
                    System.out.println("That's pretty high");
                    break;

                case AGE:
                    System.out.println("That's pretty old");
                    break;

                case HERITAGE_VALUE: case MAINTENANCE:
                    System.out.println("It sure carries a lot of cultural value, doesn't it");
                    break;

                default:
                    System.out.println("But it costs alot to keep it looking this good");
                    break;

                case HAUNTED_RANK:
                    System.out.println("It's scary though");
                    break;
            }
        }

    public static void main(String[] args) {
        CategoryTest height = new CategoryTest(Category.HEIGHT);
        height.structureTests();
        CategoryTest age = new CategoryTest(Category.AGE);
        age.structureTests();
        CategoryTest heritage = new CategoryTest(Category.HERITAGE_VALUE);
        heritage.structureTests();
        CategoryTest maintenance = new CategoryTest(Category.MAINTENANCE);
        maintenance.structureTests();
        CategoryTest haunted = new CategoryTest(Category.HAUNTED_RANK);
        haunted.structureTests();
    }
}
}
