/**
 * (C) Copyright 2012-2013 A-cube lab - Università di Pisa - Dipartimento di Informatica. 
 * BAT-Framework is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * BAT-Framework is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with BAT-Framework.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.unipi.di.acube.batframework.metrics;

import it.unipi.di.acube.batframework.data.Mention;

import java.util.*;

public class WeakMentionMatch implements MatchRelation<Mention>{
	@Override
	public boolean match(Mention t1, Mention t2) {
			return t1.overlaps(t2);
	}

	@Override
	public List<HashSet<Mention>> preProcessOutput(List<HashSet<Mention>> computedOutput) {
		return computedOutput;
	}

	@Override
	public List<HashSet<Mention>> preProcessGoldStandard(List<HashSet<Mention>> goldStandard) {
		return goldStandard;
	}

	@Override
	public String getName() {
		return "Weak Mention match";
	}
}
