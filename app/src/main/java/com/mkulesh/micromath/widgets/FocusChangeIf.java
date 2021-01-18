/*
 * microMathematics - Extended Visual Calculator
 * Copyright (C) 2014-2021 by Mikhail Kulesh
 *
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details. You should have received a copy of the GNU General
 * Public License along with this program.
 */
package com.mkulesh.micromath.widgets;

public interface FocusChangeIf
{
    /**
     * Enum that defines focus directions
     */
    enum NextFocusType
    {
        FOCUS_DOWN,
        FOCUS_LEFT,
        FOCUS_RIGHT,
        FOCUS_UP
    }

    /**
     * Procedure is called ID of next focused term is required
     */
    int onGetNextFocusId(CustomEditText owner, NextFocusType focusType);
}
