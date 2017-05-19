import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url '/v1/payments/1/status'
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 200
        body("""{"approved":true}""")
        headers {
            contentType(applicationJson())
        }
    }
}