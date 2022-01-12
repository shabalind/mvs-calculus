  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    let v6: [[Double]] = v1.p0
    let v3: [[Double]] = v1.p0
    let v9: [[Double]] = v0.p1
    let v4: [Double] = v6[0]
    var v8: Double = v2
    let v18: [Double] = v9[1]
    let v12: [Double] = v3[0]
    var v19: Double = v2
    let v17: Double = v12[0]
    var v28: Double = v8
    v8 = v2
    let v25: Double = v19 * v2
    let v41: Double = v25 + v25
    let v29: Double = v18[0]
    let v38: Double = v4[0]
    let v45: [Double] = [v28, v41, v17, v38, v28, v29, v41]
    var v51: [Double] = v45
    let v59: [[Double]] = [v51, v51, v45, v45, v45]
    let v90: [Double] = v59[1]
    let v116: Double = v90[4]
    return v116
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]])
    let v1: s0 = s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])
    let v2: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
