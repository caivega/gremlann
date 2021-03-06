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

public interface ActivationFunction {
    /**
     * The activation function.
     *
     * @param activity the neuron's current activity.
     * @return The result of the activation function. Usually a bound value
     * between 1 and -1 or 1 and 0. However this bound range is not
     * required.
     * @since 1.0
     */
    double activate(double activity);

    /**
     * The derivative of the activation function.
     *
     * @param activity The neuron's current activity.
     * @return The result of the derivative of the activation function.
     * @since 1.0
     */
    double activateDerivative(double activity);

    boolean isBound();

    double getUpperLimit();

    double getLowerLimit();
}
