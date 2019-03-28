/*
 * Copyright (C) 2015 by Array Systems Computing Inc. http://www.array.ca
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option)
 * any later version.
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, see http://www.gnu.org/licenses/
 */
package e.g.esa.snap.dataio.iceye;

import e.g.org.esa.snap.dataio.iceye.IceyeProductReaderPlugIn;
import org.esa.snap.core.dataio.ProductReader;
import org.esa.snap.engine_utilities.gpf.TestProcessor;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;


/**
 * @author Ahmad Hamouda
 */
public class TestIceyeReader {

    private IceyeProductReaderPlugIn readerPlugin;
    private ProductReader reader;

    private String[] exceptionExemptions = {"not supported"};

    public TestIceyeReader() {
        readerPlugin = new IceyeProductReaderPlugIn();
        reader = readerPlugin.createReaderInstance();
    }

    /**
     * Open all files in a folder recursively
     *
     * @throws Exception anything
     */
    @Test
    public void testOpenAll() {
        TestProcessor testProcessor = new TestProcessor(100, 100, 100, 100, 1, true, false);

        File file = new File("/home/ahmad/Documents/Projects/snap/test");
        File[] folderPaths = new File[1];
        folderPaths[0] = file;
        try {
            testProcessor.recurseReadFolder(this, folderPaths, readerPlugin, reader, null, exceptionExemptions);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
