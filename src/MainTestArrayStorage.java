/**
 *Реализуйте методы save, get, delete, clear, getAll,
 * size в классе ArrayStorage,
 *  организовав хранение резюме в массиве
 * Храните все резюме в начале storage (без пустот в виде null),
 * чтобы не перебирать каждый раз все 10_000 элементов
 * При реализации метода delete учитывайте, что после удаления
 * резюме между оставшимися резюме не должно быть пустых ячеек,
 * заполненных null
 * Схема хранения резюме в массиве storage
 * (в элементах от 0 до size-1 отсутствуют null):
 * r1, r2, r3,..., rn, null, null,..., null
 * <----- size ----->
 * <------- storage.length (10000) ------->
 * Проверьте вашу реализацию с помощью классов MainArray.main()
 * и MainTestArrayStorage.main()
 * Test for your ArrayStorage implementation
 */
public class MainTestArrayStorage {
    static final ArrayStorage ARRAY_STORAGE = new ArrayStorage();

    public static void main(String[] args) {
        Resume r1 = new Resume();
        r1.uuid = "uuid1";
        Resume r2 = new Resume();
        r2.uuid = "uuid2";
        Resume r3 = new Resume();
        r3.uuid = "uuid3";

        ARRAY_STORAGE.save(r1);
        ARRAY_STORAGE.save(r2);
        ARRAY_STORAGE.save(r3);

        System.out.println("Get r1: " + ARRAY_STORAGE.get(r1.uuid));
        System.out.println("Size: " + ARRAY_STORAGE.size());

        System.out.println("Get dummy: " + ARRAY_STORAGE.get("dummy"));

        printAll();
        ARRAY_STORAGE.delete(r1.uuid);
        printAll();
        ARRAY_STORAGE.clear();
        printAll();

        System.out.println("Size: " + ARRAY_STORAGE.size());
    }

    static void printAll() {
        System.out.println("\nGet All");
        for (Resume r : ARRAY_STORAGE.getAll()) {
            System.out.println(r);
        }
    }
}