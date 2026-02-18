class Admin extends User{

    @Override
    public void showMenu() {
        System.out.println("1. Add Book");
        System.out.println("2. Remove Book");
        System.out.println("3. View All Book");
    }
}
