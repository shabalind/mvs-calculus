  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    let v5: [Double] = [v2, v2, v2, v2]
    var v11: [Double] = v5
    var v3: Double = v2
    v11[0] = v2
    let v6: Double = v11[2]
    v11[1] = v6
    v11[2] = v6
    let v22: [[Double]] = [v5, v11, v5]
    var v59: [[Double]] = v22
    v11[0] = v3
    var v51: [[Double]] = v22
    v51[0] = v11
    let v76: [Double] = v51[0]
    let v74: [Double] = v59[1]
    let v58: Double = v74[3]
    v59[2] = v76
    return v58
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0]]
    let v2: Double = 2.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 2.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
