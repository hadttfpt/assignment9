import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class ngay {
    public TextField txtNg;
    public TextField txtTh;
    public TextField txtNa;
    public TextArea txtKQ;

    public boolean checkNgay(int x){
        if(x>0&&x<31){
            return true;
        }return false;
    }
    public boolean checkThang(int x){
        if(x>0&&x<13){
            return true;
        }return false;
    }
    public void submit(){
   /*
    Viết chương trình JavaFX gồm có giao diện như sau:
1 button
3 textfield ngày, tháng, năm
1 textarea
Chức năng: Khi điền các thông tin đến ngày tháng năm ( check ngày tháng năm đúng yêu cầu như ngày chỉ từ 1-30, tháng 1-12 ...)
 sau đó nhấn button thì sẽ show ra đó ngày là thứ bao nhiêu trong tuần, tháng năm trong textarea
     */
   try{
       int ngay = Integer.parseInt(txtNg.getText());
       int thang = Integer.parseInt(txtTh.getText());
       int nam = Integer.parseInt(txtNa.getText());
       if(checkNgay(ngay)&&checkThang(thang)){
           LocalDate ld = LocalDate.of(nam,thang,ngay);
           txtKQ.setText("La ngay thu "+ld.getDayOfWeek()+" thang "+ld.getMonth()+" nam "+ld.getYear());
       }else{
           txtKQ.setText("Du lieu nhap vao khong hop le ");
       }
   }catch (Exception e){
       txtKQ.setText(e.getMessage());
   }
    }
}
