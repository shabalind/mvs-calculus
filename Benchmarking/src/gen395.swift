  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s0]
    var p1: [s1]
  }
  struct s6 {
    var p0: [[s1]]
    var p1: [s2]
  }
  func f25(_ v0: Double) -> Double {
    var v5: Double = v0
    let v7: Double = v0 * v5
    let v6: Double = v7 + v7
    var v1: Double = v5
    var v2: Double = v7
    var v10: Double = v5
    var v8: Double = v10
    var v4: Double = v2
    var v13: Double = v0
    var v9: Double = v2
    let v12: Double = v6 - v7
    var v25: Double = v12
    var v14: Double = v1
    var v16: Double = v8
    var v19: Double = v13
    let v43: Double = v25 / v9
    var v21: Double = v13
    var v22: Double = v16
    var v34: Double = v5
    var v20: Double = v6
    var v24: Double = v34
    var v11: Double = v14
    var v28: Double = v2
    var v17: Double = v28
    var v47: Double = v4
    var v27: Double = v7
    v10 = v2
    var v39: Double = v47
    v14 = v24
    var v57: Double = v27
    var v52: Double = v6
    var v90: Double = v21
    let v66: Double = v20 + v19
    let v101: [Double] = [v52, v25, v13, v57]
    var v73: [Double] = v101
    let v78: Double = v101[0]
    let v68: Double = v73[0]
    v73[2] = v66
    v73[2] = v68
    v73[3] = v43
    let v245: [Double] = [v78, v90, v21, v17, v14, v22, v11]
    var v111: [Double] = v245
    v27 = v39
    let v71: Double = v73[0]
    v1 = v71
    var v160: [Double] = v111
    let v122: [[Double]] = [v245, v160, v160, v111, v111, v111, v111]
    let v115: [Double] = v122[4]
    v160[6] = v6
    v25 = v27
    let v150: Double = v115[2]
    v111[4] = v6
    return v150
  }
  @inline(never)
  func f0(_ v0: s6, _ v1: Double) -> Double {
    var v6: Double = v1
    let v13: Double = f25(v6)
    return v13
  }
  func benchmark() {
    let v0: s6 = s6(p0: [[s1(p0: s0(p0: 0.0, p1: [[1.0]]), p1: s0(p0: 2.0, p1: [[3.0]]))], [s1(p0: s0(p0: 4.0, p1: [[5.0]]), p1: s0(p0: 6.0, p1: [[7.0]]))]], p1: [s2(p0: [s0(p0: 8.0, p1: [[9.0]]), s0(p0: 10.0, p1: [[11.0]])], p1: [s1(p0: s0(p0: 12.0, p1: [[13.0]]), p1: s0(p0: 14.0, p1: [[15.0]]))]), s2(p0: [s0(p0: 16.0, p1: [[17.0]]), s0(p0: 18.0, p1: [[19.0]])], p1: [s1(p0: s0(p0: 20.0, p1: [[21.0]]), p1: s0(p0: 22.0, p1: [[23.0]]))]), s2(p0: [s0(p0: 24.0, p1: [[25.0]]), s0(p0: 26.0, p1: [[27.0]])], p1: [s1(p0: s0(p0: 28.0, p1: [[29.0]]), p1: s0(p0: 30.0, p1: [[31.0]]))])])
    let v1: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
