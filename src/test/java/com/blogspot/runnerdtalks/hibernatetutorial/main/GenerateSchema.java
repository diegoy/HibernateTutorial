package com.blogspot.runnerdtalks.hibernatetutorial.main;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

public class GenerateSchema {

	public static void main( String[] args )
    {
    	//Le o hibernate.cfg.xml
    	AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
    	annotationConfiguration.configure();
    	
    	SchemaExport se = new SchemaExport(annotationConfiguration);
    	se.create(true, true);
    	
    }
	
}
