/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class ClosestPointInput extends BulletBase {
	private long swigCPtr;
	
	protected ClosestPointInput(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new ClosestPointInput, normally you should not need this constructor it's intended for low-level usage. */ 
	public ClosestPointInput(long cPtr, boolean cMemoryOwn) {
		this("ClosestPointInput", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(ClosestPointInput obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_ClosestPointInput(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public ClosestPointInput() {
    this(CollisionJNI.new_ClosestPointInput(), true);
  }

  public void setTransformA(btTransform value) {
    CollisionJNI.ClosestPointInput_transformA_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getTransformA() {
    long cPtr = CollisionJNI.ClosestPointInput_transformA_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setTransformB(btTransform value) {
    CollisionJNI.ClosestPointInput_transformB_set(swigCPtr, this, btTransform.getCPtr(value), value);
  }

  public btTransform getTransformB() {
    long cPtr = CollisionJNI.ClosestPointInput_transformB_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btTransform(cPtr, false);
  }

  public void setMaximumDistanceSquared(float value) {
    CollisionJNI.ClosestPointInput_maximumDistanceSquared_set(swigCPtr, this, value);
  }

  public float getMaximumDistanceSquared() {
    return CollisionJNI.ClosestPointInput_maximumDistanceSquared_get(swigCPtr, this);
  }

}
