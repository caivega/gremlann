/******************************************************************************
 *                                                                             *
 *  Copyright: (c) Syncleus, Inc.                                              *
 *                                                                             *
 *  You may redistribute and modify this source code under the terms and       *
 *  conditions of the Open Source Community License - Type C version 1.0       *
 *  or any later version as published by Syncleus, Inc. at www.syncleus.com.   *
 *  There should be a copy of the license included with this file. If a copy   *
 *  of the license is not included you are granted no right to distribute or   *
 *  otherwise use this file except through a legal and valid license. You      *
 *  should also contact Syncleus, Inc. at the information below if you cannot  *
 *  find a license:                                                            *
 *                                                                             *
 *  Syncleus, Inc.                                                             *
 *  2604 South 12th Street                                                     *
 *  Philadelphia, PA 19148                                                     *
 *                                                                             *
 ******************************************************************************/
package syncleus.gremlann.activation;

public class HyperbolicTangentActivationFunction implements ActivationFunction {
    private static final double UPPER_LIMIT = 1.0;
    private static final double LOWER_LIMIT = -1.0;
    private static final double DERIVATIVE_EXP = 2.0;

    /**
     * The hyperbolic tangent activation function.
     *
     * @param activity the neuron's current activity.
     * @return The result of the hyperbolic tangent activation function bound
     * between -1 and 1.
     * @since 1.0
     */
    @Override
    public double activate(final double activity) {
        return Math.tanh(activity);
    }

    /**
     * The derivative of the hyperbolic tangent activation function.
     *
     * @param activity The neuron's current activity.
     * @return The result of the derivative of the hyperbolic tangent activation
     * function.
     * @since 1.0
     */
    @Override
    public double activateDerivative(final double activity) {
        return 1.0 - Math.pow(this.activate(activity), HyperbolicTangentActivationFunction.DERIVATIVE_EXP);
    }

    @Override
    public boolean isBound() {
        return true;
    }

    @Override
    public double getUpperLimit() {
        return UPPER_LIMIT;
    }

    @Override
    public double getLowerLimit() {
        return LOWER_LIMIT;
    }
}
