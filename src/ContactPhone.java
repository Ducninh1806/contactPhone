import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ContactPhone {

    static ArrayList<Integer> dssdt = new ArrayList<Integer>();
    static ArrayList<String> dsten= new ArrayList<String>();
    public static void menu(){
        System.out.println("Danh bạ điện thoại");
        System.out.println("1. Nhập số thuê bao");
        System.out.println("2. Sửa số thuê bao");
        System.out.println("3. Xóa số thuê bao");
        System.out.println("4. Tìm số thuê bao");
        System.out.println("5. Tìm họ tên trong danh bạ");
        System.out.println("6. Xuất ra danh bạ trong máy");
        System.out.println("7. Exit");
        System.out.println("Bạn muốn nhập gì");

        int chon = new Scanner(System.in).nextInt();
        switch (chon){
            case 1:
                nhapsodienthoai();
                break;
            case 2:
                suasodienthoai();
                break;
            case 3:
                xoasodienthoai();
                break;
            case 4:
                timsodienthoai();
                break;
            case 5:
                timhoten();
                break;
            case 6:
                inradanhsach();
                break;
            case 7:
                System.out.println("Thanks you");
                System.exit(0);
                break;
        }

    }
    // OK
    private static void inradanhsach() {
        for (int i = 0; i <dsten.size() ; i++) {
            System.out.println("Họ và tên: "+ dsten.get(i)+ " số điện thoại: "+ dssdt.get(i));
        }
    }

    private static void timhoten() {
        System.out.println("Họ tên cần tìm: ");
        String ten = new Scanner(System.in).nextLine();
        
        if (dsten.contains(ten)){
            for (int i = 0; i < dsten.size(); i++) {
                if (dsten.get(i) == ten){
                    System.out.println("Họ và tên "+ dsten.get(i)+ " số điện thoại "+ dssdt.get(i));
                }
            }
        }else {
            System.out.println("Không có "+ ten + "trong danh bạ");
        }
    }

    //OK
    private static void timsodienthoai() {
        System.out.println("Số thuê bao cần tìm: ");
        int tim= new Scanner(System.in).nextInt();

        if (dssdt.contains(tim)){
            for (int i = 0; i <dssdt.size() ; i++) {
                if (dssdt.get(i) == tim){
                    System.out.println("Họ và tên: "+ dsten.get(i)+ " có số điện thoại: "+ dssdt.get(i));
                }
            }
        }else {
            System.out.println("Không có số thuê bao "+tim+" trong danh bạ");
        }
    }

    private static void xoasodienthoai() {
        System.out.println("Số thuê bao cần xóa: ");
        int xoasdt= new Scanner(System.in).nextInt();

        if (dssdt.contains(xoasdt)){
            for (int i = 0; i <dssdt.size() ; i++) {
                if (dssdt.get(i)==xoasdt){
                    System.out.println("Họ và tên: "+ dsten.get(i) + " số điện thoại: "+ dssdt.get(i)+ " đã được xóa tra khỏi danh sách");
                    dssdt.remove(i);
                    dsten.remove(i);
                }
            }
        }else {
            System.out.println("Không có số thuê bao "+xoasdt+" trong danh bạ");
        }
    }

    // OK
    private static void suasodienthoai() {
        System.out.println("Vị trí bạn muốn sửa");
        int vitri= new Scanner(System.in).nextInt();
        System.out.println("Số điện thoại bạn muốn sửa: ");
        int somoi = new Scanner(System.in).nextInt();
        dssdt.set(vitri,somoi);
    }

    // OK
    private static void nhapsodienthoai() {
        System.out.println("Nhập số họ và tên ");
        String hoten = new Scanner(System.in).nextLine();
        dsten.add(hoten);

        System.out.println("Nhập số thuê bao: ");
        int sdt = new Scanner(System.in).nextInt();
        dssdt.add(sdt);
    }

    public static void main(String[] args) {
        while (true){
            menu();
        }
    }
}
