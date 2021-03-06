package org.develnext.jphp.core.ext;

import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class CompilerExtension extends Extension {
    @Override
    public String getVersion() {
        return "~";
    }

    @Override
    public void onRegister(CompileScope scope) {
        registerFunctions(new EvalFunctions());
    }
}
