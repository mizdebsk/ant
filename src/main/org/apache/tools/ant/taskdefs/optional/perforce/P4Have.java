/* 
 * Copyright  2000-2004 Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * 
 */
/*
 * Portions of this software are based upon public domain software
 * originally written at the National Center for Supercomputing Applications,
 * University of Illinois, Urbana-Champaign.
 */

package org.apache.tools.ant.taskdefs.optional.perforce;

import org.apache.tools.ant.BuildException;


/** Lists Perforce files currently on client.
 *
 * P4Have simply dumps the current file version info into
 * the Ant log (or stdout).
 * @author <A HREF="mailto:leslie.hughes@rubus.com">Les Hughes</A>
 *
 * @ant.task category="scm"
 */
public class P4Have extends P4Base {

    /**
     * Execute the Perforce <code>have</code> command.
     *
     * @throws BuildException if the command cannot be executed.
     */
    public void execute() throws BuildException {
        execP4Command("have " + P4CmdOpts + " " + P4View, new SimpleP4OutputHandler(this));
    }
}
