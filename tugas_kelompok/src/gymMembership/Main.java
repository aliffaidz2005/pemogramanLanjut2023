package gymMembership;
class GymMembership {
    private String memberName;
    private String membershipType;
    private int duration; // Durasi dalam bulan

    // Konstruktor untuk GymMembership
    public GymMembership(String memberName, String membershipType, int duration) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    // Getter untuk nama anggota
    public String getMemberName() {
        return memberName;
    }

    // Getter untuk jenis keanggotaan
    public String getMembershipType() {
        return membershipType;
    }

    // Getter untuk durasi
    public int getDuration() {
        return duration;
    }

    // Metode untuk menghitung biaya keanggotaan
    public double calculateMembershipFee() {
        double baseRate;
        if (membershipType.equalsIgnoreCase("Standard")) {
            baseRate = 50;
        } else if (membershipType.equalsIgnoreCase("Premium")) {
            baseRate = 100;
        } else {
            baseRate = 0;
            System.out.println("Jenis keanggotaan tidak valid.");
        }
        return baseRate * duration;
    }

    // Metode untuk memeriksa penawaran khusus
    public void checkSpecialOffer() {
        if (membershipType.equalsIgnoreCase("Premium") && duration >= 12) {
            System.out.println("Penawaran khusus: Diskon 10% untuk keanggotaan tahunan Premium!");
        } else {
            System.out.println("Tidak ada penawaran khusus yang tersedia.");
        }
    }
}

// Subkelas PremiumMembership yang menambahkan atribut tambahan
class PremiumMembership extends GymMembership {
    private boolean personalTrainer; // Ketersediaan pelatih pribadi
    private boolean spaAccess; // Akses ke spa

    // Konstruktor untuk PremiumMembership
    public PremiumMembership(String memberName, int duration, boolean personalTrainer, boolean spaAccess) {
        super(memberName, "Premium", duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    // Getter untuk pelatih pribadi
    public boolean hasPersonalTrainer() {
        return personalTrainer;
    }

    // Getter untuk akses spa
    public boolean hasSpaAccess() {
        return spaAccess;
    }

    // Override metode untuk menghitung biaya keanggotaan dengan fasilitas tambahan
    @Override
    public double calculateMembershipFee() {
        double baseFee = super.calculateMembershipFee();
        if (personalTrainer) {
            baseFee += 30 * getDuration(); // Tambah biaya pelatih pribadi per bulan
        }
        if (spaAccess) {
            baseFee += 20 * getDuration(); // Tambah biaya akses spa per bulan
        }
        return baseFee;
    }

    // Override metode untuk memeriksa penawaran khusus
    @Override
    public void checkSpecialOffer() {
        super.checkSpecialOffer();
        if (hasPersonalTrainer() && hasSpaAccess()) {
            System.out.println("Penawaran tambahan: Akses gratis ke kelas yoga setiap bulan!");
        }
    }
}

// Kelas utama untuk menguji kelas GymMembership dan PremiumMembership
public class Main {
    public static void main(String[] args) {
        // Membuat objek GymMembership standar
        GymMembership standardMember = new GymMembership("Alice", "Standard", 6);
        System.out.println("Nama Anggota: " + standardMember.getMemberName());
        System.out.println("Jenis Keanggotaan: " + standardMember.getMembershipType());
        System.out.println("Biaya Keanggotaan: $" + standardMember.calculateMembershipFee());
        standardMember.checkSpecialOffer();

        System.out.println();

        // Membuat objek PremiumMembership dengan fasilitas tambahan
        PremiumMembership premiumMember = new PremiumMembership("Bob", 12, true, true);
        System.out.println("Nama Anggota: " + premiumMember.getMemberName());
        System.out.println("Jenis Keanggotaan: " + premiumMember.getMembershipType());
        System.out.println("Biaya Keanggotaan: $" + premiumMember.calculateMembershipFee());
        premiumMember.checkSpecialOffer();
    }
}
