package org.jenkinsci.plugins.database.h2.Sample;

def f = namespace(lib.FormTagLib)

f.section(title:"Database Configuration Example") {
    f.dropdownDescriptorSelector(field:"database",title:_("Database"))
}
