package br.com.pmattiollo.tradevalidationapi.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AssignableTypeFilter;

import br.com.pmattiollo.tradevalidationapi.event.ValidationEvent;

public class ReflectionsUtil {
	
//	public static final void invokeValidationsEvents(Object... arguments) {
//		List<?> instances = getInstancesByAbstractSuperClass(ValidationEvent.class, arguments);
//		
//		for (Object object : instances) {
//			ValidationEvent event = (ValidationEvent) object;
//			event.validate();
//		}
//	}
//	
//	public static final<T> void invokeValidationsEvents(Object... arguments) {
//		List<ValidationEvent> instances = getInstancesByAbstractSuperClass(ValidationEvent.class, arguments);
//		
//		for (ValidationEvent event : instances) {
//			event.validate();
//		}
//	}
	
	@SuppressWarnings("unchecked")
	public static final<T> List<T> getInstancesByAbstractSuperClass(Class<T> superClass, Object... arguments) {
		if (!Modifier.isAbstract(superClass.getModifiers())) {
			throw new IllegalArgumentException("Type " + superClass.getCanonicalName() + " is not an abstract class");
		}
		
		
		List<Class<?>> subclasses = getSubClassesBySuperClass(superClass, superClass.getPackage().getName());
		List<T> instances = new ArrayList<>();
		
		for (Class<?> clazz : subclasses) {
			instances.add((T) instanceBy(clazz, arguments));
		}
		
		return instances;
	}
	
	private static List<Class<?>> getSubClassesBySuperClass(Class<?> superClass, String packageDefinition) {
		List<Class<?>> subclasses = new ArrayList<>();
		
		try {
			ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
			provider.addIncludeFilter(new AssignableTypeFilter(superClass));
			
			Set<BeanDefinition> components = provider.findCandidateComponents(packageDefinition);
			for (BeanDefinition component : components) {
				subclasses.add(Class.forName(component.getBeanClassName()));
			}
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("No such subclasses found by superclass " + superClass, e);
		}
		
		return subclasses;
	}
	
	/**
     * Resolve the instance.
     *
     * @param clazz class to be instanced
     * @param arguments class construction params
     *
     * @return the instance
     */
    public static Object instanceBy(Class<?> clazz, Object... arguments) {
        Class<?>[] classes = new Class[arguments.length];
        try {
            for (int i = 0; i < classes.length; i++) {
                classes[i] = arguments[i].getClass();
            }

            Constructor<?> constructor = clazz.getConstructor(classes);
            return constructor.newInstance(arguments);
        } catch (Exception ex) {
            throw new IllegalArgumentException("Type " + clazz.getCanonicalName() + " no have a constructor with: " + classes, ex);
        }

    }

}
