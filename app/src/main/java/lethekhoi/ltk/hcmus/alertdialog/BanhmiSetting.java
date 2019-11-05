package lethekhoi.ltk.hcmus.alertdialog;

public interface BanhmiSetting {
    BanhmiSetting loai(String loai);

    BanhmiSetting salad(String salad);

    BanhmiSetting cachua(String cachua);

    BanhmiSetting nuocsot(String nuocsot);

    BanhmiSetting nuocuong(String nuocuong);

    Banhmi build();
}

