/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glm.mat._3;

/**
 *
 * @author fschaefers
 */
abstract class matrixQuery extends matrixTransform {

    public boolean isIdentity() {
        return isIdentity(0.0f);
    }

    public boolean isIdentity(float epsilon) {
        return Math.abs(m00 - 1) <= epsilon
                && Math.abs(m01) <= epsilon
                && Math.abs(m02) <= epsilon
                && Math.abs(m10) <= epsilon
                && Math.abs(m11 - 1) <= epsilon
                && Math.abs(m12) <= epsilon
                && Math.abs(m20) <= epsilon
                && Math.abs(m21) <= epsilon
                && Math.abs(m22 - 1) <= epsilon;
    }
}
