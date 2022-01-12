  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f42(_ v0: Double) -> Double {
    var v4: Double = v0
    let v1: Double = v4 - v4
    var v6: Double = v4
    var v3: Double = v4
    var v9: Double = v4
    var v7: Double = v6
    var v5: Double = v3
    var v10: Double = v9
    var v11: Double = v0
    var v16: Double = v3
    var v8: Double = v10
    var v13: Double = v3
    var v21: Double = v11
    var v41: Double = v4
    let v19: Double = v16 - v7
    var v25: Double = v5
    var v70: Double = v41
    var v35: Double = v25
    var v23: Double = v1
    var v31: Double = v8
    var v53: Double = v31
    v4 = v53
    var v38: Double = v21
    let v51: [Double] = [v19]
    let v40: [[Double]] = [v51]
    let v66: [Double] = v40[0]
    var v43: [Double] = v66
    let v45: Double = v43[0]
    var v60: Double = v38
    var v88: [Double] = v43
    v88[0] = v9
    v88[0] = v23
    v43 = v88
    v88[0] = v13
    let v36: Double = v35 * v45
    v7 = v70
    v88[0] = v60
    v43[0] = v41
    var v71: Double = v36
    v43[0] = v38
    return v71
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v7: Double = v1 * v1
    var v3: Double = v7
    let v5: Double = f42(v3)
    var v57: Double = v5
    return v57
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]])]
    let v1: Double = 8.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 8.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
