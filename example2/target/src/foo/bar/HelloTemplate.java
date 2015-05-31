// Autogenerated Jamon proxy
// /Users/jay/jamon/trunk/doc/target/www/example2/templates/foo/bar/HelloTemplate.jamon

package foo.bar;


@org.jamon.annotations.Template(
  signature = "444FB20C044E49535A42F6B656F1E525",
  requiredArguments = {
    @org.jamon.annotations.Argument(name = "formFields", type = "HelloFormFields")},
  optionalArguments = {
    @org.jamon.annotations.Argument(name = "errors", type = "HelloFormFields.ValidationErrors"),
    @org.jamon.annotations.Argument(name = "num", type = "int")})
public class HelloTemplate
  extends org.jamon.AbstractTemplateProxy
{
  
  public HelloTemplate(org.jamon.TemplateManager p_manager)
  {
     super(p_manager);
  }
  
  public HelloTemplate()
  {
     super("/foo/bar/HelloTemplate");
  }
  
  protected interface Intf
    extends org.jamon.AbstractTemplateProxy.Intf{
    
    void renderNoFlush(final java.io.Writer jamonWriter) throws java.io.IOException;
    
  }
  public static class ImplData
    extends org.jamon.AbstractTemplateProxy.ImplData
  {
    // 3, 3
    public void setFormFields(HelloFormFields formFields)
    {
      // 3, 3
      m_formFields = formFields;
    }
    public HelloFormFields getFormFields()
    {
      return m_formFields;
    }
    private HelloFormFields m_formFields;
    // 4, 3
    public void setErrors(HelloFormFields.ValidationErrors errors)
    {
      // 4, 3
      m_errors = errors;
      m_errors__IsNotDefault = true;
    }
    public HelloFormFields.ValidationErrors getErrors()
    {
      return m_errors;
    }
    private HelloFormFields.ValidationErrors m_errors;
    public boolean getErrors__IsNotDefault()
    {
      return m_errors__IsNotDefault;
    }
    private boolean m_errors__IsNotDefault;
    // 2, 3
    public void setNum(int num)
    {
      // 2, 3
      m_num = num;
      m_num__IsNotDefault = true;
    }
    public int getNum()
    {
      return m_num;
    }
    private int m_num;
    public boolean getNum__IsNotDefault()
    {
      return m_num__IsNotDefault;
    }
    private boolean m_num__IsNotDefault;
  }
  @Override
  protected ImplData makeImplData()
  {
    return new ImplData();
  }
  @Override @SuppressWarnings("unchecked") public ImplData getImplData()
  {
    return (ImplData) super.getImplData();
  }
  
  protected HelloFormFields.ValidationErrors errors;
  public final foo.bar.HelloTemplate setErrors(HelloFormFields.ValidationErrors p_errors)
  {
    (getImplData()).setErrors(p_errors);
    return this;
  }
  
  protected int num;
  public final foo.bar.HelloTemplate setNum(int p_num)
  {
    (getImplData()).setNum(p_num);
    return this;
  }
  
  
  @Override
  public org.jamon.AbstractTemplateImpl constructImpl(Class<? extends org.jamon.AbstractTemplateImpl> p_class){
    try
    {
      return p_class
        .getConstructor(new Class [] { org.jamon.TemplateManager.class, ImplData.class })
        .newInstance(new Object [] { getTemplateManager(), getImplData()});
    }
    catch (RuntimeException e)
    {
      throw e;
    }
    catch (Exception e)
    {
      throw new RuntimeException(e);
    }
  }
  
  @Override
  protected org.jamon.AbstractTemplateImpl constructImpl(){
    return new HelloTemplateImpl(getTemplateManager(), getImplData());
  }
  public org.jamon.Renderer makeRenderer(final HelloFormFields formFields)
  {
    return new org.jamon.AbstractRenderer() {
      @Override
      public void renderTo(final java.io.Writer jamonWriter)
        throws java.io.IOException
      {
        render(jamonWriter, formFields);
      }
    };
  }
  
  public void render(final java.io.Writer jamonWriter, final HelloFormFields formFields)
    throws java.io.IOException
  {
    renderNoFlush(jamonWriter, formFields);
    jamonWriter.flush();
  }
  public void renderNoFlush(final java.io.Writer jamonWriter, final HelloFormFields formFields)
    throws java.io.IOException
  {
    ImplData implData = getImplData();
    implData.setFormFields(formFields);
    Intf instance = (Intf) getTemplateManager().constructImpl(this);
    instance.renderNoFlush(jamonWriter);
    reset();
  }
  
  
}