import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert;

import com.example.exception.NoSquareException;
import com.example.model.Matrix;
import com.example.service.MatrixMathematics;

public class MatrixMathematicsTest {

    @Test
    public void testDeterminant() {

        double [][] data = { {1,2,3}, {2,3,1}, {3,2,1}};

        int result_test = 0;
		try {
			result_test = (int)new MatrixMathematics().determinant(new Matrix(data));
		} catch (NoSquareException e) {
		}
    //-----------------------------------------------------/
        int result_attendu = -12;
    //-----------------------------------------------------/
        assertEquals(result_test,result_attendu);
    }

    @Test(expected=NoSquareException.class)
    public void testDeterminantNonSquare() throws NoSquareException {

        double [][] data = { {1,2}, {3,4}, {3,4}};

        int result_test = 0;
			result_test = (int)new MatrixMathematics().determinant(new Matrix(data));
    }

    @Test
    public void testCofactor() {

        double [][] data = { {1,2}, {3,4}};

        Matrix cofactor = null;
		try {
			cofactor = new MatrixMathematics().cofactor(new Matrix(data));
		} catch (NoSquareException e) {
		}

    //-----------------------------------------------------/
        double [][] result_attendu = {{4,-3}, {-2,1}};

        double [][] result_test =cofactor.getValues();
    //-----------------------------------------------------/

        Assert.assertArrayEquals( result_test, result_attendu );

    }

}
