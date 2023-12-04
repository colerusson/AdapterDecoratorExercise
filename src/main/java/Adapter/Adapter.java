package Adapter;

public class Adapter implements TableData {
    private final ContactManager contactManager;

    public Adapter(ContactManager contactManager) {
        this.contactManager = contactManager;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return contactManager.getContactCount();
    }

    @Override
    public int getColumnSpacing() {
        return 3;
    }

    @Override
    public int getRowSpacing() {
        return 0;
    }

    @Override
    public char getHeaderUnderline() {
        return '~';
    }

    @Override
    public String getColumnHeader(int col) {
        return switch (col) {
            case 0 -> "First Name";
            case 1 -> "Last Name";
            case 2 -> "Phone";
            case 3 -> "Email";
            default -> null;
        };
    }

    @Override
    public int getColumnWidth(int col) {
        return switch (col) {
            case 0, 1 -> 10;
            case 2 -> 15;
            case 3 -> 20;
            default -> 0;
        };
    }

    @Override
    public Justification getColumnJustification(int col) {
        return switch (col) {
            case 0, 1 -> Justification.Left;
            case 2, 3 -> Justification.Right;
            default -> null;
        };
    }

    @Override
    public String getCellValue(int row, int col) {
        return switch (col) {
            case 0 -> contactManager.getContact(row).getFirstName();
            case 1 -> contactManager.getContact(row).getLastName();
            case 2 -> contactManager.getContact(row).getPhone();
            case 3 -> contactManager.getContact(row).getEmail();
            default -> null;
        };
    }
}
