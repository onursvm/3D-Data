public class Main {
    public static void main(String[] args) {
        DataCube<Integer> dataCube = new DataCube<>("Öğrenciler-Ders-Puan");
        dataCube.addDimension(1, "Öğrenci");
        dataCube.addDimension(2, "Ders");
        dataCube.addDimension(3, "Zaman");

        dataCube.setValue("Onur Sevim", "Nesneye Yönelik Proglama", "2022",90);
        dataCube.setValue("Mehmet Kadir Güngör", "Veri Yapılar Algoritma", "2021", 80);
        dataCube.setValue("Berkant Kaplan", "İleri Proglamlama", "2023", 100);
        dataCube.setValue("Fatih Aydın","Nesneye Yönelik Proglama","2023",100);

        System.out.println(dataCube.getValue("Onur Sevim", "Nesneye Yönelik Proglama", "2022"));
        System.out.println(dataCube.getValue("Mehmet Kadir Güngör", "Veri Yapılar Algoritma", "2021")) ;
        System.out.println( dataCube.getValue("Berkant Kaplan", "İleri Proglamlama", "2023"));
        System.out.println(dataCube.getValue("Fatih Aydın","Nesneye Yönelik Proglama","2023"));
        System.out.println(dataCube.getValue("Fatih Aydın","Nesneye Yönelik Proglama","2022"));

        System.out.println("____________________________________________________________________________");

        //aşağıdaki kod küpdeki veriyi siliyor
        dataCube.removeValue("Mehmet Kadir Güngör", "Veri Yapılar Algoritma", "2021");
        //aşağıdaki kod seçili kişinin notunu değiştiriyor
        dataCube.updateValue("Berkant Kaplan", "İleri Proglamlama", "2023", 95);
        //aşağıdaki kod seçili kişinin ismini değiştiriyor
        dataCube.updateStudent("Onur Sevim", "ahmet");
        //aşağıdaki kod seçili dersi değiştiriyor
        dataCube.updateLesson("Nesneye Yönelik Programlama","İleri Programlama");
        //aşağıdaki kod seçili zamanı değiştiriyor
        dataCube.updateTime("2023","2022");


        System.out.println( dataCube.getValue("Berkant Kaplan", "İleri Proglamlama", "2023"));
        System.out.println(dataCube.getValue("Onur Sevim", "Nesneye Yönelik Proglama", "2022"));
        System.out.println(dataCube.getValue("ahmet", "Nesneye Yönelik Proglama", "2022"));
        System.out.println(dataCube.getValue("Mehmet Kadir Güngör", "Veri Yapılar Algoritma", "2021"));
        System.out.println(dataCube.getValue("Fatih Aydın","İleri Programlama","2022"));


        //aşağıdaki kod tüm veriyi siliyor
        dataCube.clearValues();

        System.out.println("____________________________________________________________________________");
        System.out.println(dataCube.getValue("Onur Sevim", "Nesneye Yönelik Proglama", "2022"));
        System.out.println(dataCube.getValue("Onur Sevim", "İleri Proglamlama", "2022"));
        System.out.println(dataCube.getValue("Mehmet Kadir Güngör", "Veri Yapılar Algoritma", "2021")) ;
        System.out.println( dataCube.getValue("Berkant Kaplan", "İleri Proglamlama", "2023"));
        System.out.println(dataCube.getValue("Fatih Aydın","Nesneye Yönelik Proglama","2023"));
        System.out.println(dataCube.getValue("Fatih Aydın","Veri Yapılar Algoritma","2023"));

    }

}
