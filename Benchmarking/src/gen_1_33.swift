  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: Double) -> Double {
    let v3: [[Double]] = v0.p0
    let v4: [[Double]] = v0.p0
    var v5: Double = v1
    let v16: [Double] = v4[2]
    let v10: Double = v16[0]
    let v12: [Double] = v3[2]
    let v19: Double = v5 - v10
    let v11: Double = v12[0]
    let v63: Double = v19 - v11
    var v33: Double = v63
    let v130: Double = v12[0]
    let v137: Double = v33 * v130
    return v137
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]])
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
