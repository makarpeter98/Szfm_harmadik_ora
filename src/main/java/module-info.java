module inf.unideb.szfm.makar.szfm_harmadik_ora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens inf.unideb.szfm.makar.szfm_harmadik_ora to javafx.fxml;
    exports inf.unideb.szfm.makar.szfm_harmadik_ora;
}