package com.devexperts.timetest.test;

/*
 * #%L
 * test
 * %%
 * Copyright (C) 2015 - 2016 Devexperts, LLC
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import com.devexperts.timetest.DummyTimeProvider;
import org.junit.After;
import org.junit.Test;

/**
 * Tests for {@link com.devexperts.timetest.DummyTimeProvider}.
 */
public class DummyTimeProviderTest {

    @After
    public void tearDown() {
        DummyTimeProvider.reset();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowExceptionOnTimeMillis() {
        DummyTimeProvider.start();
        System.currentTimeMillis();
    }

}
