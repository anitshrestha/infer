/*
 * Copyright (c) 2017 - present Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.google.common.collect;

public abstract class ImmutableList<E> {

  public static final class Builder<E> {

    void dereference(Object object) {
      object.hashCode();
    }

    public Builder<E> add(E element) {
      dereference(element);
      return new Builder<>();
    }

    public Builder<E> add(E... elements) {
      dereference(elements);
      return new Builder<>();
    }
  }
}
