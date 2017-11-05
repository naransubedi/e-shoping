 <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
      <div class="container">
        <a class="navbar-brand" href="<c:url value='/home'/>">Online Shoping</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item" id="about">
              <a class="nav-link" href="<c:url value='/about'/>">About</a>
            </li>
            <li class="nav-item" id="products">
              <a class="nav-link" href="<c:url value='/allProducts'/>">My Product</a>
            </li>
            <li class="nav-item" id="contact">
              <a class="nav-link" href="<c:url value='/contact'/>">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>