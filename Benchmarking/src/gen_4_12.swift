  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [[s0]]
    var p1: s0
  }
  struct s2 {
    var p0: s1
    var p1: [[Double]]
  }
  struct s4 {
    var p0: Double
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    var v4: s2 = v0
    let v6: [[Double]] = v4.p1
    let v2: s1 = v0.p0
    let v3: [[s0]] = v2.p0
    let v11: [[Double]] = v4.p1
    let v8: s1 = v4.p0
    let v12: [Double] = v6[0]
    v4.p1 = v11
    let v9: [s2] = [v0, v0]
    var v15: [Double] = v12
    v15 = v12
    let v14: s0 = v8.p1
    let v21: Double = v1 + v1
    let v18: [s0] = v3[0]
    v4.p0 = v8
    v4.p0 = v2
    var v20: [s0] = v18
    let v24: Double = v15[0]
    let v28: s2 = v9[0]
    let v29: Double = v15[0]
    let v30: s0 = v20[0]
    var v25: Double = v29
    let v23: Double = v25 * v21
    let v43: s1 = s1(p0: v3, p1: v30)
    v4.p0 = v43
    let v46: [Double] = v11[0]
    let v57: Double = v1 / v25
    v15 = v46
    let v50: s1 = v28.p0
    v4.p0 = v50
    v25 = v24
    v15[0] = v23
    let v67: s4 = s4(p0: v57, p1: v14)
    let v92: Double = v67.p0
    return v92
  }
  func benchmark() {
    let v0: s2 = s2(p0: s1(p0: [[s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])]], p1: s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])), p1: [[8.0], [9.0], [10.0]])
    let v1: Double = 11.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 11.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
