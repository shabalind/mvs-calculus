  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s5 {
    var p0: s0
    var p1: [[s0]]
  }
  func f23(_ v0: s5) -> s5 {
    var v3: s5 = v0
    let v1: [[s0]] = v0.p1
    v3.p1 = v1
    let v2: [s0] = v1[0]
    let v5: [s0] = v1[0]
    var v4: [[s0]] = v1
    v3.p1 = v1
    v3.p1 = v4
    let v18: s0 = v2[0]
    let v6: [[Double]] = v18.p0
    v4[0] = v5
    v3.p0 = v18
    v4[1] = v2
    var v23: [s0] = v5
    let v56: [[s0]] = v3.p1
    v3.p1 = v1
    v3.p1 = v56
    v23[0] = v18
    let v20: [[Double]] = v18.p1
    var v24: s5 = v0
    let v52: s0 = s0(p0: v6, p1: v20)
    v23[0] = v52
    var v51: [s0] = v23
    v3 = v0
    var v46: [s0] = v51
    v4[1] = v23
    v4[0] = v23
    let v76: s0 = v46[0]
    var v109: s5 = v3
    let v86: [s5] = [v109, v24, v0]
    var v62: [s0] = v5
    let v183: s0 = v62[0]
    v24.p0 = v76
    v51[0] = v183
    v24.p0 = v183
    let v61: s5 = v86[0]
    return v61
  }
  @inline(never)
  func f0(_ v0: [[s5]], _ v1: Double) -> Double {
    let v3: [s5] = v0[0]
    let v5: s5 = v3[0]
    let v4: s5 = f23(v5)
    let v29: s0 = v4.p0
    let v21: [[Double]] = v29.p0
    var v70: [[Double]] = v21
    var v38: Double = v1
    let v49: Double = v38 / v1
    let v31: [Double] = v70[1]
    var v50: [Double] = v31
    v50[0] = v49
    let v78: Double = v31[0]
    let v40: Double = v78 - v1
    v70[1] = v50
    v50[0] = v1
    var v46: Double = v40
    v50[0] = v1
    return v46
  }
  func benchmark() {
    let v0: [[s5]] = [[s5(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0]]), p1: [[s0(p0: [[5.0], [6.0], [7.0]], p1: [[8.0], [9.0]])], [s0(p0: [[10.0], [11.0], [12.0]], p1: [[13.0], [14.0]])]])]]
    let v1: Double = 15.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 15.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
