  import Dispatch
  func f17(_ v0: Double) -> Double {
    var v2: Double = v0
    var v6: Double = v2
    v2 = v6
    let v1: Double = v6 * v6
    var v4: Double = v1
    var v3: Double = v4
    var v21: Double = v3
    return v21
  }
  @inline(never)
  func f0(_ v0: Double) -> Double {
    var v7: Double = v0
    var v1: Double = v0
    var v5: Double = v7
    var v10: Double = v5
    var v9: Double = v1
    v5 = v10
    var v23: Double = v1
    let v30: Double = f17(v23)
    let v15: Double = f17(v9)
    let v73: [Double] = [v5, v10]
    v1 = v10
    var v107: [Double] = v73
    v107[0] = v15
    var v172: Double = v30
    var v93: [Double] = v107
    let v79: Double = v93[0]
    v10 = v30
    v93[1] = v172
    return v79
  }
  func benchmark() {
    let v0: Double = 0.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 0.0
    for _ in 1...1000 {
      result = f0(v0)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
