package com.compiler.com;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;

import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class CompilerExample {

	public static void main(String[] args) throws URISyntaxException, IOException {
		JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
		DiagnosticCollector<JavaFileObject> diagnosticCollector = new DiagnosticCollector<>();
		StandardJavaFileManager standardFileManager = systemJavaCompiler.getStandardFileManager(diagnosticCollector,
				null, null);
		final File file = new File(CompilerExample.class.getResource("/CompilerExample.java").toURI());
		final Iterable<? extends JavaFileObject> sources = standardFileManager
				.getJavaFileObjectsFromFiles(Arrays.asList(file));
		final CompilationTask task = systemJavaCompiler.getTask(null, standardFileManager, diagnosticCollector, null,
				null, sources);
		task.call();
		standardFileManager.close();

	}

}
