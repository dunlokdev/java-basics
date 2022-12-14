package menu;

import java.io.IOException;
import java.util.Scanner;

import modules.Modules;

public class Menu {
    final String tenNganHang = "NGAN HANG SO";
    final String mssv = "2011402";
    final String verSion = mssv + "@v2.0.0";

    private int _indexMenu;
    Modules module = new Modules();

    public void createMenu() {
        Scanner sc = new Scanner(System.in);

        do {
            clearConsole();
            System.out.println("\n" + frame());
            System.out.println("| " + tenNganHang + " | " + verSion + "            |");
            System.out.println(frame());
            System.out.println("| 1.Them Khach Hang                        |");
            System.out.println("| 2.Them tai khoan cho Khach Hang          |");
            System.out.println("| 3.Hien thi danh sach khach hang          |");
            System.out.println("| 4.Tim theo CCCD                          |");
            System.out.println("| 5.Tim theo ten khach hang                |");
            System.out.println("| 0.Thoat                                  |");
            System.out.println("\n" + frame());
            System.out.print(" Chuc nang:");

            chonMenu(sc);
            clearConsole();
            if (_indexMenu != 0) {
                switch (_indexMenu) {
                    case 1:
                        module.chucNang1();
                        delayConsole();
                        break;
                    case 2:
                        module.chucNang2();
                        delayConsole();
                        break;
                    case 3:
                        module.chucNang3();
                        delayConsole();
                        break;
                    case 4:
                        module.chucNang4();
                        delayConsole();
                        break;
                    case 5:
                        System.out.print("Nhap ten can tim: ");
                        sc = new Scanner(System.in);
                        String mssv = sc.nextLine();
                        module.chucNang5(mssv);
                        delayConsole();
                        break;
                    default:
                        System.out.println("Chuc nang khong ton tai");

                        break;
                }
            }
        } while (_indexMenu != 0);
        System.out.println("THOAT CHUONG TRINH !!!");
    }

    private void delayConsole() {
        try {
            System.out.println("\n\n\n" + frame());
            System.out.println("Nhan Enter de tiep tuc");
            System.in.read();
        } catch (IOException e) {
            return;
        }
    }

    private void chonMenu(Scanner sc) {
        _indexMenu = sc.nextInt();
    }

    private String frame() {
        String stringFrame = "+";
        for (int i = 0; i < 10; i++) {
            stringFrame += "-";
        }
        stringFrame += "+";
        String stringFrame2 = "";
        for (int i = 0; i < 20; i++) {
            stringFrame2 += "-";
        }
        return stringFrame + stringFrame2 + stringFrame;
    }

    public final static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
