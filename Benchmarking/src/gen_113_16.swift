  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  struct s2 {
    var p0: [s0]
    var p1: s1
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [s1], _ v2: Double) -> Double {
    let v5: s1 = v1[0]
    let v9: [s0] = v5.p1
    let v10: s0 = v9[0]
    var v4: Double = v2
    let v11: [[Double]] = v10.p1
    var v8: [[Double]] = v11
    var v12: [[Double]] = v8
    let v13: [Double] = v12[0]
    let v35: Double = v13[0]
    let v34: [[Double]] = v10.p1
    v8 = v34
    let v53: Double = v35 - v4
    return v53
  }
  func benchmark() {
    let v0: s2 = s2(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]]), s0(p0: [[3.0], [4.0]], p1: [[5.0]])], p1: s1(p0: s0(p0: [[6.0], [7.0]], p1: [[8.0]]), p1: [s0(p0: [[9.0], [10.0]], p1: [[11.0]])]))
    let v1: [s1] = [s1(p0: s0(p0: [[12.0], [13.0]], p1: [[14.0]]), p1: [s0(p0: [[15.0], [16.0]], p1: [[17.0]])])]
    let v2: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
