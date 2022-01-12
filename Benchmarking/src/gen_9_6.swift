  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: s1
  }
  struct s3 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s6 {
    var p0: s2
    var p1: s1
  }
  struct s10 {
    var p0: s6
    var p1: [[s2]]
  }
  func f65(_ v0: s10) -> s10 {
    var v7: s10 = v0
    var v39: s10 = v7
    return v39
  }
  func f36(_ v0: s10) -> s10 {
    let v5: [s10] = [v0, v0, v0, v0, v0]
    var v6: [s10] = v5
    let v9: s10 = v5[4]
    let v3: s10 = v5[0]
    let v10: s10 = f65(v3)
    v6[2] = v10
    let v23: s10 = v5[2]
    let v24: s10 = v6[4]
    v6[3] = v23
    v6[2] = v3
    v6[2] = v24
    v6[0] = v0
    v6[0] = v9
    let v61: s10 = v6[3]
    v6[3] = v61
    v6[4] = v0
    v6[1] = v61
    let v161: s10 = f65(v61)
    return v161
  }
  func f25(_ v0: s10, _ v1: Double) -> Double {
    let v4: s10 = f36(v0)
    let v6: s6 = v4.p0
    let v10: s2 = v6.p0
    let v9: s1 = v10.p0
    var v43: s1 = v9
    let v107: [s0] = v43.p1
    var v23: s1 = v43
    let v47: s0 = v23.p0
    v43.p1 = v107
    let v41: [[Double]] = v47.p0
    let v68: [Double] = v41[1]
    let v64: Double = v68[0]
    var v166: Double = v64
    var v161: Double = v166
    return v161
  }
  @inline(never)
  func f0(_ v0: s3, _ v1: [[s10]], _ v2: s2, _ v3: Double) -> Double {
    let v4: s0 = v0.p1
    var v5: Double = v3
    let v6: [s10] = v1[0]
    let v7: s10 = v6[0]
    var v8: Double = v5
    let v15: [[Double]] = v4.p0
    let v25: s10 = f65(v7)
    let v56: [Double] = v15[1]
    var v34: [Double] = v56
    v34[0] = v3
    v34[0] = v3
    var v31: [Double] = v34
    let v64: Double = v31[0]
    let v67: Double = v5 + v8
    v34[0] = v67
    let v83: Double = f25(v25, v64)
    return v83
  }
  func benchmark() {
    let v0: s3 = s3(p0: [[s0(p0: [[0.0], [1.0], [2.0]])], [s0(p0: [[3.0], [4.0], [5.0]])]], p1: s0(p0: [[6.0], [7.0], [8.0]]))
    let v1: [[s10]] = [[s10(p0: s6(p0: s2(p0: s1(p0: s0(p0: [[9.0], [10.0], [11.0]]), p1: [s0(p0: [[12.0], [13.0], [14.0]])]), p1: s1(p0: s0(p0: [[15.0], [16.0], [17.0]]), p1: [s0(p0: [[18.0], [19.0], [20.0]])])), p1: s1(p0: s0(p0: [[21.0], [22.0], [23.0]]), p1: [s0(p0: [[24.0], [25.0], [26.0]])])), p1: [[s2(p0: s1(p0: s0(p0: [[27.0], [28.0], [29.0]]), p1: [s0(p0: [[30.0], [31.0], [32.0]])]), p1: s1(p0: s0(p0: [[33.0], [34.0], [35.0]]), p1: [s0(p0: [[36.0], [37.0], [38.0]])]))]])], [s10(p0: s6(p0: s2(p0: s1(p0: s0(p0: [[39.0], [40.0], [41.0]]), p1: [s0(p0: [[42.0], [43.0], [44.0]])]), p1: s1(p0: s0(p0: [[45.0], [46.0], [47.0]]), p1: [s0(p0: [[48.0], [49.0], [50.0]])])), p1: s1(p0: s0(p0: [[51.0], [52.0], [53.0]]), p1: [s0(p0: [[54.0], [55.0], [56.0]])])), p1: [[s2(p0: s1(p0: s0(p0: [[57.0], [58.0], [59.0]]), p1: [s0(p0: [[60.0], [61.0], [62.0]])]), p1: s1(p0: s0(p0: [[63.0], [64.0], [65.0]]), p1: [s0(p0: [[66.0], [67.0], [68.0]])]))]])]]
    let v2: s2 = s2(p0: s1(p0: s0(p0: [[69.0], [70.0], [71.0]]), p1: [s0(p0: [[72.0], [73.0], [74.0]])]), p1: s1(p0: s0(p0: [[75.0], [76.0], [77.0]]), p1: [s0(p0: [[78.0], [79.0], [80.0]])]))
    let v3: Double = 81.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 81.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
