/* 
 * Copyright 2011 Austin Wagner
 *     
 * This file is part of Mobile Shuttle Tracker.
 *
 *  Mobile Shuttle Tracker is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Mobile Shuttle Tracker is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Mobile Shuttle Tracker.  If not, see <http://www.gnu.org/licenses/>.
 *  
 */

package com.abstractedsheep.shuttletracker.json;

import java.util.ArrayList;
import java.util.Collection;

public class VehicleArray extends ArrayList<MapJsonInputToArray> {
	private static final long serialVersionUID = -9188505525348827268L;

	public VehicleArray() {
	}

	public VehicleArray(int capacity) {
		super(capacity);
	}

	public VehicleArray(Collection<? extends MapJsonInputToArray> collection) {
		super(collection);
	}

}
