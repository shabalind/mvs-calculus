  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f101(_ v0: s0) -> s0 {
    var v2: s0 = v0
    return v2
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [Double], _ v2: s0, _ v3: s0, _ v4: Double) -> Double {
    let v7: s0 = v0[0]
    let v8: Double = v4 / v4
    let v11: s0 = f101(v2)
    let v12: Double = v8 * v4
    let v20: [[Double]] = v11.p1
    let v21: [[Double]] = v7.p0
    let v41: Double = v1[1]
    var v30: [[Double]] = v20
    let v27: [Double] = v30[0]
    let v25: [Double] = v30[0]
    let v26: Double = v27[0]
    let v47: [Double] = v21[1]
    let v53: Double = v47[0]
    let v115: Double = v12 * v41
    v30[0] = v25
    var v78: [Double] = v1
    v30[0] = v27
    let v79: Double = v78[1]
    let v90: [Double] = [v26, v53, v53, v115, v41, v115, v79]
    let v127: Double = v90[2]
    return v127
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0]])]
    let v1: [Double] = [3.0, 4.0]
    let v2: s0 = s0(p0: [[5.0], [6.0]], p1: [[7.0]])
    let v3: s0 = s0(p0: [[8.0], [9.0]], p1: [[10.0]])
    let v4: Double = 11.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 11.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
