  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [[s0]]
    var p2: s0
  }
  func f39(_ v0: s1, _ v1: s0) -> s0 {
    var v3: s0 = v1
    let v6: [[Double]] = v3.p0
    let v4: [[Double]] = v3.p1
    v3.p0 = v6
    v3 = v1
    let v30: [[Double]] = v1.p1
    v3.p0 = v4
    let v11: [[s0]] = v0.p1
    let v22: [s0] = v11[0]
    let v21: s0 = v22[0]
    let v23: [[Double]] = v21.p0
    v3.p0 = v30
    let v20: [[Double]] = v3.p1
    var v60: s0 = v21
    v60.p1 = v23
    v60.p0 = v20
    return v60
  }
  func f27(_ v0: s1, _ v1: s1) -> s1 {
    let v7: [[s0]] = v1.p1
    let v2: [s0] = v7[0]
    var v18: [[s0]] = v7
    var v12: [[s0]] = v18
    v18[0] = v2
    let v13: [s0] = v18[0]
    var v30: s1 = v1
    let v22: s0 = v13[0]
    v30.p2 = v22
    v30.p1 = v12
    return v30
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: Double) -> Double {
    let v7: s1 = f27(v0, v0)
    let v2: [[s0]] = v7.p1
    let v5: [s0] = v2[0]
    let v9: Double = v1 - v1
    var v10: Double = v1
    let v18: [Double] = [v10, v10, v10, v1, v9]
    let v20: s0 = v0.p2
    let v19: s0 = v5[0]
    let v25: [[Double]] = v19.p0
    let v22: s0 = f39(v7, v20)
    let v53: [[Double]] = v22.p0
    let v73: Double = v18[3]
    var v83: [[Double]] = v25
    let v52: [Double] = v83[2]
    let v150: Double = v73 + v1
    let v147: Double = v52[0]
    v83[2] = v52
    v83[0] = v52
    let v141: [Double] = v53[1]
    let v151: Double = v141[0]
    let v131: Double = v151 * v9
    let v164: [Double] = [v131, v150, v131, v147, v9, v131, v10]
    let v145: Double = v164[1]
    return v145
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), p1: [[s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]], p2: s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]))
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
