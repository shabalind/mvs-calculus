  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: [[Double]], _ v3: [[Double]], _ v4: [[Double]], _ v5: Double) -> Double {
    let v6: [Double] = v3[0]
    let v9: [Double] = v2[0]
    let v15: Double = v6[0]
    let v11: [Double] = v1[0]
    let v29: Double = v11[0]
    var v27: Double = v15
    let v19: Double = v29 / v27
    let v40: Double = v9[0]
    v27 = v15
    let v59: Double = v19 / v40
    return v59
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0]]
    let v1: [[Double]] = [[1.0]]
    let v2: [[Double]] = [[2.0]]
    let v3: [[Double]] = [[3.0]]
    let v4: [[Double]] = [[4.0], [5.0]]
    let v5: Double = 6.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 6.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
