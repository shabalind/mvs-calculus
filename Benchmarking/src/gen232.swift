  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [s0]
    var p1: [s0]
  }
  func f2(_ v0: Double) -> Double {
    var v3: Double = v0
    var v6: Double = v0
    v6 = v0
    v3 = v6
    let v2: Double = v0 + v6
    var v5: Double = v3
    let v8: Double = v3 / v2
    var v9: Double = v3
    let v23: Double = v5 + v8
    var v18: Double = v5
    var v31: Double = v23
    var v15: Double = v31
    var v57: Double = v3
    var v19: Double = v15
    v31 = v57
    let v27: [Double] = [v23]
    v15 = v6
    v57 = v5
    var v43: Double = v18
    let v60: [Double] = [v15, v0, v23, v8]
    let v52: Double = v60[0]
    var v42: [Double] = v27
    v42[0] = v57
    let v70: [[Double]] = [v42, v42, v27, v27, v42]
    v42[0] = v19
    v42[0] = v52
    v42[0] = v43
    let v162: [Double] = v70[0]
    var v164: [Double] = v162
    v164[0] = v9
    let v92: Double = v164[0]
    return v92
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s2, _ v2: Double) -> Double {
    let v4: Double = f2(v2)
    let v3: Double = f2(v2)
    var v6: Double = v4
    let v10: Double = f2(v3)
    let v86: Double = f2(v10)
    let v92: Double = v86 + v6
    return v92
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: s2 = s2(p0: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]]), s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])], p1: [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]]), s0(p0: [[20.0], [21.0], [22.0]], p1: [[23.0]])])
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
