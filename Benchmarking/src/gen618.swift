  import Dispatch
  struct s0 {
    var p0: [Double]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s1
    var p2: s0
  }
  func f78(_ v0: s2) -> s2 {
    var v7: s2 = v0
    var v2: s2 = v0
    var v8: s2 = v2
    var v1: s2 = v8
    let v6: s1 = v7.p1
    let v9: s0 = v6.p1
    var v3: s1 = v6
    v3.p0 = v9
    var v5: s0 = v9
    var v4: s0 = v9
    var v11: s0 = v4
    var v25: s1 = v3
    let v14: s0 = v8.p2
    v7.p2 = v14
    let v10: [Double] = v4.p0
    let v20: Double = v10[0]
    let v12: Double = v10[1]
    let v21: Double = v20 / v20
    v7.p2 = v11
    let v34: [[Double]] = v5.p1
    var v31: [Double] = v10
    var v15: s1 = v3
    let v26: [Double] = v9.p0
    let v19: [Double] = v34[0]
    v1.p2 = v5
    var v27: Double = v21
    v5.p0 = v26
    v31[1] = v21
    let v56: Double = v19[0]
    let v22: [[Double]] = v9.p1
    v31[1] = v20
    v31[1] = v12
    let v16: Double = v19[0]
    v7.p1 = v15
    let v36: [Double] = v9.p0
    v27 = v56
    v31[0] = v12
    v31[1] = v16
    var v84: s1 = v3
    let v29: s0 = v25.p0
    var v30: [Double] = v31
    let v73: s0 = v15.p0
    v5.p1 = v34
    let v50: s0 = s0(p0: v36, p1: v34)
    v25.p1 = v73
    let v94: s0 = v15.p1
    let v74: s0 = s0(p0: v30, p1: v22)
    let v63: s0 = v1.p2
    v5.p1 = v34
    var v127: s0 = v4
    v4 = v50
    v8.p2 = v29
    v3.p0 = v11
    v3.p0 = v63
    v15.p0 = v73
    let v117: [s1] = v0.p0
    let v109: s1 = v117[1]
    let v124: s2 = s2(p0: v117, p1: v84, p2: v127)
    v15.p0 = v94
    let v122: s0 = v109.p0
    let v79: [[Double]] = v29.p1
    v84.p0 = v74
    v11.p1 = v79
    v31[0] = v27
    v11 = v122
    return v124
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v2: s2 = v0
    let v6: s2 = f78(v2)
    let v12: s1 = v6.p1
    var v8: s1 = v12
    let v10: s0 = v8.p1
    let v18: [Double] = v10.p0
    v8.p1 = v10
    v8.p1 = v10
    let v66: Double = v18[0]
    return v66
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s1(p0: s0(p0: [0.0, 1.0], p1: [[2.0], [3.0]]), p1: s0(p0: [4.0, 5.0], p1: [[6.0], [7.0]])), s1(p0: s0(p0: [8.0, 9.0], p1: [[10.0], [11.0]]), p1: s0(p0: [12.0, 13.0], p1: [[14.0], [15.0]]))], p1: s1(p0: s0(p0: [16.0, 17.0], p1: [[18.0], [19.0]]), p1: s0(p0: [20.0, 21.0], p1: [[22.0], [23.0]])), p2: s0(p0: [24.0, 25.0], p1: [[26.0], [27.0]]))
    let v1: Double = 28.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 28.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
