

node('cicd-build'){

stage("Checkout"){
        scmCheckout{
        deleteWorkspace = 'false'
        }
    }

stage("Package App"){
        javaPackageApp{
        goals ="clean build jar -x test --refresh-dependencies"
        }
}



}