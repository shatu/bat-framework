/**
 * (C) Copyright 2012-2013 A-cube lab - Università di Pisa - Dipartimento di Informatica. 
 * BAT-Framework is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 * BAT-Framework is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License along with BAT-Framework.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.unipi.di.acube.batframework.problems;

import it.unipi.di.acube.batframework.data.ScoredTag;
import it.unipi.di.acube.batframework.utils.AnnotationException;

import java.util.HashSet;

/**
 * A system that tags parts of a natural language text to Wikipedia concepts, assigning a score to the concepts
 * representing the likelihood that the tag is correct.
 *
 */
public interface Sc2WSystem extends C2WSystem  {

	public HashSet<ScoredTag> solveSc2W(String text) throws AnnotationException;
	
}
