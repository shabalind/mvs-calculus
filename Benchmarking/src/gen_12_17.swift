  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
    var p2: s0
    var p3: [Double]
  }
  func f5(_ v0: Double) -> Double {
    let v1: Double = v0 + v0
    var v7: Double = v1
    var v2: Double = v1
    var v10: Double = v0
    var v15: Double = v7
    var v4: Double = v15
    var v24: Double = v1
    let v6: [Double] = [v1, v24, v0, v10, v1, v0, v4]
    let v16: Double = v6[3]
    let v21: Double = v6[4]
    var v13: [Double] = v6
    v13[5] = v21
    let v28: [Double] = [v2]
    let v42: [[Double]] = [v28]
    let v14: Double = v13[0]
    let v30: [Double] = v42[0]
    v13[4] = v14
    v13[5] = v4
    var v66: [Double] = v13
    var v44: Double = v16
    v66[5] = v14
    let v46: Double = v66[6]
    let v95: Double = v66[6]
    v13[4] = v24
    v13[0] = v44
    v13[4] = v21
    let v98: [Double] = v42[0]
    var v55: [Double] = v98
    v55[0] = v95
    let v191: Double = v30[0]
    v55 = v28
    let v78: Double = v55[0]
    v13[3] = v95
    v55[0] = v46
    v66[1] = v10
    v66[4] = v191
    return v78
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v4: Double = f5(v1)
    let v21: Double = f5(v1)
    let v49: Double = v21 - v4
    let v54: Double = f5(v49)
    return v54
  }
  func benchmark() {
    let v0: s1 = s1(p0: [s0(p0: [0.0], p1: [[1.0], [2.0], [3.0]])], p1: [[s0(p0: [4.0], p1: [[5.0], [6.0], [7.0]])], [s0(p0: [8.0], p1: [[9.0], [10.0], [11.0]])], [s0(p0: [12.0], p1: [[13.0], [14.0], [15.0]])]], p2: s0(p0: [16.0], p1: [[17.0], [18.0], [19.0]]), p3: [20.0, 21.0, 22.0])
    let v1: Double = 23.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 23.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
