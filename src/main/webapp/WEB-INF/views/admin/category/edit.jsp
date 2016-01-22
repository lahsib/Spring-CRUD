<%@include file="../header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
     <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Dashboard
            <small>it all starts here</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li><a href="#">Dashboard</a></li>
            <li class="active">Blank page</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">

          <!-- Default box -->
          <div class="box">
            <div class="box-header with-border">
              <h3 class="box-title">Add Category</h3>
                
            </div>
            <div class="box-body">
                
   
    <form:form modelAttribute="Category" action="${SITE_URL}/admin/category/save" method="post" role="form">
    <div class="form-group label-static">
        <label class="control-label">Name</label>
        <form:input path="catName"  placeholder="Enter Name" required="required" class="form-control"/>
    </div>
    <div class="form-group">
        <label>Description</label>
        <form:textarea path="description" placeholder="Enter Description" required="required"  class="form-control"/>
    </div> 
      
     <div class="checkbox">
        <label>
            <form:checkbox path="status" value="1"/> Status
        </label>
    </div>  
            <form:hidden path="catId"/>
    <button type="submit" class="btn btn-success"><i class="fa fa-floppy-o"></i>
Update</button>
    </form:form>  
            </div><!-- /.box-body -->
           <!-- <div class="box-footer">
              Footer
            </div> /.box-footer-->
          </div><!-- /.box -->

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
<%@include file="../footer.jsp" %>