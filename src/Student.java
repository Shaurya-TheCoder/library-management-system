class Student extends User{

    @Override
    public void showMenu() {
        System.out.println("1. View Books");
        System.out.println("2. Issue Book");
        System.out.println("3. Return Book");
    }
}
