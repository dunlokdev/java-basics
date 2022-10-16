import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Lab01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            Menu();

            int choose = input.nextInt();
            switch (choose) {
                case 0:
                    System.out.println("Chuong trinh da thoat !");
                    return;
                case 1:
                    HandleCase1();
                    break;

                default:
                    System.out.println("Vui long nhap lua chon hop le !");
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("+----------+-----------------+----------+");
        System.out.println("| NGAN HANG SO - 2011402@DUONGMYLOC     |");
        System.out.println("+----------+-----------------+----------+");
        System.out.println("| 1. Nhap CCCD                          |");
        System.out.println("| 0. Thoat                              |");
        System.out.println("+----------+-----------------+----------+");
        System.out.print(">> Chuc nang: ");
    }

    public static void Menu2() {
        System.out.println("1. Kiem tra noi sinh");
        System.out.println("2. Kiem tra tuoi, gioi tinh");
        System.out.println("3. Kiem tra so ngau nhien");
        System.out.println("0. Thoat");
        System.out.print(">> Chuc nang: ");
    }

    public static void HandleCase1() {
        while (true) {
            Scanner input = new Scanner(System.in);
            // Math.floor(Math.random()*(max-min+1)+min)
            // int ran = (int) Math.floor(Math.random() * (999 - 100 + 1) + 100);
            RandomString rd = new RandomString();
            String ran = rd.randomString(6);
            System.out.println("Ma xac nhan cua ban: " + ran);

            System.out.print("Nhap ma xac thuc: ");
            String code = input.nextLine();
            if (code.equals(ran)) {
                HandleCCCD();
                break;
            }
            System.out.println("Ma xac thuc khong dung. Vui long thu lai");
        }
    }

    public static void HandleCCCD() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Nhap CCCD: ");
            String cccd = input.nextLine();
            if (cccd.equals("No"))
                break;
            if (cccd.length() >= 12) {
                CheckCCCD(cccd);
                break;
            }
            System.out.println("So CCCD khong hop le. Vui long nhap lai hoac 'No' de thoat!");
        }
    }

    public static void CheckCCCD(String CCCD) {

        String maTinh = CCCD.substring(0, 3);
        String gioiTinh = CCCD.substring(3, 4);
        String namSinh = CCCD.substring(4, 6);
        String ngauNhien = CCCD.substring(6, 12);

        Scanner input = new Scanner(System.in);
        while (true) {
            Menu2();
            int choose = input.nextInt();

            switch (choose) {
                case 0:
                    System.out.println("Chuong trinh da thoat!");
                    return;
                case 1:
                    boolean result = ChechMaTinh(maTinh);
                    if (!result)
                        System.out.println("Khong ton tai ma tinh nay!");
                    break;
                case 2:
                    ThongTinTuoiVaGioiTinh(gioiTinh, namSinh);
                    break;
                case 3:
                    System.out.println("So ngau nhien: " + ngauNhien);
                    break;
                default:

                    break;
            }
        }
    }

    private static void ThongTinTuoiVaGioiTinh(String gioiTinh, String namSinh) {
        String theKy = "";
        int age = 0;
        int yearBirth = 0;
        int currentYear = 2022;
        switch (gioiTinh) {
            case "0":
            case "1":
                theKy = "The ky 20";
                yearBirth = 1900 + Integer.parseInt(namSinh);
                System.out.println(yearBirth);
                break;

            case "2":
            case "3":
                theKy = "The ky 21";
                yearBirth = 2000 + Integer.parseInt(namSinh);
                break;

            case "4":
            case "5":
                theKy = "The ky 22";
                yearBirth = 2100 + Integer.parseInt(namSinh);
                break;

            case "6":
            case "7":
                theKy = "The ky 23";
                yearBirth = 2200 + Integer.parseInt(namSinh);

                break;

            case "8":
            case "9":
                theKy = "The ky 24";
                yearBirth = 2300 + Integer.parseInt(namSinh);

                break;
            default:
                break;
        }
        switch (gioiTinh) {
            case "0":
            case "2":
            case "4":
            case "6":
            case "8":
                gioiTinh = "Nam";
                break;

            case "1":
            case "3":
            case "5":
            case "7":
            case "9":
                gioiTinh = "Nu";
                break;

            default:
                break;
        }

        age = currentYear - yearBirth;
        System.out.println("Gioi tinh: " + gioiTinh + " - Tuoi: " + age + " - " + theKy);
    }

    public static boolean ChechMaTinh(String maTinh) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("001", "Ha Noi");
        map.put("002", "Ha Giang");
        map.put("004", "Cao Bang");
        map.put("006", "Bac Kan");
        map.put("008", "Tuyen Quang");
        map.put("010", "Lao Cai");
        map.put("011", "Dien Bien");
        map.put("001", "Hà Nội");
        map.put("002", "Hà Giang");
        map.put("004", "Cao Bằng");
        map.put("006", "Bắc Kạn");
        map.put("008", "Tuyên Quang");
        map.put("010", "Lào Cai");
        map.put("011", "Điện Biên");
        map.put("012", "Lai Châu");
        map.put("014", "Sơn La");
        map.put("015", "Yên Bái");
        map.put("017", "Hòa Bình");
        map.put("019", "Thái Nguyên");
        map.put("020", "Lạng Sơn");
        map.put("022", "Quảng Ninh");
        map.put("024", "Bắc Giang");
        map.put("025", "Phú Thọ");
        map.put("026", "Vĩnh Phúc");
        map.put("027", "Bắc Ninh");
        map.put("030", "Hải Dương");
        map.put("031", "Hải Phòng");
        map.put("033", "Hưng Yên");
        map.put("034", "Thái Bình");
        map.put("035", "Hà Nam");
        map.put("036", "Nam Định");
        map.put("037", "Ninh Bình");
        map.put("038", "Thanh Hóa");
        map.put("040", "Nghệ An");
        map.put("042", "Hà Tĩnh");
        map.put("044", "Quảng Bình");
        map.put("045", "Quảng Trị");
        map.put("046", "Thừa Thiên Huế");
        map.put("048", "Đà Nẵng");
        map.put("049", "Quảng Nam");
        map.put("051", "Quảng Ngãi");
        map.put("052", "Bình Định");
        map.put("054", "Phú Yên");
        map.put("056", "Khánh Hòa");
        map.put("058", "Ninh Thuận");
        map.put("060", "Bình Thuận");
        map.put("062", "Kon Tum");
        map.put("064", "Gia Lai");
        map.put("066", "Đắk Lắk");
        map.put("067", "Đắk Nông");
        map.put("068", "Lâm Đồng");
        map.put("070", "Bình Phước");
        map.put("072", "Tây Ninh");
        map.put("074", "Bình Dương");
        map.put("075", "Đồng Nai");
        map.put("077", "Bà Rịa - Vũng Tàu");
        map.put("079", "Hồ Chí Minh");
        map.put("080", "Long An");
        map.put("082", "Tiền Giang");
        map.put("083", "Bến Tre");
        map.put("084", "Trà Vinh");
        map.put("086", "Vĩnh Long");
        map.put("087", "Đồng Tháp");
        map.put("089", "An Giang");
        map.put("091", "Kiên Giang");
        map.put("092", "Cần Thơ");
        map.put("093", "Hậu Giang");
        map.put("094", "Sóc Trăng");
        map.put("095", "Bạc Liêu");
        map.put("096", "Cà Mau");

        Set<String> set = map.keySet();

        for (String key : set) {
            if (key.equals(maTinh)) {
                System.out.println("Ma" + key + " - " + map.get(key));
                return true;
            }
        }

        return false;
    }
}
