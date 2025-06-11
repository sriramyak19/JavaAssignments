public class LibraryMember {
    int memberId;
    String memberName;
    int booksBorrowed;

    LibraryMember(int id, String name, int borrowed) {
        this.memberId = id;
        this.memberName = name;
        this.booksBorrowed = borrowed;
    }

    void borrowBooks(int count) {
        int maxLimit = 5;
        if (booksBorrowed + count <= maxLimit) {
            booksBorrowed += count;
            System.out.println("Books borrowed successfully. Total: " + booksBorrowed);
        } else {
            System.out.println("Cannot borrow more than " + maxLimit + " books.");
        }
    }

    public static void main(String[] args) {
        LibraryMember lm = new LibraryMember(1, "Kiran", 2);
        lm.borrowBooks(2);
        lm.borrowBooks(2);
    }
}

