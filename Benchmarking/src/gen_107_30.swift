  import Dispatch
  @inline(never)
  func f0(_ v0: [[Double]], _ v1: [[Double]], _ v2: Double) -> Double {
    let v5: [Double] = v0[1]
    let v8: [Double] = v0[0]
    let v25: Double = v5[0]
    let v31: Double = v2 - v25
    let v36: Double = v8[0]
    let v42: Double = v5[0]
    let v34: [Double] = [v25, v31, v36]
    var v62: [Double] = v34
    let v78: Double = v62[2]
    let v134: Double = v34[2]
    var v87: Double = v78
    let v122: Double = v134 * v42
    let v288: Double = v122 + v87
    return v288
  }
  func benchmark() {
    let v0: [[Double]] = [[0.0], [1.0]]
    let v1: [[Double]] = [[2.0]]
    let v2: Double = 3.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 3.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
