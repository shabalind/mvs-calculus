  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v7: [Double] = [v1, v1, v1, v1, v1]
    let v10: Double = v7[2]
    let v11: Double = v7[4]
    var v9: Double = v11
    var v13: Double = v1
    let v29: [Double] = [v13, v11, v10, v11, v11, v1]
    var v18: [Double] = v29
    let v15: [[Double]] = [v29, v29, v18, v18, v18, v18]
    v18[4] = v9
    v18[0] = v13
    v18[4] = v13
    let v35: [Double] = v15[0]
    var v26: [Double] = v35
    v26 = v35
    let v46: Double = v26[1]
    return v46
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])
    let v1: Double = 5.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 5.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
