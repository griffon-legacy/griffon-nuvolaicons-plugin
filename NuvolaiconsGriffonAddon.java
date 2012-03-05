/*
 * griffon-nuvola: Nuvola icons Griffon plugin
 * Copyright 2010 and beyond, Andres Almiray
 *
 * griffon-nuvola is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

import griffon.util.ApplicationHolder;
import griffon.plugins.nuvola.NuvolaIconFactory;
import org.codehaus.griffon.runtime.core.AbstractGriffonAddon;

/**
 * @author Andres Almiray
 */
public class NuvolaiconsGriffonAddon extends AbstractGriffonAddon {
    public NuvolaiconsGriffonAddon() {
        super(ApplicationHolder.getApplication());
        factories.put("nuvolaIcon", new NuvolaIconFactory());
    }
}
