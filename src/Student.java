class Student extends User{

    Student(String name, String userId){
        super(name, userId);
    }
    @Override
    public void showMenu() {
        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.println("3. View Books");
    }
}
