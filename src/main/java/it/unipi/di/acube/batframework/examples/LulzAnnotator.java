/**
 * (C) Copyright 2012-2013 A-cube lab - Università di Pisa - Dipartimento di Informatica. 
 * BAT-Framework is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * BAT-Framework is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with BAT-Framework.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.unipi.di.acube.batframework.examples;

import java.util.Calendar;
import java.util.HashSet;

import it.unipi.di.acube.batframework.data.Annotation;
import it.unipi.di.acube.batframework.data.Mention;
import it.unipi.di.acube.batframework.data.Tag;
import it.unipi.di.acube.batframework.problems.A2WSystem;
import it.unipi.di.acube.batframework.utils.AnnotationException;
import it.unipi.di.acube.batframework.utils.ProblemReduction;

public class LulzAnnotator implements A2WSystem{
	private long lastTime = -1;

	@Override
	public HashSet<Annotation> solveA2W(String text) throws AnnotationException {
		lastTime = Calendar.getInstance().getTimeInMillis();
		HashSet<Annotation> result = this.retrieveResult(text);
		lastTime = Calendar.getInstance().getTimeInMillis() - lastTime;
		return result;
	}

	@Override
	public HashSet<Tag> solveC2W(String text) throws AnnotationException {
		HashSet<Annotation> tags = solveA2W(text);
		return ProblemReduction.A2WToC2W(tags);
	}

	@Override
	public HashSet<Annotation> solveD2W(String text, HashSet<Mention> mentions){
		return null;
	}

	@Override
	public String getName() {
		return "<Name of the system>";
	}

	@Override
	public long getLastAnnotationTime() {
		return lastTime;
	}

	private HashSet<Annotation> retrieveResult(String text) {
		return null;
	}
}
