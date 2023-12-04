package Adapter;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {
        public static void main(String[] args) throws IOException {
                Contact contact1 = new Contact("Cole", "Russon", "555-1234", "email1@email.com");
                Contact contact2 = new Contact("Nik", "Earl", "555-5678", "email2@email.com");
                Contact contact3 = new Contact("Harrison", "Cole", "555-9012", "email3@email.com");
                Contact contact4 = new Contact("Takun", "Purba", "555-3456", "email4@email.com");

                ContactManager manager = new ContactManager();
                manager.addContact(contact1);
                manager.addContact(contact2);
                manager.addContact(contact3);
                manager.addContact(contact4);

                Adapter adapter = new Adapter(manager);

                Writer output = new OutputStreamWriter(System.out);

                Table table = new Table(output, adapter);

                try {
                        table.display();
                        output.flush();
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }
}
