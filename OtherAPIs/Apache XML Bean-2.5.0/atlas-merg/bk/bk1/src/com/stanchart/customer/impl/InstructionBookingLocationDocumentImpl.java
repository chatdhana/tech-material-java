/*
 * An XML document type.
 * Localname: instructionBookingLocation
 * Namespace: 
 * Java type: com.stanchart.customer.InstructionBookingLocationDocument
 *
 * Automatically generated - do not modify.
 */
package com.stanchart.customer.impl;
/**
 * A document containing one instructionBookingLocation(@) element.
 *
 * This is a complex type.
 */
public class InstructionBookingLocationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.InstructionBookingLocationDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstructionBookingLocationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTRUCTIONBOOKINGLOCATION$0 = 
        new javax.xml.namespace.QName("", "instructionBookingLocation");
    
    
    /**
     * Gets the "instructionBookingLocation" element
     */
    public com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation getInstructionBookingLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation target = null;
            target = (com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation)get_store().find_element_user(INSTRUCTIONBOOKINGLOCATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "instructionBookingLocation" element
     */
    public void setInstructionBookingLocation(com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation instructionBookingLocation)
    {
        generatedSetterHelperImpl(instructionBookingLocation, INSTRUCTIONBOOKINGLOCATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "instructionBookingLocation" element
     */
    public com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation addNewInstructionBookingLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation target = null;
            target = (com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation)get_store().add_element_user(INSTRUCTIONBOOKINGLOCATION$0);
            return target;
        }
    }
    /**
     * An XML instructionBookingLocation(@).
     *
     * This is a complex type.
     */
    public static class InstructionBookingLocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.stanchart.customer.InstructionBookingLocationDocument.InstructionBookingLocation
    {
        private static final long serialVersionUID = 1L;
        
        public InstructionBookingLocationImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName BOOKINGLOCATIONID$0 = 
            new javax.xml.namespace.QName("", "bookingLocationId");
        private static final javax.xml.namespace.QName BOOKINGLOCATIONCOUNTRY$2 = 
            new javax.xml.namespace.QName("", "bookingLocationCountry");
        private static final javax.xml.namespace.QName BOOKINGLOCATIONORGANIZATION$4 = 
            new javax.xml.namespace.QName("", "bookingLocationOrganization");
        
        
        /**
         * Gets the "bookingLocationId" element
         */
        public java.lang.String getBookingLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGLOCATIONID$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bookingLocationId" element
         */
        public org.apache.xmlbeans.XmlString xgetBookingLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGLOCATIONID$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "bookingLocationId" element
         */
        public boolean isSetBookingLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOOKINGLOCATIONID$0) != 0;
            }
        }
        
        /**
         * Sets the "bookingLocationId" element
         */
        public void setBookingLocationId(java.lang.String bookingLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGLOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOKINGLOCATIONID$0);
                }
                target.setStringValue(bookingLocationId);
            }
        }
        
        /**
         * Sets (as xml) the "bookingLocationId" element
         */
        public void xsetBookingLocationId(org.apache.xmlbeans.XmlString bookingLocationId)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGLOCATIONID$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOOKINGLOCATIONID$0);
                }
                target.set(bookingLocationId);
            }
        }
        
        /**
         * Unsets the "bookingLocationId" element
         */
        public void unsetBookingLocationId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOOKINGLOCATIONID$0, 0);
            }
        }
        
        /**
         * Gets the "bookingLocationCountry" element
         */
        public java.lang.String getBookingLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGLOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bookingLocationCountry" element
         */
        public org.apache.xmlbeans.XmlString xgetBookingLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGLOCATIONCOUNTRY$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "bookingLocationCountry" element
         */
        public boolean isSetBookingLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOOKINGLOCATIONCOUNTRY$2) != 0;
            }
        }
        
        /**
         * Sets the "bookingLocationCountry" element
         */
        public void setBookingLocationCountry(java.lang.String bookingLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGLOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOKINGLOCATIONCOUNTRY$2);
                }
                target.setStringValue(bookingLocationCountry);
            }
        }
        
        /**
         * Sets (as xml) the "bookingLocationCountry" element
         */
        public void xsetBookingLocationCountry(org.apache.xmlbeans.XmlString bookingLocationCountry)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGLOCATIONCOUNTRY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOOKINGLOCATIONCOUNTRY$2);
                }
                target.set(bookingLocationCountry);
            }
        }
        
        /**
         * Unsets the "bookingLocationCountry" element
         */
        public void unsetBookingLocationCountry()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOOKINGLOCATIONCOUNTRY$2, 0);
            }
        }
        
        /**
         * Gets the "bookingLocationOrganization" element
         */
        public java.lang.String getBookingLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGLOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "bookingLocationOrganization" element
         */
        public org.apache.xmlbeans.XmlString xgetBookingLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGLOCATIONORGANIZATION$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "bookingLocationOrganization" element
         */
        public boolean isSetBookingLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BOOKINGLOCATIONORGANIZATION$4) != 0;
            }
        }
        
        /**
         * Sets the "bookingLocationOrganization" element
         */
        public void setBookingLocationOrganization(java.lang.String bookingLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKINGLOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOKINGLOCATIONORGANIZATION$4);
                }
                target.setStringValue(bookingLocationOrganization);
            }
        }
        
        /**
         * Sets (as xml) the "bookingLocationOrganization" element
         */
        public void xsetBookingLocationOrganization(org.apache.xmlbeans.XmlString bookingLocationOrganization)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKINGLOCATIONORGANIZATION$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOOKINGLOCATIONORGANIZATION$4);
                }
                target.set(bookingLocationOrganization);
            }
        }
        
        /**
         * Unsets the "bookingLocationOrganization" element
         */
        public void unsetBookingLocationOrganization()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BOOKINGLOCATIONORGANIZATION$4, 0);
            }
        }
    }
}
