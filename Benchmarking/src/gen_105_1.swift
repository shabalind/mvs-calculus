  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
    var p2: s0
  }
  struct s2 {
    var p0: s0
    var p1: [[s0]]
    var p2: [s1]
  }
  func f38(_ v0: s0) -> s0 {
    var v4: s0 = v0
    var v6: s0 = v0
    let v7: [s0] = [v6, v0, v4, v6]
    let v8: s0 = v7[3]
    let v1: s0 = v7[2]
    var v9: [s0] = v7
    let v11: s0 = v9[0]
    v9[1] = v1
    let v5: [[Double]] = v6.p0
    let v14: [[Double]] = v1.p0
    var v17: [[Double]] = v14
    v17 = v14
    v6.p0 = v17
    let v26: [[Double]] = v8.p1
    v4.p1 = v26
    v6.p0 = v5
    v9[3] = v8
    return v11
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: Double) -> Double {
    let v3: s0 = v0.p0
    var v6: Double = v1
    var v11: s2 = v0
    let v10: s0 = f38(v3)
    let v15: s0 = v11.p0
    let v14: s0 = f38(v10)
    let v23: [[Double]] = v15.p1
    let v31: [Double] = v23[0]
    let v47: Double = v31[0]
    var v45: Double = v6
    var v54: Double = v45
    let v130: Double = v54 / v54
    v11.p0 = v14
    let v185: Double = v47 + v130
    return v185
  }
  func benchmark() {
    let v0: s2 = s2(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])]], p2: [s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: [s0(p0: [[9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0]], p1: [[13.0], [14.0]])], p2: s0(p0: [[15.0]], p1: [[16.0], [17.0]]))])
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
