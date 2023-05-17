package Lab3;

import java.lang.reflect.Method;

public class Saver {
  public String save(Object o) {
    StringBuilder xmlBuilder = new StringBuilder();
    generateXML(o, xmlBuilder);
    return xmlBuilder.toString();
  }

  private void generateXML(Object o, StringBuilder xmlBuilder) {
    Class<?> clazz = o.getClass();
    Element elementAnnotation = clazz.getAnnotation(Element.class);

    if (elementAnnotation == null) {
      throw new IllegalArgumentException("Missing @Element annotation on class " + clazz.getSimpleName());
    }

    String tagName = elementAnnotation.name();
    xmlBuilder.append("<").append(tagName);

    Method[] methods = clazz.getMethods();
    for (Method method : methods) {
      if (method.isAnnotationPresent(ElementField.class)) {
        ElementField fieldAnnotation = method.getAnnotation(ElementField.class);
        String fieldName = fieldAnnotation.name();

        try {
          Object value = method.invoke(o);
          xmlBuilder.append(" ").append(fieldName).append("=\"").append(value).append("\"");
        } catch (Exception e) {
          e.printStackTrace();
        }
      } else if (method.isAnnotationPresent(SubElements.class)) {
        SubElements subElementsAnnotation = method.getAnnotation(SubElements.class);
        String subElementsName = subElementsAnnotation.name();

        try {
          Object[] subElements = (Object[]) method.invoke(o);
          xmlBuilder.append(">").append("\n");

          for (Object subElement : subElements) {
            generateXML(subElement, xmlBuilder);
          }

          xmlBuilder.append("</").append(subElementsName).append(">").append("\n");
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }

    xmlBuilder.append("/>").append("\n");
  }
}
