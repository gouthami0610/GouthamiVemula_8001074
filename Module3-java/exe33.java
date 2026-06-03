import java.sql.Connection;
import java.sql.PreparedStatement;

public class exe33 {
    public static void transfer(
            Connection con,
            int fromAcc,
             int toAcc,
            double amount) throws Exception {
 
        try {
            con.setAutoCommit(false);

            PreparedStatement debit =
                con.prepareStatement(
                "UPDATE accounts SET balance = balance - ? WHERE id=?");

            debit.setDouble(1, amount);
            debit.setInt(2, fromAcc);
              debit.executeUpdate();

            PreparedStatement credit =
                con.prepareStatement(
                "UPDATE accounts SET balance = balance + ? WHERE id=?");

            credit.setDouble(1, amount);
            credit.setInt(2, toAcc);
            credit.executeUpdate();

            con.commit();

        } catch(Exception e) {
            con.rollback();
            System.out.println("Transaction Failed");
        }
    }
}
