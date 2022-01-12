  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s5 {
    var p0: s1
    var p1: s1
  }
  func f120(_ v0: s1) -> s1 {
    let v7: [s1] = [v0, v0, v0, v0, v0, v0]
    let v5: s1 = v7[4]
    let v1: s1 = v7[0]
    let v13: s0 = v5.p1
    let v33: s1 = s1(p0: v13, p1: v13)
    let v38: s5 = s5(p0: v33, p1: v1)
    let v71: s1 = v38.p0
    return v71
  }
  func f46(_ v0: s1) -> s1 {
    var v7: s1 = v0
    var v4: s1 = v7
    let v3: s1 = f120(v4)
    var v1: s1 = v3
    return v1
  }
  func f25(_ v0: [[s1]]) -> [[s1]] {
    var v3: [[s1]] = v0
    let v6: [s1] = v0[0]
    v3 = v0
    var v2: [s1] = v6
    let v4: s1 = v6[0]
    v3[0] = v2
    let v7: s0 = v4.p0
    let v9: s1 = s1(p0: v7, p1: v7)
    let v1: [s1] = v3[0]
    let v13: s1 = f46(v9)
    v2[0] = v13
    v2[0] = v4
    v3[0] = v1
    var v20: [[s1]] = v0
    v20[1] = v1
    v2[0] = v4
    return v20
  }
  @inline(never)
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v3: [[s1]] = f25(v0)
    let v5: [s1] = v3[0]
    let v12: s1 = v5[0]
    let v20: s0 = v12.p0
    let v29: [[Double]] = v20.p0
    let v31: [[Double]] = v20.p1
    let v27: [Double] = v31[0]
    let v47: Double = v27[0]
    let v62: [Double] = v29[0]
    var v55: [[Double]] = v31
    let v78: Double = v1 / v47
    let v149: [Double] = v55[1]
    let v46: Double = v149[0]
    v55 = v31
    v55[1] = v62
    var v102: Double = v46
    let v83: Double = v102 + v102
    let v93: Double = v78 - v83
    return v93
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: s0(p0: [[0.0]], p1: [[1.0], [2.0]]), p1: s0(p0: [[3.0]], p1: [[4.0], [5.0]]))], [s1(p0: s0(p0: [[6.0]], p1: [[7.0], [8.0]]), p1: s0(p0: [[9.0]], p1: [[10.0], [11.0]]))]]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
