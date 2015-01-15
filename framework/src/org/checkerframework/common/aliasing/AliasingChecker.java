package org.checkerframework.common.aliasing;

import org.checkerframework.common.basetype.BaseTypeChecker;
import org.checkerframework.framework.qual.StubFiles;

/**
 * Aliasing type system -- used to identify expressions that definitely have
 * no aliases.
 */
@StubFiles({"android.astub"})
public class AliasingChecker extends BaseTypeChecker {
//    @Override
//    public void report(Result r, Object src) {
//    }
}