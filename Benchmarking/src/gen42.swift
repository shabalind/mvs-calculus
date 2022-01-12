  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  func f92(_ v0: s0) -> s0 {
    let v1: [s0] = [v0, v0, v0, v0]
    let v7: s0 = v1[1]
    let v6: s0 = v1[0]
    let v4: s0 = v1[3]
    let v9: s0 = v1[3]
    let v14: [Double] = v9.p0
    let v13: Double = v14[1]
    var v18: Double = v13
    var v25: [s0] = v1
    let v22: s0 = v25[2]
    v25[1] = v4
    let v35: [Double] = v4.p0
    v25[2] = v22
    v25[3] = v6
    let v34: s0 = v1[2]
    let v36: s0 = v25[3]
    var v98: [Double] = v35
    v25[2] = v34
    let v83: [[Double]] = v6.p1
    var v57: s0 = v0
    let v84: [Double] = v57.p0
    let v55: [Double] = v7.p0
    var v71: s0 = v6
    let v117: s0 = v1[1]
    let v86: [Double] = v22.p0
    v25[3] = v71
    v71.p0 = v55
    var v67: [Double] = v35
    v67[1] = v18
    v71.p0 = v84
    var v113: s0 = v36
    v57.p0 = v67
    v113.p0 = v86
    v57.p0 = v98
    v57 = v117
    v71.p1 = v83
    return v113
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: Double) -> Double {
    var v6: s0 = v1
    let v3: [[Double]] = v1.p1
    let v5: s0 = f92(v6)
    let v16: [Double] = v1.p0
    let v12: [Double] = v3[2]
    v6.p0 = v16
    let v35: [Double] = v3[0]
    var v29: [[Double]] = v3
    let v30: [Double] = v3[1]
    let v23: [[Double]] = v5.p1
    var v47: [[Double]] = v29
    v47[2] = v12
    v47[1] = v35
    v6.p1 = v47
    v6.p1 = v3
    let v70: [Double] = v23[0]
    v29[1] = v30
    v6.p1 = v23
    let v87: [Double] = v29[1]
    let v51: Double = v70[0]
    v47[2] = v87
    v29[0] = v35
    v47[0] = v87
    return v51
  }
  func benchmark() {
    let v0: s0 = s0(p0: [0.0, 1.0], p1: [[2.0], [3.0], [4.0]])
    let v1: s0 = s0(p0: [5.0, 6.0], p1: [[7.0], [8.0], [9.0]])
    let v2: Double = 10.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 10.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
