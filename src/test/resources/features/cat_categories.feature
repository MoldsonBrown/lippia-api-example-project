Feature: Cat API
  COMO usuario de CAT API
  DESEO obtener la lista de categorias
  PARA mostrar las mismas

  @CatApi
  Scenario Outline: Obtengo la lista de categorias
    When realizo una peticion '<operation>' a '<entity>' al endpoint de categorias - '<request>'
    Then obtengo el status code '<statusCode>'
    And los datos son correctos
    @SuccessCat
    Examples:
      | request                   | statusCode | operation | entity     |
      | request/rq_cat_categories | 200        | GET       | CATEGORIES |
    @FailCat
    Examples:
      | request                   | statusCode | operation | entity     |
      | request/rq_cat_categories | 400        | GET       | CATEGORIES |

  @CatApi
  Scenario Outline: Analisis de imágenes
    When realizo una peticion '<operation>' a '<entity>' al endpoint de analisis - '<request>'
    Then obtengo el status code '<statusCode>'
    @AnalysisCat
    Examples:
      | request                   | statusCode | operation | entity     |
      | request/cat_analysis      | 401        | POST      | ANALYSIS   |


  @CatApi
  Scenario Outline: Request erróneo
    When realizo una peticion '<operation>' a '<entity>' al endpoint de Errores - '<request>'
    Then obtengo el status code '<statusCode>'
    @CatErrors
    Examples:
      | request                   | statusCode | operation | entity     |
      | request/cat_errors        | 400        | GET      | ERRORES    |