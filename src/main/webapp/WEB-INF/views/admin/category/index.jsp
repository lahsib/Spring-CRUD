<%-- 
    Document   : index
    Created on : Jan 9, 2016, 12:21:12 PM
    Author     : Bishal
--%>

<%@include file="../header.jsp" %>
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
              <h3 class="box-title">Category</h3>
                <div class="pull-right">
                <p>
                    <a href="${SITE_URL}/admin/category/add" class="btn btn-primary btn-sm" title="Add Category">
                        <span class="glyphicon glyphicon-plus"></span>
                    </a>
                </p>
                </div>
            </div>
            <div class="box-body">
                <table class="table table-bordered table-striped table-hover">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Description</th>
                <th>Added Date</th>
                <th>Modified Date</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
           <c:forEach var="category" items="${category}">
                <tr>
                    <td>${category.catId}</td>
                    <td>${category.catName}</td>
                    <td>${category.description}</td>
                    <td>${category.addedDate}</td>
                    <td>${category.modifiedDate}<d_date/td>
                    <td>${category.status}</td>
                    <td>
                        <a href="${SITE_URL}/admin/category/edit/${category.catId}" class="btn btn-success btn-sm" title="Edit Course">
                            <span class="glyphicon glyphicon-pencil"></span>
                        </a>
                        <a href="${SITE_URL}/admin/category/delete/${category.catId}" class="btn btn-danger btn-sm" title="Delete Course">
                            <span class="glyphicon glyphicon-trash"></span>
                        </a>    
                    </td>
                </tr>
            </c:forEach>
               
        </table>    
            </div><!-- /.box-body -->
           <!-- <div class="box-footer">
              Footer
            </div> /.box-footer-->
          </div><!-- /.box -->

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

<%@include file="../footer.jsp" %>
